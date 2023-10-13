package com.pablohdzvizcarra.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/process")
public class UrlShortenerController {

    @GET
    public String urlShortener() {
        return "Ok";
    }

}
