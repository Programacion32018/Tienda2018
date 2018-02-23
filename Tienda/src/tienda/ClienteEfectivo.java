
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteEfectivo extends Cliente{

    private double total;
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(){
        this.total = 0;
    }
    
    public void ingresarProducto(){
        total = 0;
        
        ArrayList<String> productos = new ArrayList<String>();
        ArrayList<Double> precios = new ArrayList<Double>();
        String opcion = "S";
        
        do{
            
            Scanner entrada = new Scanner(System.in);
            Scanner teclado = new Scanner(System.in);
            int cantidad = 0;
            String prod;
            Double valor;
            
            System.out.print("Ingrese producto: ");
            prod = entrada.nextLine();
            System.out.print("Ingrese precio del producto: Q");
            valor = entrada.nextDouble();
            System.out.print("Ingrese cantidad del producto: ");
            cantidad = entrada.nextInt();
            
            total += valor * cantidad;
            productos.add(prod);
            
            System.out.print("¿Desea agregar otro producto? S/N: ");
            opcion = teclado.next();
                             
        } while (!"N".equals(opcion));
        
        System.out.println("***************************************************");
        System.out.println("Cantidad de productos comprados: " + productos.size());
        System.out.println("Total a pagar: " + total);
        System.out.println("***************************************************");
        
    }
}
        
    

