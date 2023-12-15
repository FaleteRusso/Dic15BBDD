package com.corenetworks.prueba;

import com.corenetworks.modelo.Customers;
import com.corenetworks.modelo.Customers;
import com.corenetworks.persistencia.AccesoClientes;

import java.sql.SQLException;

public class ProbarClientes {
    public static void main(String[] args) {
        AccesoClientes ac1 = new AccesoClientes();
        Customers c1 = new Customers("ANDOR", "CORE_NETWORKS", "JOHN");
        Customers c2 = new Customers("ANDOR", "NETWORKS_CORE", "JOHN");
        // Obtener todos
        // System.out.println(ac1.obtenerTodos());
        // Obtener uno
        // System.out.println(ac1.obtenerUno("ANTON"));
        // Insertar uno
        // System.out.println(ac1.insertarUno(c1));
        // Eliminar uno
        //System.out.println(ac1.eliminarUno("ANDOR"));
        // Actualizar nombre
        // System.out.println(ac1.actualizarNombre(c2));
    }
}
