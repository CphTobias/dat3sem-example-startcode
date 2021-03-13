package facades;

import entities.renameme.TestingFromBranch;
import javax.persistence.EntityManagerFactory;

public class TestingFromBranchFacade implements TestingFromBranch {

    private static TestingFromBranchFacade instance;
    private static EntityManagerFactory emf;

    private TestingFromBranchFacade() {
    }

    public static TestingFromBranchFacade getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new TestingFromBranchFacade();
        }
        return instance;
    }

    @Override
    public String testing() {
        //TODO (tz): implement this!
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}