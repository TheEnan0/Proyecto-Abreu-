package com.example.abreu.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.abreu.Models.Clientes;

import java.util.List;

//objeto Para acceso a datos
@Dao
public interface PacienteDao{

    @Query("SELECT * FROM Paciente")
    List<Clientes> obtenerClientes ();

    @Query("SELECT * FROM  Paciente WHERE cedula=:cedula")
    Clientes  obtenerCliente (String cedula);

    @Insert
    void agregarCliente(Clientes... cliente);

    @Query("DELETE FROM Paciente WHERE cedula=:cedula")
    void eliminarCliente (String cedula );
}
