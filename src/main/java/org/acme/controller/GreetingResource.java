package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.domain.data.dto.request.RequestDto;
import org.acme.domain.data.dto.response.ResponseDto;
import org.acme.domain.ports.RecursionServicePort;
import java.util.logging.Logger;
//Equilatero,isoceles,escaleno
@Path("/hello")
public class GreetingResource {
    @Inject
    RecursionServicePort recursionServicePort;

    private static final Logger LOG = Logger.getLogger(String.valueOf(GreetingResource.class));
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus RESTosan";
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseDto triangle(RequestDto requestDto) {
            LOG.info("Received request: " + requestDto);
        return recursionServicePort.eval(requestDto);
    }
}