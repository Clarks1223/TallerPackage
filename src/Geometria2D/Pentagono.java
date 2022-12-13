package Geometria2D;

public class Pentagono {
    /*Figura geometrica con 5 lados*/
    double lado;
    double altura;
    double apotema;
    double area;
    double perimetro;
    public Pentagono(){
        lado=0;
        altura=0;
        apotema=0;
        area=0;
        perimetro=0;
    }
    public double CalcApote(double lad){
        return lad/1.45;
    }
    public double CalcArea(double lad){
        return (5*lad*CalcApote(lad))/2;
    }
    public double CalcPer(double lad){
        return lad+lad+lad+lad+lad;
    }
}
