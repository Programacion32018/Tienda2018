
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteCredito extends Cliente{
    double Total;
    private final double MAX_COMPRA = 500;

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = 0;
    }
    
 public void mPagos(){
     Total = 0;
    ArrayList<String> produ = new ArrayList<>();
    ArrayList<Double> prec = new ArrayList<>();
    String opc = "S";
     do{
            
            Scanner x = new Scanner(System.in);
            int cantidad = 0;
            String prod;
            Double valor;
            
            for (int i = 0; i < 500; i++) {
                
            System.out.print("Ingrese producto: ");
            prod = x.nextLine();
            System.out.print("Ingrese precio del producto: Q");
            valor = x.nextDouble();
            System.out.print("Ingrese cantidad del producto: ");
            cantidad = x.nextInt();
            
            Total += valor * cantidad;
            produ.add(prod);
            prec.add(valor);
            
            }
            
            System.out.print("¿Desea agregar otro producto? S/N: ");
            opc = x.next();
                             
        } while (!"N".equals(opc));
        
        System.out.println("***************************************************");
        System.out.println("Cantidad de productos comprados: " + produ.size());
        System.out.println("Total a pagar: " + Total);
        System.out.println("***************************************************");
 }   
 
 public void compra(double total) {

        if (total >= 500) {
            System.out.println("No puede comprar con credio mas "
                    + "Q500.00");
            mPagos();
        }
 }

    
}


