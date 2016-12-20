package fr.lescrous.test.rest.external;

import fr.lescrous.test.rest.config.JWTAuthFilter;
import fr.lescrous.test.rest.config.JacksonFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/v1")
public class ExternalApiConfig extends Application {


    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(JacksonFeature.class);
        resources.add(JWTAuthFilter.class);


        resources.add(StudentsRest.class);





        return resources;
    }
}