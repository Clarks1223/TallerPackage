package Geometria3D;
public class Octaedro {
    double diag;
    double areaOc;
    double voluOc;
    public Octaedro() {
        diag = 0;
        areaOc = 0;
        voluOc = 0;
    }

    public double getDiag(double lado) {
        return diag=calcDiagOc(lado);
    }

    public double getAreaOc(double lado) {
        return areaOc=calcAreaOc(lado);
    }

    public double getVoluOc(double lado) {
        return voluOc=calcVolOc(lado);
    }

    private double calcDiagOc(double lado) {
        return (lado*Math.sqrt(2));
    }
    private double calcAreaOc(double lado) {
        return ((2*Math.pow(lado,2))*Math.sqrt(3));
    }
    private double calcVolOc(double lado) {
        return ((Math.pow(lado,3)*Math.sqrt(2))/3);
    }
}
