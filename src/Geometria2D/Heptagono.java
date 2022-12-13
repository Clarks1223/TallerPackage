package Geometria2D;

public class Heptagono {
    /*Figura geometrica con 7 lados*/
    double lado;
    double altura;
    public Heptagono(){
        lado=0;
        altura=0;
    }
    public double CalcApote(double lad){
        return Math.sqrt(3*(lad/2))/2;
    }
    public double CalcArea(double lad){
        return (CalcPer(lad)*CalcApote(lad))/2;
    }
    public double CalcPer(double lad){
        return lad+lad+lad+lad+lad+lad;
    }
}