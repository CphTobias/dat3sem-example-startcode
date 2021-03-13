package facades;

import entities.renameme.TestRepository;
import javax.persistence.EntityManagerFactory;

public class Tse implements TestRepository {

    private static Tse instance;
    private static EntityManagerFactory emf;

    private Tse() {
    }

    public static Tse getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new Tse();
        }
        return instance;
    }

    @Override
    public String test() {
        //TODO (tz): implement this!
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}