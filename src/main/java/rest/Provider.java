package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.renameme.RenameMeRepository;
import facades.FacadeExample;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

public class Provider {

    public static Repository repo;
    public static Gson gson;

    static {
        repo = createRepository();
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    private static Repository createRepository() {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();

        RenameMeRepository renameMeRepository = FacadeExample.getFacadeExample(emf);

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