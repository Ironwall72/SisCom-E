
package sistemacomercioelectrónico;

import BaseDeDatos.DataBase_Products;
import static BaseDeDatos.DataBase_Products.initProducts;
import Entidades.CarritoDeCompra;
import Entidades.Cliente;
import Entidades.Producto;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SistemaComercioElectrónico {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        List listaProductos = initProducts();
        
        System.out.print("Ingrese su DNI: ");
        int id = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese su e-mail: ");
        String email = leer.nextLine();
        System.out.print("Ingrese su dirección: ");
        String direccion = leer.nextLine();
        
        Cliente cliente = new Cliente(id,nombre,email,direccion);
        
        System.out.print("Desea agregar un producto al carrito (S/N)?");
        String opcion = leer.nextLine();
        while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")){
            System.out.println("HA INGRESADO UN VALOR INCORRECTO");
            System.out.print("Desea agregar un producto al carrito (S/N): ");
            opcion = leer.nextLine();
        }
        while (opcion.equalsIgnoreCase("S")){
            System.out.print("Ingresa el codigo del producto que deseas comprar :");
            int codProducto = leer.nextInt();
            
            
        }
        
        
        
    }
    
}
