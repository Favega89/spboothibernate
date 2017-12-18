package com.project.project.Service;

import com.project.project.Dao.DaoClient;
import com.project.project.Dao.IDao;
import com.project.project.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by idra on 13/12/2017.
 */
@Service
public class ClientService implements IClientService <Client,Integer,String> {

    @Autowired
    private DaoClient daocliente;

    @Override
    public List<Client> getAll() {
        return daocliente.getAll();
    }

    @Override
    public List<Client> getByString(String atribute) {
        return daocliente.getByString(atribute);
    }

    @Override
    public Client getById(Integer id) {
        return daocliente.getById(id);
    }

    @Override
    public void add(Client object) {
        daocliente.add(object);
    }

    @Override
    public void update(Client object) {
        daocliente.update(object);
    }
}
