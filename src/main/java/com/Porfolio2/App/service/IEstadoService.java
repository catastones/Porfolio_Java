/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.service;
import com.Porfolio2.App.model.Estado_carrera;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface IEstadoService {
    public List<Estado_carrera> VerEstados();
    public void CrearEstado(Estado_carrera estado);
    public void borrarEstado(Long id);
    public Estado_carrera buscarEstado(Long id);
}
