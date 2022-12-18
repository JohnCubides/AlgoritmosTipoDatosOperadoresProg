import java.lang.management.OperatingSystemMXBean;
import java.text.MessageFormat;
import java.util.Scanner;

public class OperacionesBasicasFactorial {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero para colcular su dactorial: ");
        int numero = scanner.nextInt();
        OperacionesBasicasFactorial op = new OperacionesBasicasFactorial(); 
        System.out.println(MessageFormat.format( "EL factorial del numero {0} es: {1}", numero, op.factorial( numero ) ) );
        


    }

    public int factorial(int valorNumerico ){
        
        int factorial = 1;

        while( valorNumerico != 0 ){
            factorial *= valorNumerico;
            valorNumerico--;
        }

        return factorial;
    }
    
}
