package fr.lescrous.test.rest.internal;

import fr.lescrous.test.model.User;
import fr.lescrous.test.rest.config.Permit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UserRest  {


    @GET
    @Permit
    public Response getListUser(@Context HttpHeaders httpHeaders, @Context final HttpServletResponse response, @Context final HttpServletRequest request){

        User u = new User();

        return Response.ok(u).build();


    }





}

