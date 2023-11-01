
package Entidades;

import java.util.HashMap;
import java.util.List;

public class CarritoDeCompra {
    private int id;
    private int idCliente;
    private HashMap<Producto, Integer> products;
    private Pedidos pedido;

    public CarritoDeCompra() {
    }

    public CarritoDeCompra(int id, int idCliente, HashMap<Producto, Integer> products, Pedidos pedido) {
        this.id = id;
        this.idCliente = idCliente;
        this.products = products;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public HashMap<Producto, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Producto, Integer> products) {
        this.products = products;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }
    
        
}
