package Geometria2D;

public class Triangulo {
    double area, perimetro, hipotenusa;

    public Triangulo(){
        area=0;
        perimetro=0;
        hipotenusa=0;
    }

    public double getArea(double bas, double alt) {
        area=CalcArea(bas, alt);
        return area;
    }

    public double getPerimetro(double lad1, double lad2, double lad3) {
        perimetro=CalcPEr(lad1, lad2,lad3);
        return perimetro;
    }

    public double getHipotenusa(double cat1, double cat2) {
        hipotenusa=CalcHip(cat1, cat2);
        return hipotenusa;
    }

    private double CalcArea(double bas, double alt){
        return (bas*alt)/2;
    }

    private double CalcPEr(double lad, double lad2, double lad3){
        return lad+lad2+lad3;
    }
    private double CalcHip(double cat1, double cat2){
        return Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
    }
}