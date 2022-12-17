package Geometria3D;

public class Dodecaedro {
    double area_totD;
    double area_latD;
    double voluDod;
    public Dodecaedro() {
        area_latD = 0;
        area_totD = 0;
        voluDod = 0;
    }

    public double getArea_totD(double lad, double apo) {
        return area_totD=calcAreaTotD(lad, apo);
    }

    public double getArea_latD(double lad, double apo) {
        return area_latD=calcAreaCaD(lad, apo);
    }

    public double getVoluDod(double lad) {
        return voluDod=calcVolD(lad);
    }

    private double calcAreaTotD(double lad, double apo) {
        return (30*lad*apo);
    }
    private double calcAreaCaD(double lad, double apo) {
        return  (calcAreaTotD(lad, apo)/12);
    }
    private double calcVolD(double lad) {
        return (0.25*(15+7*Math.sqrt(5))*Math.pow(lad,3));
    }
}
