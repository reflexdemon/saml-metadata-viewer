package io.vpv.saml;

import io.micronaut.context.annotation.Factory;
import io.vpv.saml.metadata.service.MetaDataParser;
import io.vpv.saml.metadata.service.MetaDataParserImpl;

import javax.inject.Singleton;

@Factory
public class BeanFactory {
    @Singleton
    public MetaDataParser getMetaDataParser() {
        return new MetaDataParserImpl();
    }
}
