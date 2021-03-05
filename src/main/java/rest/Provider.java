package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.renameme.RenameMeRepository;
import facades.FacadeExample;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

public class Provider {

    public static ParentRepository REPO;
    public static Gson GSON;

    static {
        REPO = createRepository();
        GSON = new GsonBuilder().setPrettyPrinting().create();
    }

    //Whenever a new repository is created add it here
    private static ParentRepository createRepository() {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();

        RenameMeRepository renameMeRepository = FacadeExample.getFacadeExample(emf);

        return new ParentRepository(
            renameMeRepository
        );
    }
}

//Whenever a new repository is created add it here
class ParentRepository {

    private final RenameMeRepository renameMeRepository;

    ParentRepository(RenameMeRepository renameMeRepository) {
        this.renameMeRepository = renameMeRepository;
    }

    public RenameMeRepository getRenameMeRepo() {
        return renameMeRepository;
    }
}