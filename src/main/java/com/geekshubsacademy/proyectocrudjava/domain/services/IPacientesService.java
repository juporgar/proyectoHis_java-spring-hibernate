package com.geekshubsacademy.proyectocrudjava.domain.services;

import com.geekshubsacademy.proyectocrudjava.domain.entities.Pacientes;

import java.util.List;

public interface IPacientesService {
    public List<Pacientes> findAll();
    public void save (Pacientes paciente);
}
