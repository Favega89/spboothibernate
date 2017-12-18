package com.project.project.Dao;

import java.util.List;
import com.project.project.Entities.Client;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by idra on 13/12/2017.
 */
@Transactional
@Repository
public class DaoClient implements IDao<Client,Integer,String>{

    @PersistenceContext
    public EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Client> getAll() {
        String qr = "FROM Cliente as C ORDER BY C.ID_USUARIO";
        return (List<Client>) entityManager.createQuery(qr).getResultList();
    }

    @Override
    public List<Client> getByString(String atribute) {
        String qr = "Select * from Cliente where LASTNAME = " + atribute;
        return (List<Client>) entityManager.createQuery(qr).getResultList();
    }

    @Override
    public Client getById(Integer id) {
        return entityManager.find(Client.class, id);
    }

    @Override
    public void add(Client object) {
        entityManager.persist(object);
    }

    @Override
    public void update(Client object) {
        Client c = getById(object.getId());
        c.setActive(object.getIsActive());
        c.setAdress(object.getAdress());
        c.setBirthday(object.getBirthday());
        c.setBloodtype(object.getBloodType());
        c.setEmail(object.getEmail());
        c.setFirstClassDate(object.getFirstClassDate());
        c.setIdRate(object.getIdRate());
        c.setLastClassDate(object.getLastClassDate());
        c.setLastname(object.getLastname());
        c.setName(object.getName());
        c.setPhoneNumber(object.getPhoneNumber());
    }
}
