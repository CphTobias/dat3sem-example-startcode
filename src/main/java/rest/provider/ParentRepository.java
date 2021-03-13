package rest.provider;

import entities.renameme.RenameMeRepository;

import entities.renameme.TestingFromBranch;
import entities.renameme.TestRepository;

//Whenever a new repository is created add it here
public class ParentRepository {

    private final RenameMeRepository renameMeRepo;
    private final TestingFromBranch testingFromBranch;
    private final TestRepository testRepo;

    ParentRepository(RenameMeRepository renameMeRepository, TestRepository testRepository, TestingFromBranch testingFromBranch) {
        this.renameMeRepo = renameMeRepository;
        this.testRepo = testRepository;
        this.testingFromBranch = testingFromBranch;
    }

    public RenameMeRepository getRenameMeRepo() {
        return renameMeRepo;
    }

    public TestingFromBranch getTestingFromBranch() {
        return testingFromBranch;
    } 

    public TestRepository getTestRepo() {
        return testRepo;
    }
}
