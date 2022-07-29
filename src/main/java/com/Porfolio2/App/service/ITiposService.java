/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio2.App.service;

import com.Porfolio2.App.model.Tipos_empleo;
import java.util.List;

/**
 *
 * @author Cristian
 */
public interface ITiposService {
    public List<Tipos_empleo> VerTipos();
    public void CrearTipo(Tipos_empleo Tipo);
    public void borrarTipo(Long id);
    public Tipos_empleo buscarTipo(Long id);
}
