package rest.provider;

import entities.renameme.RenameMeRepository;

//Whenever a new repository is created add it here
public class ParentRepository {

    private final RenameMeRepository renameMeRepository;

    ParentRepository(RenameMeRepository renameMeRepository) {
        this.renameMeRepository = renameMeRepository;
    }

    public RenameMeRepository getRenameMeRepo() {
        return renameMeRepository;
    }
}
