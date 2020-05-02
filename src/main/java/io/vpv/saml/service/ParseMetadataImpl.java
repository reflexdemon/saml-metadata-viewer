package io.vpv.saml.service;

import io.vpv.saml.metadata.model.IDPMetaData;
import io.vpv.saml.metadata.service.MetaDataParser;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;

public class ParseMetadataImpl implements ParseMetadata {
    @Inject
    private MetaDataParser metaDataParser;

    @Override
    public IDPMetaData getIDPMetaData(URL url) throws IOException {
        return metaDataParser.parseIDPMetaData(url);
    }
}
