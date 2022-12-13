package Geometria2D;

public class Triangulo {
    double lado;
    double altura;
    double base;
    double angulo;

    public Triangulo(){
        lado=0;
        base=0;
        altura=0;
        angulo=0;
    }
    public double CalcArea(double bas, double alt){
        return (bas*alt)/2;
    }

    public double CalcPEr(double lad, double lad2, double lad3){
        return lad+lad2+lad3;
    }
    public double CalcHip(double cat1, double cat2){
        return Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
    }
}