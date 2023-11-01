
package Entidades;

public class Pedidos {
    private int id;
    private int idCliente;
    private int idCarrito;
    private int estado;

    public Pedidos() {
    }

    public Pedidos(int id, int idCliente, int idCarrito, int estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.idCarrito = idCarrito;
        this.estado = estado;
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

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
