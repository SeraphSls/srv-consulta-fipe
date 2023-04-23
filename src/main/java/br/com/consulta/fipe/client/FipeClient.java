package br.com.consulta.fipe.client;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;


@RegisterRestClient
public interface FipeClient {

    @GET
    @Path("/carros/marcas")
    List<Brands> getAllBrands();

    @GET
    @Path("/carros/marcas/59/modelos")
    List<Object> getAllModels();

    @GET
    @Path("/carros/marcas/59/modelos/5940/anos")
    List<ObjectsJson> getAllModelYears();

}
