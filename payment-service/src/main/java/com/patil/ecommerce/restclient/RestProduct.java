package com.patil.ecommerce.restclient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:9001")
//@RegisterRestClient(configKey = "auth-service")
public interface RestProduct {

    @GET
    @Path("/product-service/hello")
    String helloProductService();
}