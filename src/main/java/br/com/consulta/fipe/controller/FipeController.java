package br.com.consulta.fipe.controller;


import br.com.consulta.fipe.client.FipeClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/consult")
public class FipeController extends AbstractController {

    @Inject
    @RestClient
    FipeClient client;

    @GET
    public Response listBrands() {
        return Response.ok(
                client.getAllBrands()
        ).build();
    }

    @GET
    @Path("allModels/{idFabricante}")
    public Response listAllModels(@PathParam("idFabricante") Integer id) {
        return Response.ok(client.getAllVehicle(id)).build();
    }

}
