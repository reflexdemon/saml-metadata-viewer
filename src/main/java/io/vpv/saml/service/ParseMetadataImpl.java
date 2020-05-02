package io.vpv.saml.service;

import io.vpv.saml.metadata.model.IDPMetaData;
import io.vpv.saml.metadata.service.MetaDataParser;
import io.vpv.saml.metadata.service.MetaDataParserImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.io.IOException;
import java.net.URL;

@Singleton
public class ParseMetadataImpl implements ParseMetadata {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private MetaDataParser metaDataParser;

    public ParseMetadataImpl() {
    }

    @PostConstruct
    public void initialize() {
        this.metaDataParser = new MetaDataParserImpl();
    }

    @Override
    public IDPMetaData getIDPMetaData(URL url) throws IOException {
        logger.info("Parsing {}", url);
        logger.info("metaDataParser {}", metaDataParser);
        return metaDataParser.parseIDPMetaData(url);
    }
}
