package fr.lescrous.test.rest.config;

import org.glassfish.jersey.CommonProperties;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;


public class JacksonFeature implements Feature {

    @Override
    public boolean configure( final FeatureContext context ) {

        //String postfix = '.' + context.getConfiguration().getRuntimeType().name().toLowerCase();

        context.property( CommonProperties.MOXY_JSON_FEATURE_DISABLE_SERVER, true );

        //context.register( JsonParseExceptionMapper.class );
        //context.register( JsonMappingExceptionMapper.class );
        //context.register( JacksonJsonProvider.class, MessageBodyReader.class, MessageBodyWriter.class );

        return true;
    }
}
