package com.codegym.repository;


import com.codegym.model.Receptionist;

import java.util.ArrayList;
import java.util.List;

public class ReceptionistRepository implements GeneralRepository<Receptionist> {
    private List<Receptionist> receptionistList = new ArrayList<>();

    @Override
    public List<Receptionist> findAll() {
        return receptionistList;
    }

    @Override
    public Receptionist findById(int id) {
        for (int i = 0; i < receptionistList.size(); i++) {
            if (receptionistList.get(i).getId() == id)
                return receptionistList.get(i);
        }
        return null;
    }

    @Override
    public void addReceptionist(Receptionist receptionist) {
        receptionistList.add(receptionist);


    }

    @Override
    public void updateReceptionist(int id, Receptionist receptionist) {
        int index = -1;
        for (int i = 0; i < receptionistList.size(); i++) {
            if (receptionistList.get(i).getId() == id) ;
            index = i;
            break;
        }
        receptionistList.set(index, receptionist);
    }

    @Override
    public void removeReceptionist(int id) {
        for (int i = 0; i < receptionistList.size(); i++) {
            if (receptionistList.get(i).getId() == id) {
                receptionistList.remove(i);
                return;
            }
        }

    }

    @Override
    public List<Receptionist> findByName(String name) {
        List<Receptionist> receptionists = new ArrayList<>();
        for (int i = 0; i < receptionistList.size(); i++) {
            if (receptionistList.get(i).getName().contains(name)) {
                receptionists.add(receptionistList.get(i));
            }
        }
        return receptionists;
    }
}
