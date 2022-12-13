package Geometria2D;

public class Hexagono {
    /*Figura con 6 lados*/
    double lado;
    double area;
    public Hexagono(){
        lado=0;
    }

    public double CalcApote(double lad){
        return Math.sqrt(3*(lad/2))/2;
    }
    public double CalcArea(double lad){
        area=(CalcPer(lad)*CalcApote(lad))/2;
        return (CalcPer(lad)*CalcApote(lad))/2;
    }
    public double CalcPer(double lad){
        return lad+lad+lad+lad+lad+lad;
    }
}