package com.github.daggerok.app;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import static java.lang.String.format;
import static java.util.Collections.singletonMap;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("")
@ApplicationScoped
@Produces(APPLICATION_JSON)
public class MyResource {

  @GET
  public Response hello() {
    return Response.ok(singletonMap("message", "hello stranger..."))
                   .build();
  }

  @GET
  @Path("{path: .*?}")
  @Consumes(APPLICATION_JSON)
  public Response hello(@PathParam("path") String path) {
    return Response.ok(singletonMap("message", format("hello, %s!", path)))
                   .build();
  }
}
