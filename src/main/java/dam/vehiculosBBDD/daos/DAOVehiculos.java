/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.vehiculosBBDD.daos;

import dam.vehiculosBBDD.bbdd.ConexionBD;
import dam.vehiculosBBDD.clases.Vehiculo;
import dam.vehiculosBBDD.interfaces.IDAOVehiculos;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dam
 */
public class DAOVehiculos implements IDAOVehiculos {

    private List<Vehiculo> falsaBD;
    private static DAOVehiculos dao = null;

    private DAOVehiculos() {
        super();
        this.falsaBD = ConexionBD.getVehiculos();
    }

    @Override
    public int insertarVehiculo(Vehiculo vehiculo) {
        ConexionBD.insertarVehiculo(vehiculo);
        this.falsaBD = ConexionBD.getVehiculos();

        return 1;
    }

    @Override
    public int eliminarVehiculo(String matricula) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int eliminarVehiculos(List<Vehiculo> lstVehiculos) {
        for (int i = 0; i < lstVehiculos.size(); i++) {
            ConexionBD.eliminarVehiculo(lstVehiculos.get(i));
        }
        this.falsaBD = ConexionBD.getVehiculos();
        
        return 0;
    }

    @Override
    public Vehiculo getVehiculo(String matricula) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Vehiculo> getVehiculos() {
        // TODO Auto-generated method stub
        return this.falsaBD;
    }

    public static DAOVehiculos getInstance() {
        if (dao == null) {
            dao = new DAOVehiculos();
        }

        return dao;
    }

    @Override
    public int eliminarVehiculo(Vehiculo vehiculo) {
        ConexionBD.eliminarVehiculo(vehiculo);
        this.falsaBD = ConexionBD.getVehiculos();
        
        return 0;
    }
    
    public Boolean existeVehiculo(String matricula) {
        Boolean existe = false;
        
        if (ConexionBD.obtenerVehiculo(matricula) != null) {
            existe = true;
        }
        
        return existe;
    }
    
    public void editarVehiculo(Vehiculo vehiculoAEditar, String marca, String modelo, String matricula) {
        ConexionBD.editarVehiculo(vehiculoAEditar, marca, modelo, matricula);
        this.falsaBD = ConexionBD.getVehiculos();
    }
}