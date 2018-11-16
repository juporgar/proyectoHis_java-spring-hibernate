package com.geekshubsacademy.proyectocrudjava.domain.services.impl;

import com.geekshubsacademy.proyectocrudjava.domain.dao.IPacienteDao;
import com.geekshubsacademy.proyectocrudjava.domain.entities.Pacientes;
import com.geekshubsacademy.proyectocrudjava.domain.services.IPacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service /*Para indicarle de que es un servicio y podemos inyectarlo donde queramos*/
public class IPacienteServiceImpl implements IPacientesService {

    /*Implementamos la interfaz Dao que es la que nos da todos los accesos/metodos*/
    @Autowired
    private IPacienteDao pacienteDao;

    @Override
    @Transactional(readOnly = true) /*Para indicar que es un elemento transacional*/
    public List<Pacientes> findAll() {
        return (List<Pacientes>)pacienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Pacientes paciente) {
        pacienteDao.save(paciente);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pacientes> findOne(Long id) {
        return pacienteDao.findById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        pacienteDao.deleteById(id);
    }
}