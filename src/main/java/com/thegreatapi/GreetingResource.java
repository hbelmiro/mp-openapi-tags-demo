package com.thegreatapi;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Tag(name = "tGet1")
    @Tag(name = "tGet2")
    @Tag(name = "tGet3")
    public String hello() {
        return "Hello RESTEasy";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Tag(name = "tPost1")
    @Tag(name = "tPost2")
    @Tag(name = "tPost3")
    public String hello(String name) {
        return "Hello " + name;
    }
}