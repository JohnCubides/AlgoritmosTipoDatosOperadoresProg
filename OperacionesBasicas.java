import java.text.MessageFormat;
import java.util.Scanner;

public class OperacionesBasicas{

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        double primero = scanner.nextDouble();
        System.out.println("Ingrese segundo numero: ");
        double segundo = scanner.nextDouble();
        System.out.println("Ingrese tipo de operación +, -, *, /:");
        String operacion = scanner.next();

        Double total = null;

        if( "+".equals(operacion) )
            total = primero + segundo;

        if("-".equals(operacion))
            total = primero - segundo;

        if( "*".equals(operacion) ){
            total = primero * segundo;
        }

        if( "/".equals(operacion))
            total = primero / segundo;


        if(total != null ){
            System.out.println(MessageFormat.format( "{0} {1} {2} = {3}", primero, operacion, segundo, total ) );
        }else{
            System.out.println("No selecciono ninguna de estas opciones: +, -, *, /:" );
        }
    }
 }