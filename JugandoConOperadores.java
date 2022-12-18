import java.util.Scanner;
import java.text.MessageFormat;

class JugandoConOperadores{

    /**
     * @param args
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int primero = scanner.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int segundo = scanner.nextInt();
      
        int sumados = primero + segundo;
        System.out.println(MessageFormat.format( "Los numero sumados dan: {0}", sumados ) );
        
        sumados--;
        System.out.println(MessageFormat.format( "Los numero sumados menos 1 dan: {0}", sumados ) );

        sumados *= 3;
        System.out.println(MessageFormat.format( "multiplicados por 3 dan: {0}", sumados ) );

        boolean par = (sumados % 2 == 0) ? true: false;
        System.out.println(MessageFormat.format( "El numerosumado {0} es par?\n Respuesta: {1}", sumados, par
         ) );
    }
 }
