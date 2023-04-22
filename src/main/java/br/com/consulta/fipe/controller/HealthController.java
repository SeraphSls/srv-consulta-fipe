package br.com.consulta.fipe.controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/health")
public class HealthController extends AbstractController {


    @GET
    public Response health() {
        return Response.ok("Application started sucefully").build();
    }

}
