package com.patil.ecommerce;

import com.patil.ecommerce.restclient.RestProduct;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class ExampleResource {

    @RestClient
    RestProduct restProduct;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello payment-service I hit " + restProduct.helloProductService();
    }
}
