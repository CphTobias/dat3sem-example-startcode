package rest.provider;

import entities.renameme.RenameMeRepository;
import entities.renameme.TestRepository;

//Whenever a new repository is created add it here
public class ParentRepository {

    private final RenameMeRepository renameMeRepo;
    private final TestRepository testRepo;

    ParentRepository(RenameMeRepository renameMeRepository, TestRepository testRepository) {
        this.renameMeRepo = renameMeRepository;
        this.testRepo = testRepository;
    }

    public RenameMeRepository getRenameMeRepo() {
        return renameMeRepo;
    }

    public TestRepository getTestRepo() {
        return testRepo;
    }
}
