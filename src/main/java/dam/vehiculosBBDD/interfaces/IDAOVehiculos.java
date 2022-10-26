/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dam.vehiculosBBDD.interfaces;

import dam.vehiculosBBDD.clases.Vehiculo;
import java.util.List;

/**
 *
 * @author Dam
 */
public interface IDAOVehiculos {

    public int insertarVehiculo(Vehiculo vehiculo);
    public int eliminarVehiculo(Vehiculo vehiculo);
    public int eliminarVehiculo(String matricula);
    public int eliminarVehiculos(List<Vehiculo> lstVehiculos);
    public Vehiculo getVehiculo(String matricula);
    public List<Vehiculo> getVehiculos();
}
