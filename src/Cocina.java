import App.Estacion;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Estacion> estaciones;

    public Cocina() {
        pedidos = new ArrayList<Pedido>();
        estaciones = new ArrayList<Estacion>();
    }

    public void addPedido(Pedido pedido){
        //TODO falta implementar equals en pedido
        if (!pedidos.contains(pedido)) pedidos.add(pedido);
    }

    public void addEstacion(Estacion estacion){
        if(!estaciones.contains(estacion)) estaciones.add(estacion);
    }
}
