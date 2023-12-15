package com.corenetworks.prueba;

import com.corenetworks.modelo.Customers;
import com.corenetworks.modelo.Customers;
import com.corenetworks.persistencia.AccesoClientes;

import java.sql.SQLException;

public class ProbarClientes {
    public static void main(String[] args) {
        AccesoClientes ac1 = new AccesoClientes();
        Customers c1 = new Customers("WKLST", "JOSE MARI", "MARAVILLAS");
        Customers c2 = new Customers("WKLST", "JOSE MARI", "outkas");

        // Obtener todos
      /* try {
            System.out.println(ac1.obtenerTodos());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Obtener uno
        try {
            System.out.println(ac1.obtenerUno("ANTON"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }






        // Insertar uno
        try {
            System.out.println(ac1.insertarUno(c1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

       */
        // Eliminar uno
        try {
            System.out.println(ac1.eliminarUno("WKLSR"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

       /*

        // Actualizar empresa
        try {
            System.out.println(ac1.actualizarEmpresa(c2));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        */
    }
}
