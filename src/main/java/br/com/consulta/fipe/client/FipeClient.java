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
    List<Models> getAllBrands();

    @GET
    @Path("carros/marcas/{idFabricante}/modelos")
    Vehicle getAllVehicle(@PathParam("idFabricante") Integer id);

    @GET
    @Path("carros/marcas/{idFabricante}/modelos/{idModelo}/anos")
    List<Years> getAllVeiYears(@PathParam("idFabricante") Integer idFabricante, @PathParam("idModelo") Integer idModelo);

}
