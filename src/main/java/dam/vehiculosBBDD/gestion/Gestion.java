/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.vehiculosBBDD.gestion;

import dam.vehiculosBBDD.clases.Vehiculo;
import dam.vehiculosBBDD.daos.DAOVehiculos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dam
 */
public class Gestion {
    private ArrayList<Vehiculo> listaVehiculo;
    
    public Gestion() {
        listaVehiculo = (ArrayList<Vehiculo>) DAOVehiculos.getInstance().getVehiculos();
    }
    
    public Boolean anyadirVehiculo(String marca, String modelo, String matricula) {
        boolean borrado = false;
        
        if (!DAOVehiculos.getInstance().existeVehiculo(matricula)) {
            Vehiculo vehiculo = new Vehiculo(marca, modelo, matricula);

            if (DAOVehiculos.getInstance().insertarVehiculo(vehiculo) != 0) {
                borrado = true;
                listaVehiculo = (ArrayList<Vehiculo>) DAOVehiculos.getInstance().getVehiculos();
            }
        }
        
        return borrado;
    }
    
    public void eliminarVehiculo (String matricula) {
        Vehiculo vehiculo = new Vehiculo(matricula);
        
        DAOVehiculos.getInstance().eliminarVehiculo(vehiculo);
        listaVehiculo = (ArrayList<Vehiculo>) DAOVehiculos.getInstance().getVehiculos();
    }

    public List<Vehiculo> getListaVehiculos() {
        return new ArrayList<Vehiculo>(listaVehiculo);
    }

    public void eliminarVehiculos(List<Vehiculo> vehiculos) {
        DAOVehiculos.getInstance().eliminarVehiculos(vehiculos);
    }

    public Boolean editarVehiculo(Vehiculo vehiculoAEditar, String marca, String modelo, String matricula) {
        Boolean editado = false;
        
        if (!DAOVehiculos.getInstance().existeVehiculo(matricula) || vehiculoAEditar.getMatricula().equals(matricula)) {
            eliminarVehiculo(vehiculoAEditar.getMatricula());
            
            anyadirVehiculo(marca, modelo, matricula);
            editado = true;
        }
        
        return editado;
    }
}