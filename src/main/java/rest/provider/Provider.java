package rest.provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.renameme.RenameMeRepository;
import entities.renameme.TestingFromBranch;
import facades.FacadeExample;
import facades.TestingFromBranchFacade;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utils.EMF_Creator;

@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public abstract class Provider implements RestProvider {

    protected static ParentRepository REPO;
    protected static Gson GSON;

    static {
        REPO = createRepository();
        GSON = new GsonBuilder().setPrettyPrinting().create();
    }

    //Whenever a new repository is created add it here
    private static ParentRepository createRepository() {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();

        RenameMeRepository renameMeRepository = FacadeExample.getInstance(emf);
        TestingFromBranch testingFromBranch = TestingFromBranchFacade.getInstance(emf);

        return new ParentRepository(
            renameMeRepository,
            testingFromBranch
        );
    }
}

