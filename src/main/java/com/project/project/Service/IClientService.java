package com.project.project.Service;

import java.util.List;

/**
 * Created by idra on 14/12/2017.
 */
public interface IClientService<O,I,S> {
    List<O> getAll();
    List<O> getByString(S atribute);
    O getById(I id);
    void add(O object);
    void update(O object);
}
