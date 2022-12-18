package Geometria3D;

public class Icosaedro {
    double areaCara;
    double areaTotIco;
    double volIco;
    public Icosaedro() {
        areaCara = 0;
        areaTotIco = 0;
        volIco = 0;
    }

    public double getAreaCara(double lad) {
        return areaCara=calAreaCara(lad);
    }

    public double getAreaTotIco(double lad) {
        return areaTotIco=calcAreaTotIc(lad);
    }

    public double getVolIco(double lad) {
        return volIco=calcVolIc(lad);
    }

    private double calAreaCara(double lad) {
        return ((Math.sqrt(3)/4)*Math.pow(lad,2));
    }
    private double calcAreaTotIc(double lad) {
        return (20*(Math.sqrt(3)/4)*Math.pow(lad,2));
    }
    private double calcVolIc(double lad) {
        return (0.42*(3+Math.sqrt(5))*Math.pow(lad,3));
    }
}
