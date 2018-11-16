package com.geekshubsacademy.proyectocrudjava.domain.services;

import com.geekshubsacademy.proyectocrudjava.domain.entities.Pacientes;

import java.util.List;
import java.util.Optional;

public interface IPacientesService {
    public List<Pacientes> findAll();
    public void save (Pacientes paciente);
    public Optional<Pacientes> findOne(Long id);
}
