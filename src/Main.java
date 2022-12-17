import Geometria2D.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static DecimalFormat dcf= new DecimalFormat("#.00");
    public static void main(String[] args) {
        Geometria2D.Circulo cir = new Geometria2D.Circulo();
        Geometria2D.Triangulo tri = new Geometria2D.Triangulo();
        Geometria2D.Cuadrado cuad= new Geometria2D.Cuadrado();
        Geometria2D.Pentagono pent= new Geometria2D.Pentagono();
        Geometria2D.Hexagono hex=new Geometria2D.Hexagono();
        Geometria2D.Heptagono hep=new Geometria2D.Heptagono();
        Geometria2D.Octagono oct=new Geometria2D.Octagono();
        Geometria2D.Nonagono non=new Geometria2D.Nonagono();
        Geometria2D.Decagono dec=new Geometria2D.Decagono();
        Geometria2D.Endecagono endc=new Geometria2D.Endecagono();
        /*Menu del programa*/
         int menuP=1;
         int menu2D=1;
         int menuCir=1, menuTri=1, menuCuad=1, menuPent=1;
         double var1, var2, var3;
         while (menuP!=0){
             menuP=menuPrincipal();
             switch (menuP){
                 case 1:
                     while(menu2D!=0){
                         menu2D=menuFiguras2D();
                         switch (menu2D){
                             case 1:
                                 while (menuCir!=0){
                                     menuCir=menuCirculo();
                                     switch (menuCir){
                                         case 1:
                                             System.out.print("Ingrese el radio: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(cir.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese el radio: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(cir.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese el radio: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El diametro es: "+dcf.format(cir.getDiametro(var1)));
                                             break;
                                     }
                                 }
                                 menuCir=1;
                                 break;
                             case 2:
                                 while (menuTri!=0){
                                     menuTri=menuTriangulo();
                                     switch (menuTri){
                                         case 1:
                                             System.out.print("Ingrese la base: ");
                                             var1=sc.nextDouble();
                                             System.out.print("Ingrese la altura: ");
                                             var2=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(tri.getArea(var1,var2)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese lado 1: ");
                                             var1=sc.nextDouble();
                                             System.out.print("Ingrese lado 2: ");
                                             var2=sc.nextDouble();
                                             System.out.print("Ingrese lado 3: ");
                                             var3=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(tri.getPerimetro(var1, var2, var3)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese el cateto1: ");
                                             var1=sc.nextDouble();
                                             System.out.print("Ingrese el cateto2: ");
                                             var2=sc.nextDouble();
                                             System.out.println("La hipotenusa es: "+dcf.format(tri.getHipotenusa(var1, var2)));
                                             break;
                                     }
                                 }
                                 menuTri=1;
                                 break;
                             case 3:
                                 while (menuCuad!=0){
                                     menuCuad=menuCuadrado();
                                     switch (menuCuad){
                                         case 1:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(cuad.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(cuad.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("La diagonal es: "+dcf.format(cuad.getDiagonal(var1)));
                                             break;
                                     }
                                 }
                                 menuCuad=1;
                                 break;
                             case 4:
                                 while (menuPent!=0){
                                     System.out.println("***MENU PENTAGONO***");
                                     menuPent=menuPentagono();
                                     switch (menuPent){
                                         case 1:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(pent.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(pent.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El apotema es: "+dcf.format(pent.getApotema(var1)));
                                             break;
                                     }
                                 }
                                 menuPent=1;
                                 break;
                             case 5:
                                 while (menuPent!=0){
                                     System.out.println("***MENU HEXAGONO***");
                                     menuPent=menuPentagono();
                                     switch (menuPent){
                                         case 1:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(hex.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(hex.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El apotema es: "+dcf.format(hex.getApotema(var1)));
                                             break;
                                     }
                                 }
                                 menuPent=1;
                                 break;
                             case 6:
                                 while (menuPent!=0){
                                     System.out.println("***MENU HEPTAGONO***");
                                     menuPent=menuPentagono();
                                     switch (menuPent){
                                         case 1:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(hep.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(hep.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El apotema es: "+dcf.format(hep.getApotema(var1)));
                                             break;
                                     }
                                 }
                                 menuPent=1;
                                 break;
                             case 7:
                                 while (menuPent!=0){
                                     System.out.println("***MENU OCTAGONO***");
                                     menuPent=menuPentagono();
                                     switch (menuPent){
                                         case 1:
                                             System.out.print("Ingrese el perimetro: ");
                                             var1=sc.nextDouble();
                                             System.out.print("Ingrese el apotema: ");
                                             var2=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(oct.getArea(var1, var2)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(oct.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El apotema es: "+dcf.format(oct.getApotema(var1)));
                                             break;
                                     }
                                 }
                                 menuPent=1;
                                 break;
                             case 8:
                                 while (menuPent!=0){
                                     System.out.println("***MENU NONAGONO***");
                                     menuPent=menuPentagono();
                                     switch (menuPent){
                                         case 1:
                                             System.out.print("Ingrese el lad: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(non.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(non.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El apotema es: "+dcf.format(non.getApotema(var1)));
                                             break;
                                     }
                                 }
                                 menuPent=1;
                                 break;
                             case 9:
                                 while (menuPent!=0){
                                     System.out.println("***MENU DECAGONO***");
                                     menuPent=menuPentagono();
                                     switch (menuPent){
                                         case 1:
                                             System.out.print("Ingrese el lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(dec.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(dec.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El apotema es: "+dcf.format(dec.getApotema(var1)));
                                             break;
                                     }
                                 }
                                 menuPent=1;
                                 break;
                             case 10:
                                 while (menuPent!=0){
                                     System.out.println("***MENU ENDECAGONO***");
                                     menuPent=menuPentagono();
                                     switch (menuPent){
                                         case 1:
                                             System.out.print("Ingrese el lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El area es: "+dcf.format(endc.getArea(var1)));
                                             break;
                                         case 2:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El perimtero es: "+dcf.format(endc.getPerimetro(var1)));
                                             break;
                                         case 3:
                                             System.out.print("Ingrese un lado: ");
                                             var1=sc.nextDouble();
                                             System.out.println("El apotema es: "+dcf.format(endc.getApotema(var1)));
                                             break;
                                     }
                                 }
                                 menuPent=1;
                                 break;
                         }
                     }
                     menu2D=1;
                     break;
                 case 2:
                     /*Aqui pones tu parte infiel!!!
                     * xD*/
                     break;
             }
         }
    }
    static int controlDatos(int val){
        while (val!=1&&val!=2&&val!=3&&val!=0){
            System.out.println("Dato incorrecto");
            System.out.print("Opcion: ");
            val=sc.nextInt();
        }
        return val;
    }
    static int menuPrincipal(){
        int op;
        System.out.println("***MENU PRINCIPAL***");
        System.out.println("1. Figuras en 2D");
        System.out.println("2. Figuras en 3D");
        System.out.println("0. Salir del programa");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        while (op!=1&&op!=2&&op!=0){
            System.out.println("Dato incorrecto");
            System.out.print("Opcion: ");
            op=sc.nextInt();
        }
        return op;
    }
    static int menuFiguras2D(){
        int op;
        System.out.println("***MENU FIGURAS 2D***");
        System.out.println("1. Circulo");
        System.out.println("2. Triangul0");
        System.out.println("3. Cuadrado");
        System.out.println("4. Pentagono");
        System.out.println("5. Hexagono");
        System.out.println("6. Heptagono");
        System.out.println("7. Octagono");
        System.out.println("8. Nonagono");
        System.out.println("9. Decagono");
        System.out.println("10. Endecagono");
        System.out.println("0. Regresar a menu Principal");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        while (op!=1&&op!=2&&op!=3&&op!=4&&op!=5&&op!=6&&op!=7&&op!=8&&op!=9&&op!=10&&op!=0){
            System.out.println("Dato incorrecto");
            System.out.print("Opcion: ");
            op=sc.nextInt();
        }
        return op;
    }
    static int menuCirculo(){
        int op;
        System.out.println("***MENU CIRCULO***");
        System.out.println("1. Area");
        System.out.println("2. Perimetro");
        System.out.println("3. Diametro");
        System.out.println("0. Regresar a menu FIGURAS 2D");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        op=controlDatos(op);
        return op;
    }
    static int menuTriangulo(){
        int op;
        System.out.println("***MENU TRIANGULO***");
        System.out.println("1. Area");
        System.out.println("2. Perimetro");
        System.out.println("3. Hipotenusa");
        System.out.println("0. Regresar a menu FIGURAS 2D");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        op=controlDatos(op);
        return op;
    }
    static int menuCuadrado(){
        int op;
        System.out.println("***MENU CUADRADO***");
        System.out.println("1. Area");
        System.out.println("2. Perimetro");
        System.out.println("3. Diagonal");
        System.out.println("0. Regresar a menu FIGURAS 2D");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        op=controlDatos(op);
        return op;
    }
    static int menuPentagono(){
        int op;
        System.out.println("1. Area");
        System.out.println("2. Perimetro");
        System.out.println("3. Apotema");
        System.out.println("0. Regresar a menu FIGURAS 2D");
        System.out.print("Opcion: ");
        op=sc.nextInt();
        op=controlDatos(op);
        return op;
    }

}