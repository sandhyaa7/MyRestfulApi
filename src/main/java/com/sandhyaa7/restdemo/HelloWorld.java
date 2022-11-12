package com.sandhyaa7.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("/greetings")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{param}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces(MediaType.TEXT_HTML)
    public Response getMessage(@PathParam("param")String msg) {
        // Return a simple message
        String output = "<h3>Hello " + msg + ". Welcome to this world.</h3>";
        return Response.status(200).entity(output).build();
    }
}
