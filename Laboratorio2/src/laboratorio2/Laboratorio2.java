/*
 */
package laboratorio2;
import java.util.Scanner;
/**
 *
 * @author Dennis Leo
 */
public class Laboratorio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String nombre = "";
        String apellido = "";
        String valorU = "";
        int contador = 0;
        int tipo = 0;
        int edad = 0;
        int hijos = 0;
        double incentivo = 0, incentivoA = 0, incentivoT = 0;
        double bono = 0, bonoA = 0, bonoT = 0;
        double totalP = 0, totalPE = 0;
        double descuento = 0, descuentoT = 0;
        double sueldoM = 0, sueldoMT = 0;
        boolean bandera = true;
        System.out.println("EMPRESA DE VENTAS DE ELECTRODOMÉSTICOS (PAGO DE EMPLEADOS)");
        cadena = String.format("%s%s\n", cadena,
                "REPORTE DE ROL DE PAGOS POR EMPLEADO >>");
        while (bandera == true) {

            System.out.println("Ingrese su nombre ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese su apellido ");
            apellido = entrada.nextLine();

            System.out.println("Que tipo de sueldo recibe mensual: elija una "
                    + "opción del (1) al (4): ");
            System.out.println("Tipo 1: sueldo mensual de 340");
            System.out.println("Tipo 2: sueldo mensual de 460");
            System.out.println("Tipo 3: sueldo mensual de 580");
            System.out.println("Tipo 4: sueldo mensual de 600");
            tipo = entrada.nextInt();
            if (tipo == 1) {
                sueldoM = 340;
                incentivo = sueldoM * 0.05;
                incentivoA = sueldoM + incentivo;
            } else {
                if (tipo == 2) {
                    sueldoM = 460;
                    incentivo = sueldoM * 0.10;
                    incentivoA = sueldoM + incentivo;
                } else {
                    if (tipo == 3) {
                        sueldoM = 580;
                        incentivo = sueldoM * 0.15;
                        incentivoA = sueldoM + incentivo;
                    } else {
                        if (tipo == 4) {
                            sueldoM = 600;
                            incentivo = sueldoM * 0.15;
                            incentivoA = sueldoM + incentivo;
                        }
                    }
                }
            }
            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();

            if (edad <= 20) {
                descuento = 15;
            }
            if (edad > 20 && edad <= 30) {
                descuento = 25;
            }
            if (edad > 30) {
                descuento = 35;
            }

            System.out.println("Cuantos Hijos tiene: ");
            hijos = entrada.nextInt();
            if (hijos <= 20) {
                bono = 10 * hijos;
                bonoA = bono + incentivoA;
                totalP = bonoA - descuento;
                incentivoT = incentivoT + incentivo;
                bonoT = bonoT + bono;
                descuentoT = descuentoT + descuento;
                sueldoMT = sueldoMT + sueldoM;
                totalPE = sueldoMT + incentivoT + bonoT - (descuentoT);
                contador = contador + 1;
            }

            cadena = String.format("%s%d. %s %s(%daños)\tsueldo Mensual %.2f$ "
                    + "\tIncentivo %.2f$\tHijos(%d)\tDescuento SS %.2f$\n", 
                    cadena, contador, nombre, apellido, edad, sueldoM, 
                    incentivo, hijos, descuento);
            entrada.nextLine(); //limpiar el buffer
            System.out.println("Ingrese (n) si desea agregar a otro empleado o "
                    + "(r) si desea mostrar el reporte: ");
            valorU = entrada.nextLine();
            if (valorU.equals("n")) {
                bandera = true;
            } else {
                if (valorU.equals("r")) {
                    bandera = false;
                }
            }
        }
        cadena = String.format("%s\nREPORTE DE ROL DE PAGOS DE LA EMPRESA "
                + "(Totales) >> \nDescuento de Seguro Social = %.2f$\nTotal "
                + "Incentivo-1 = %.2f$\nTotal Pago por Hijos = %.2f$\nTotal "
                + "Pago de la Empresa = %.2f$", cadena,
                descuentoT, incentivoT, bonoT, totalPE);
        System.out.printf("%s", cadena);
    }
}
        
    
