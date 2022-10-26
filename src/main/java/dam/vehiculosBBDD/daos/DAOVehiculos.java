/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.vehiculosBBDD.daos;

import dam.vehiculosBBDD.clases.Vehiculo;
import dam.vehiculosBBDD.interfaces.IDAOVehiculos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dam
 */
public class DAOVehiculos implements IDAOVehiculos {

    private List<Vehiculo> falsaBD;
    private static DAOVehiculos dao = null;

    private DAOVehiculos() {
        super();
        this.falsaBD = new ArrayList<Vehiculo>();
        falsaBD.add(new Vehiculo("Renault", "Zoe", "2345FDF"));
        falsaBD.add(new Vehiculo("Renault", "Fluence", "0000FTL"));
        falsaBD.add(new Vehiculo("Tesla", "3", "2422FHT"));
        falsaBD.add(new Vehiculo("Tesla", "X", "1221FDF"));

    }

    @Override
    public int insertarVehiculo(Vehiculo vehiculo) {
        falsaBD.add(vehiculo);

        return 1;
    }

    @Override
    public int eliminarVehiculo(String matricula) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int eliminarVehiculos(List<Vehiculo> lstVehiculos) {
        falsaBD.removeAll(lstVehiculos);
        
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
        falsaBD.remove(vehiculo);
        
        return 0;
    }
    
    public Boolean existeVehiculo(String matricula) {
        Boolean existe = false;
        
        for (int i = 0; i < falsaBD.size() && !existe; i++) {
            if (falsaBD.get(i).getMatricula().equals(matricula)) {
                existe = true;
            }
        }
        
        return existe;
    }
}
