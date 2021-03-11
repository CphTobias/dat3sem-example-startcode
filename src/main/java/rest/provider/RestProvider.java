package rest.provider;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//Will be implemented whenever you extend the Provider class
public interface RestProvider {

    @GET
    Response getAll();

    @Path("/{id}")
    @GET
    Response getById(@PathParam("id") int id);

    @DELETE
    @Path("/{id}")
    Response delete(@PathParam("id") int id);

}
