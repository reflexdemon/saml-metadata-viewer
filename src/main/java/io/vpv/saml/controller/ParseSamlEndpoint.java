package io.vpv.saml.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.vpv.saml.metadata.model.IDPMetaData;
import io.vpv.saml.service.ParseMetadata;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;

@Controller("/api")
public class ParseSamlEndpoint {

    @Inject
    ParseMetadata parseMetadata;

    @Get(produces = MediaType.APPLICATION_JSON)
    public IDPMetaData getIDPMetaData(@QueryValue String endpoint) throws IOException {
        URL url = new URL(endpoint);
        return parseMetadata.getIDPMetaData(url);
    }
}
