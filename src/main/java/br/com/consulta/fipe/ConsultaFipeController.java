package br.com.consulta.fipe;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/consulta")
public class ConsultaFipeController {


    @GET
    public Response testDaBatata(){

     return Response.ok().build();
    }

}
