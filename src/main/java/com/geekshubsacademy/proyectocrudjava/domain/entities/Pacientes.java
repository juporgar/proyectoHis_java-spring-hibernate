package com.geekshubsacademy.proyectocrudjava.domain.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;



@Entity /*Para que lo considere como  una entidad*/
@Table(name="pacientes")/*Decirle que tabla va a mapear*/
public class Pacientes implements Serializable {

    private static final long serialVersionUID=1L;

    @Id /*Le indicamos de que es el id*/
    @GeneratedValue(strategy= GenerationType.IDENTITY) /*Para decirle que se genere automaticamente*/
    private Long id;

    @NotEmpty
    private String historiaClinica;
    @NotEmpty /*Para indicar que es campo obligatorio*/
    private String nombre;
    @NotEmpty
    private String apellido;

    @NotNull
    @Column(name="createdAt")/*Indicamos el nombre de la columna*/
    @Temporal(TemporalType.DATE)/*Indicamos que es tipo fecha*/
    @DateTimeFormat(pattern = "yyyy-MM-dd") /*Indicamos que formato tendrá*/
    private Date createdAt;

    public Pacientes() {
    }

    public Pacientes(@NotEmpty String historiaClinica, @NotEmpty String nombre, @NotEmpty String apellido, @NotNull Date createdAt) {
        this.historiaClinica = historiaClinica;
        this.nombre = nombre;
        this.apellido = apellido;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /*Creamos el toString para permitir para no devolver el nombre de la estancia */
    @Override
    public String toString() {
        return "Pacientes{" +
                "id=" + id +
                ", historiaClinica='" + historiaClinica + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
