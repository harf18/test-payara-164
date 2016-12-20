package fr.lescrous.test.rest.external;

import fr.lescrous.test.model.Students;
import fr.lescrous.test.rest.config.Permit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Timestamp;
import java.util.Calendar;


@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("/students")
public class StudentsRest {


    @GET
    @Permit
    public Response getItems(@Context final HttpServletResponse response,
                             @Context final HttpServletRequest request) {

        Students s = new Students();
        s.setFirstName("geoffroy");
        s.setBirthDate(new Timestamp(Calendar.getInstance().getTime().getTime()));


        return Response.ok(s).build();


    }



}
