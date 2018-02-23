package tienda;

import java.util.Scanner;

public class Manejador {

    Scanner sc = new Scanner(System.in);
    ClienteCheque clienteCheque;
    ClienteEfectivo clienteEfectivo;
    ClienteCredito clienteCredito;

    public Manejador() {
        clienteCheque = new ClienteCheque();
        clienteEfectivo = new ClienteEfectivo();
        clienteCredito = new ClienteCredito();
    }

    private void ImpresionClienteCheque() {
        System.out.println("3.Cliente pago cheque");
            System.out.print("Nombre: ");
            clienteCheque.setNombres(sc.next());
            System.out.print("Apellido: ");
            clienteCheque.setApellidos(sc.next());
            System.out.print("Direccion: ");
            clienteCheque.setDireccion(sc.next());
            System.out.print("Nit: ");
            clienteCheque.setNit(sc.nextInt());
        clienteCheque.ingresarProducto();
        System.out.println("Total a pagar es: " + clienteCheque.getTotal());
        Menu();
    }
    
    private void ImpresionClienteCredito() {
        System.out.println("2.Cliente pago credito");
            System.out.print("Nombre: ");
            clienteCredito.setNombres(sc.next());
            System.out.print("Apellido: ");
            clienteCredito.setApellidos(sc.next());
            System.out.print("Direccion: ");
            clienteCredito.setDireccion(sc.next());
            System.out.print("Nit: ");
            clienteCredito.setNit(sc.nextInt());
        clienteCredito.mPagos();
        System.out.println("Total a pagar es: " + clienteCredito.getTotal());
        Menu();
    }

    private void ImpresionClienteEfectivo(){
        System.out.println("1. Cliente pago efectivo");
             System.out.print("Nombre: ");
            clienteEfectivo.setNombres(sc.next());
            System.out.print("Apellido: ");
            clienteEfectivo.setApellidos(sc.next());
            System.out.print("Direccion: ");
            clienteEfectivo.setDireccion(sc.next());
            System.out.print("Nit: ");
            clienteEfectivo.setNit(sc.nextInt());
        clienteEfectivo.ingresarProducto();
        System.out.println("Total a pagar es: " + clienteEfectivo.getTotal());
        Menu();
    }
    
    public void Menu() {
        {

            int op;
            op = 0;
            do {

                System.out.println("Bienvenido al sistema\n\t");
                System.out.println("1.Pago Efectivo\t 2.Pago Credito 3.Pago cheque\t"
                        + "4. Salir");
                op = sc.nextInt();
                if (op == 1) {
                    System.out.println("Cliente Efectivo\n\t");
                    ImpresionClienteEfectivo();
                } else if (op == 2) {
                    System.out.println("Cliente Credito\n\t");
                    ImpresionClienteCredito();
                } else if (op == 3) {
                    System.out.println("Cliente Cheque\n\t");
                    ImpresionClienteCheque();
                }

            } while (op != 4);
               
        }

    }


}
