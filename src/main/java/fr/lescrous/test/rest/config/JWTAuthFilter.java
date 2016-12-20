package fr.lescrous.test.rest.config;


import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class JWTAuthFilter implements ContainerRequestFilter {



    @Context
    private ResourceInfo resourceInfo;


    @Override
    public void filter(ContainerRequestContext requestContext) {

        Permit permit = resourceInfo.getResourceMethod().getAnnotation(Permit.class);

        if (permit!=null){
            return;
        }


        throw new NotAuthorizedException("User not allowed");

    }

}
