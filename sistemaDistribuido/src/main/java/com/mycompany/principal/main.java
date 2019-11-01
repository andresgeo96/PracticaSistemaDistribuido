/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.principal;

import com.mycompany.entidades.Producto;
import com.mycompany.session.ProductoJpaController;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.internal.jpa.EntityManagerFactoryImpl;

/**
 *
 * @author Aplicaciones D
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Instancia de conexion de la base de datos 
       //crear una instancia para tomar los valores de la cadena de conexion 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("laboratorio");
        //llmar a la clase controladora 
        ProductoJpaController pcj = new ProductoJpaController(emf);
        //llenar datos en la base de datos 
        //clase pojos 
        Producto p = new Producto();
        p.setNombre("mantequilla");
        p.setPrecio(BigDecimal.valueOf(13.78));
        
        pcj.create(p);
        
        
        
    }
    
}
