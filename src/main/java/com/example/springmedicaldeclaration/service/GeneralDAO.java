package com.example.springmedicaldeclaration.service;

import java.util.List;

public interface GeneralDAO<E> {
    List<E> findAll();
    void insertFrom(E entity);
}
