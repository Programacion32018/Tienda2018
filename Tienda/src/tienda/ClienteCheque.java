package tienda;

import java.util.Scanner;

public class ClienteCheque extends Cliente {

    private double total;
    private final double MAX_COMPRA = 3000;

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = 0;
    }

    public void ingresarProducto() {
        total = 0;
        Scanner sc = new Scanner(System.in);
        double[] precio = new double[500];
        String[] producto = new String[500];
        int cantidad = 0;
        double foo;
        foo = 0;
        String opcion;

        opcion = "S";

        do {

            for (int i = 0; i < 500; i++) {
                while (opcion.equals("S")) {
                    System.out.print("Producto: ");
                    producto[i] = sc.next();
                    System.out.print("Cantidad: ");
                    cantidad = sc.nextInt();
                    System.out.print("Precio: Q");
                    precio[i] = sc.nextDouble();

                    foo = cantidad * precio[i];

                    total = total + foo;

                    System.out.println("Saldo total Q" + total);
                    compra(total);
                    System.out.println("¿Ingresar un nuevo producto? (S/N)");
                    opcion = sc.next();
                    
                                    }
            }

        } while (opcion.equals("S"));

        
        // System.out.println("este es mi saldo" + total);
    }

    public void compra(double total) {

        if (total >= 3000) {
            System.out.println("usted no puede comprar con cheque mas de "
                    + "Q3,000.00");
            ingresarProducto();
        }
       
    }

}
