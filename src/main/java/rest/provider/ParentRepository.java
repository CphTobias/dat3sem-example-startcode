package rest.provider;

import entities.renameme.RenameMeRepository;
import entities.renameme.TestingFromBranch;

//Whenever a new repository is created add it here
public class ParentRepository {

    private final RenameMeRepository renameMeRepo;
    private final TestingFromBranch testingFromBranch;

    ParentRepository(RenameMeRepository renameMeRepository,
        TestingFromBranch testingFromBranch) {
        this.renameMeRepo = renameMeRepository;
        this.testingFromBranch = testingFromBranch;
    }

    public RenameMeRepository getRenameMeRepo() {
        return renameMeRepo;
    }

    public TestingFromBranch getTestingFromBranch() {
        return testingFromBranch;
    }
}
