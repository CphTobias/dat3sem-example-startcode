package entities.renameme;

import dtos.RenameMeDTO;
import java.util.List;

public interface RenameMeRepository {

    void create(RenameMeDTO rm);

    RenameMeDTO getById(long id);

    long getRenameMeCount();

    List<RenameMeDTO> getAll();

}
