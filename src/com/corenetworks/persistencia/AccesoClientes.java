package com.corenetworks.persistencia;

import com.corenetworks.modelo.Customers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoClientes extends Conexion{
    public List<Customers> obtenerTodos() throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "SELECT customer_id, company_name, contact_name FROM customers;";
        List<Customers> c1 = new ArrayList<>();

        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);
        while(resultado.next()){
            c1.add(new Customers(
                    resultado.getString("customer_id"),
                    resultado.getString("company_name"),
                    resultado.getString("contact_name")
            ));
        }
        return c1;
    }
    public Customers obtenerUno(String id) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        ResultSet resultado;
        String sql = "SELECT * FROM customers WHERE customer_id = ?";

        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, id);

        resultado = sentencia.executeQuery();

        if(resultado.next()){

            return  new Customers(
                    resultado.getString("customer_id"),
                    resultado.getString("company_name"),
                    resultado.getString("contact_name")
            );
        }
        return null;
    }
    public boolean insertarUno(Customers c1) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "INSERT INTO customers(customer_id, company_name, contact_name) VALUES(?, ?, ?)";

        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, c1.getCustomer_id());
        sentencia.setString(2, c1.getCompany_name());
        sentencia.setString(3, c1.getContact_name());

        resultado = sentencia.executeUpdate();

        return resultado > 0;
    }
    public boolean eliminarUno(String id) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado = 0;
        abrirConexion();
        String sql = "DELETE FROM customers WHERE customer_id = ?";

        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, "WKLSR");

        resultado = sentencia.executeUpdate();
        return resultado > 0;
    }
    public boolean actualizarEmpresa(Customers c1) throws SQLException, ClassNotFoundException {
        System.out.println(c1.toString());
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "UPDATE customers SET company_name = ? WHERE customer_id = ?";
        abrirConexion();

        sentencia = miConexion.prepareStatement(sql);
        sentencia.setString(1, c1.getCompany_name());

        sentencia.setString(2, c1.getCustomer_id());

        resultado = sentencia.executeUpdate();
        return resultado > 0;
    }
}
