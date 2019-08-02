package com.codegym.service;

import java.util.List;

public interface GeneralService<T> {
    List<T> findAll();

    T findById(int id);

    void addEReceptionist(T receptionist);

    void updateReceptionist(int id, T receptionist);

    void removeReceptionist(int id);

    List<T> findByName(String name);

}
