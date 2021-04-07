package entities.renameme;

import dtos.DTOEntity;
import dtos.RenameMeDTO;
import java.util.List;
import javax.ws.rs.WebApplicationException;

public interface RenameMeRepository {

    DTOEntity create(RenameMeDTO rm) throws WebApplicationException;

    DTOEntity getById(long id) throws WebApplicationException;

    long getRenameMeCount() throws WebApplicationException;

    List<DTOEntity> getAll() throws  WebApplicationException;

}
