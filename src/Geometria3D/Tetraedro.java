package Geometria3D;

public class Tetraedro {
    double alt;
    double areaTe;
    double volTe;
    public Tetraedro() {
        alt = 0;
        areaTe = 0;
        volTe = 0;
    }

    public double getAlt(double lado) {
        return alt=calcAltu(lado);
    }

    public double getAreaTe(double lado) {
        return areaTe=calcAreaTe(lado);
    }

    public double getVolTe(double lado) {
        return volTe=calcVolTe(lado);
    }

    private double calcAltu(double lado) {
        return (lado * (Math.sqrt(6)/3));
    }
    private double calcAreaTe(double lado) {
        return (Math.pow(lado,2)*Math.sqrt(3));
    }
    private double calcVolTe(double lado) {
        return ((Math.pow(lado,3))*(Math.sqrt(2)/12));
    }
}
