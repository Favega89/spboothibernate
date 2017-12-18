package com.project.project.Dao;

import java.util.List;

/**
 * Created by idra on 13/12/2017.
 */
public interface IDao <O,I,S>{

    List<O> getAll();
    List<O> getByString(S atribute);
    O getById(I id);
    void add(O object);
    void update(O object);

}
