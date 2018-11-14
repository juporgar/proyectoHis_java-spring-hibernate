package com.geekshubsacademy.proyectocrudjava.domain.dao;

import com.geekshubsacademy.proyectocrudjava.domain.entities.Pacientes;
import org.springframework.data.repository.CrudRepository;

/*Aquí inyectamos todos los metodos necesarios para hacer funcional el crud*/

public interface IPacienteDao extends CrudRepository <Pacientes, Long> {

}
