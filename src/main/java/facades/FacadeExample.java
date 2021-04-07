package facades;

import dtos.DTOEntity;
import dtos.RenameMeDTO;
import entities.renameme.RenameMe;
import entities.renameme.RenameMeRepository;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.ws.rs.WebApplicationException;
import utils.DtoUtils;

/**
 * Rename Class to a relevant name Add add relevant repository methods
 */
public class FacadeExample implements RenameMeRepository {

    private static FacadeExample instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private FacadeExample() {
    }


    /**
     * @param _emf
     * @return an instance of this repository class.
     */
    public static FacadeExample getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new FacadeExample();
        }
        return instance;
    }

    @Override
    public DTOEntity create(RenameMeDTO rm) throws WebApplicationException {
        RenameMe rme = new RenameMe(rm.getDummyStr1(), rm.getDummyStr2());
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(rme);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return DtoUtils.convertToDto(rme, new RenameMeDTO());
    }

    @Override
    public DTOEntity getById(long id) throws WebApplicationException {
        EntityManager em = emf.createEntityManager();
        RenameMe renameMe = em.find(RenameMe.class, id);
        return DtoUtils.convertToDto(renameMe, new RenameMeDTO());
    }

    @Override
    public long getRenameMeCount() throws WebApplicationException {
        EntityManager em = emf.createEntityManager();
        try {
            long renameMeCount = (long) em.createQuery("SELECT COUNT(r) FROM RenameMe r").getSingleResult();
            return renameMeCount;
        } finally {
            em.close();
        }

    }

    @Override
    public List<DTOEntity> getAll() throws WebApplicationException {
        EntityManager em = emf.createEntityManager();
        TypedQuery<RenameMe> query = em.createQuery("SELECT r FROM RenameMe r", RenameMe.class);
        List<RenameMe> rms = query.getResultList();
        System.out.println(rms);

        return DtoUtils.convertList(rms, new RenameMeDTO());
    }

}
