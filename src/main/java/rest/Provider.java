package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.renameme.RenameMeRepository;
import facades.FacadeExample;
import utils.EMF_Creator;

public class Provider {

    public static Repository repo;
    public static Gson gson;

    static {
        repo = createRepository();
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    private static Repository createRepository() {
        RenameMeRepository renameMeRepository = FacadeExample
            .getFacadeExample(EMF_Creator.createEntityManagerFactory());

        return new Repository(
            renameMeRepository
        );
    }
}

class Repository {

    private final RenameMeRepository renameMeRepository;

    Repository(RenameMeRepository renameMeRepository) {
        this.renameMeRepository = renameMeRepository;
    }

    public RenameMeRepository getRenameMeRepo() {
        return renameMeRepository;
    }
}
