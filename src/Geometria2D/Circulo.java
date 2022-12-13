package Geometria2D;

public class Circulo {
    double area;
    public Circulo(){
        area=0;
    }

    public double getArea(double rad) {
        area=CalcArea(rad);
        return area;
    }

    private double CalcArea(double rad){
        return Math.PI*Math.pow(rad,2);
    }

    public double CalcPEr(double rad){
        return 2*Math.PI*rad;
    }
    public double CalDiam(double rad){
        return 2*(rad);
    }

}
