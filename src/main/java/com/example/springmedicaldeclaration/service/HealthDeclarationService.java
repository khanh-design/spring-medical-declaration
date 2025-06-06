package com.example.springmedicaldeclaration.service;

import com.example.springmedicaldeclaration.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HealthDeclarationService implements GeneralDAO<Health_declaration> {

    private static final List<Health_declaration> declarations = new ArrayList<>();

    @Override
    public List<Health_declaration> findAll() {
        return declarations;
    }

    @Override
    public void insertFrom(Health_declaration entity) {
        declarations.add(entity);
    }
}
