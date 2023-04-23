package br.com.consulta.fipe.controller;

import br.com.consulta.fipe.client.FipeClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/modelYears")
public class YearsController extends AbstractController {

    @Inject
    @RestClient
    FipeClient client;

    @GET
    public Response listModelYears() {
        return Response.ok(
                client.getAllModelYears()
        ).build();
    }
}
