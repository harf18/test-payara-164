package fr.lescrous.test.rest.internal;

import fr.lescrous.test.rest.config.JWTAuthFilter;
import fr.lescrous.test.rest.config.JacksonFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/internal/v1")
public class InternalApiConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(JacksonFeature.class);
        resources.add(JWTAuthFilter.class);
        resources.add(UserRest.class);
        return resources;
    }


}