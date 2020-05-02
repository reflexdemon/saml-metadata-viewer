package io.vpv.saml;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.vpv.saml.metadata.service.MetaDataParser;
import io.vpv.saml.metadata.service.MetaDataParserImpl;

@Factory
public class BeanFactory {
    @Bean
    public MetaDataParser getMetaDataParser() {
        return new MetaDataParserImpl();
    }
}
