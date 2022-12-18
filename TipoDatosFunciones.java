import java.text.MessageFormat;
import java.util.Scanner;

public class TipoDatosFunciones {

    public String tipoDoc;
    public int documento;
    public String nombre;
    public int edad;
    public char sexo;
    public Double peso;
    public Double estatura;


    public boolean mayorEdad(){
        
        int edad = this.edad;
        boolean isOlder = false;
        if(edad >= 18)
            isOlder = true;

        return isOlder;

    }

    public Double imc(){
        return this.peso/(this.estatura*this.estatura);
    }

    public String pesoIdeal( Double imc ){

        String pesoIdeal = "";
        if(imc < 16.00)
            pesoIdeal="Infrapeso: Delgadez Severa";
        else if(imc>=16.00 & imc<=16.99)
            pesoIdeal="Infrapeso: Delgadez moderada";
        else if(imc>=17.00 & imc<=18.49)
            pesoIdeal="Infrapeso: Delgadez aceptable";
        else if(imc>=18.50 & imc<=24.99)
            pesoIdeal="Peso Normal";
        else if(imc>=25.00 & imc<=29.99)
            pesoIdeal="Sobrepeso";
        else if(imc>=30.00 & imc<=34.99)
            pesoIdeal="Obeso: Tipo I";
        else if(imc>=35.00)
            pesoIdeal="Obeso: Tipo III";
        else
            pesoIdeal="no existe clasificacion";
        

        return pesoIdeal;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
        TipoDatosFunciones datos = new TipoDatosFunciones();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese tipo documento TI, CC: ");
        datos.tipoDoc = scanner.next();
        System.out.println("Ingrese numero de documento: ");
        datos.documento = scanner.nextInt();
        System.out.println("Ingrese Nombre: ");
        datos.nombre = scanner.next();
        System.out.println("Ingrese edad: ");
        datos.edad = scanner.nextInt();
        System.out.println("Ingrese el Genero M, F: ");
        datos.sexo = scanner.next().charAt(0);
        System.out.println("Ingrese el peso en Kg: ");
        datos.peso = scanner.nextDouble();
        System.out.println("Ingrese la estatura en metros: ");
        datos.estatura = scanner.nextDouble();

        boolean isOlder = datos.mayorEdad();
        Double imc = datos.imc();
        
        System.out.println( 
            imc );
        System.out.println(MessageFormat.format( "{0} es mayor de edad? \n {1} ", datos.nombre, isOlder ) );
        System.out.println(MessageFormat.format( "{0} tiene un IMC: \n {1} ", datos.nombre, datos.pesoIdeal( imc ) ) );

    }
}
