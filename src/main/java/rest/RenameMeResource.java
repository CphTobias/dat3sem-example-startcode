package rest;

import dtos.RenameMeDTO;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import rest.provider.Provider;

//Todo Remove or change relevant parts before ACTUAL use
//Consumes and produces are provided by the provider
@Path("xxx")
public class RenameMeResource extends Provider {

    @GET
    @Path("count")
    public String getRenameMeCount() {
        long count = REPO.getRenameMeRepo().getRenameMeCount();
        //System.out.println("--------------->"+count);
        return "{\"count\":" + count + "}";  //Done manually so no need for a DTO
    }

    @Override
    public Response getById(int id) {
        RenameMeDTO renameMeDTO = REPO.getRenameMeRepo().getById(id);
        return Response.ok(GSON.toJson(renameMeDTO)).build();
    }

    @Override
    public Response delete(int id) {
        //TODO (tz): implement this!
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    @Override
    public Response getAll() {
        List<RenameMeDTO> renameMeDTO = REPO.getRenameMeRepo().getAll();
        return Response.ok(GSON.toJson(renameMeDTO)).build();
    }
}
