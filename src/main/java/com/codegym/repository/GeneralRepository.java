package com.codegym.repository;

import java.util.List;

public interface GeneralRepository<T> {
    List<T> findAll();

    T findById(int id);

    void addReceptionist(T receptionist);

    void updateReceptionist(int id, T receptionist);

    void removeReceptionist(int id);

    List<T> findByName(String name);
}
