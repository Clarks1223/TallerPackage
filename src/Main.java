import Geometria2D.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static DecimalFormat dcf= new DecimalFormat("#.00");
    public static void main(String[] args) {
        Geometria2D.Hexagono figura = new Geometria2D.Hexagono();
        Geometria2D.Circulo fig=new Geometria2D.Circulo();
        double var;
        System.out.print("Ingrese el radio: ");
        var=sc.nextDouble();
        System.out.println(fig.getArea(var));
/*        System.out.println("El area es: "+dcf.format(figura.CalcArea(var)));*/
    }

}