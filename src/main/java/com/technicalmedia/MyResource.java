package com.technicalmedia;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.*;

/**
 * Created by marom on 27/09/16.
 */
@Path("myresource")
@Api(tags = {"myresource"})
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return "{ \"message\": \"Got it!\" }";
    }
}
