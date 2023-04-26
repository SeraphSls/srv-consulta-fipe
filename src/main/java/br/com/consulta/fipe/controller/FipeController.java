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

    //Lista todas as marcas
    @GET
    public Response listBrands() {
        return Response.ok(
                client.getAllBrands()
        ).build();
    }


    //traz todos os modelos de carros de uma fabricante especifica
    @GET
    @Path("allModels/{idFabricante}")
    public Response listAllModels(@PathParam("idFabricante") Integer id) {
        return Response.ok(client.getAllVehicle(id)).build();
    }


    //traz os dados de um modelo de fabricante especifica
    @GET
    @Path("allModelsYears/{idFabricante}/{idModelo}")
    public Response listAllModelsYears(@PathParam("idFabricante") Integer idFabricante, @PathParam("idModelo") Integer idModelo) {
        return Response.ok(client.getAllVehiclesYears(idFabricante, idModelo)).build();
    }

}
