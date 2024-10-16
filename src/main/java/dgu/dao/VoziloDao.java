package dgu.dao;

import dgu.database.HibernateUtil;
import dgu.model.Vozilo;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class VoziloDao implements IVoziloDao {

    @Override
    public Vozilo get(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Vozilo vozilo = session.get(Vozilo.class, id);
        session.close();
        return vozilo;
    }

    @Override
    public List<Vozilo> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Vozilo> cq = cb.createQuery(Vozilo.class);
        Root<Vozilo> root = cq.from(Vozilo.class);
        cq.select(root);
        List<Vozilo> vozila = session.createQuery(cq).getResultList();
        session.close();
        return vozila;
    }

    @Override
    public void save(Vozilo vozilo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(vozilo);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Vozilo vozilo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(vozilo);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Vozilo vozilo = session.get(Vozilo.class, id);
        if(vozilo != null) {
            session.remove(vozilo);
        }
        transaction.commit();
        session.close();
    }
}

