package rest;

import dtos.RenameMeDTO;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Todo Remove or change relevant parts before ACTUAL use
@Path("xxx")
@Produces({MediaType.APPLICATION_JSON})
public class RenameMeResource extends Provider {

    @GET
    public String demo() {
        return "{\"msg\":\"Hello World\"}";
    }

    @Path("count")
    @GET
    public String getRenameMeCount() {
        long count = REPO.getRenameMeRepo().getRenameMeCount();
        //System.out.println("--------------->"+count);
        return "{\"count\":" + count + "}";  //Done manually so no need for a DTO
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") int id) {
        RenameMeDTO renameMeDTO = REPO.getRenameMeRepo().getById(id);
        return Response.ok(GSON.toJson(renameMeDTO)).build();
    }

    @GET
    @Path("/all")
    public Response getAll() {
        List<RenameMeDTO> renameMeDTO = REPO.getRenameMeRepo().getAll();
        return Response.ok(GSON.toJson(renameMeDTO)).build();
    }
}
