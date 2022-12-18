import java.text.MessageFormat;
import java.util.Scanner;

public class Figuras {
    

    public Double radio;
    public Double base;
    public Double altura;
    public Double lado;
    public char figura;
    private Scanner scanner;
    public Double area;
    public String fig;

    public Figuras(){
        this.scanner = new Scanner(System.in);
    }

    public void capturarDatos(){
        
        if(this.figura == 'c')
            this.circunferencia();
        

        if(this.figura == 't')
            this.triangulo();
        
        if(this.figura == 's')
            this.cuadrado();
    }

    public void circunferencia(){

        this.fig = "Círculo";
        System.out.println("Ingrese radio de la circunferencia:");
        this.radio = this.scanner.nextDouble();

        this.area = ( this.radio*this.radio ) * Math.PI;
    }

    public void triangulo(){

        this.fig = "Triángulo";
        System.out.println("Ingrese la base del triangulo:");
        this.base = this.scanner.nextDouble();

        System.out.println("Ingrese la altura del triangulo:");
        this.altura = this.scanner.nextDouble();

        this.area = ( this.base *this.altura ) / 2;
    }

    public void cuadrado(){

        this.fig = "Cuadrado";
        System.out.println("Ingrese el lado del cuadrado:");
        this.lado = this.scanner.nextDouble();

        this.area = this.lado * this.lado ;
    }
    

    
    /**
     * @param args
     */
    public static void main(String[] args) {

        Figuras figura = new Figuras();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un caracter segun la figura seleccionada\n C = Ciuculo\n T = Triángulo\n S = Cuadrado");
        figura.figura = scanner.next().toLowerCase().charAt(0);
        figura.capturarDatos();

        System.out.println(MessageFormat.format( "el area del {0} es: {1} ", figura.fig, figura.area ) );


    }
}
