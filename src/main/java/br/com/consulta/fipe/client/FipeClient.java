package br.com.consulta.fipe.client;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;


@RegisterRestClient
public interface FipeClient {

    @GET
    @Path("/carros/marcas")
    List<Brands> getAllBrands();

    @GET
    @Path("carros/marcas/{idFrabricante}/modelos")
    Vehicle getAllVehicle(@PathParam("idFrabricante") Integer id);

    @GET
    @Path("/carros/marcas/59/modelos/5940/anos")
    Vehicle getAllVeiYears();

}
