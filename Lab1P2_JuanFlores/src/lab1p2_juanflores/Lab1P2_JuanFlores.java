/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_juanflores;

import java.util.Scanner;

public class Lab1P2_JuanFlores {

    static Scanner leer = new Scanner(System.in);
    static Scanner leer2 = new Scanner(System.in);
            
    public static void main(String[] args) {
        
        boolean menu = true;
        
        while (menu) {            
            
            System.out.println("""
                               1. Ejercicio 1
                               2. Ejercicio 2
                               3. Salir
                               Ingrese una opcion:
                               """);
            
            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese valor para a: ");
                    int a = leer.nextInt();
                    
                    
                    System.out.println("Ingrese valor para b: ");
                    int b = leer.nextInt();
                    
                     
                    System.out.println("Ingrese valor para c: ");
                    int c = leer.nextInt();
                    
                     
                    
                    double vertice1 = (double)b*-1;
                    double vertice2 = (2*(double)a);
                    
                    double vertice = vertice1/vertice2;
                    
                    double primera = vertice-200;
                    double segunda = vertice+200;
                    
                    
                    
                    
                    System.out.println("suma: "+Newton_Raphson(a, b, c, segunda,0));
                    System.out.println("resta: "+Newton_Raphson2(a, b, c, primera, 0));
                   //2 1 -3
                    
                    break;
                case 2:
                    System.out.println("Ingrese el valor para x: ");
                    int x = leer.nextInt();
                    
                    System.out.println("Ingrese el limite: ");
                    int lim = leer.nextInt();
                    while(lim<1){
                      System.out.println("Ingrese un limite correcto: ");
                         lim = leer.nextInt();  
                    }
                    
                    System.out.println("Seno de "+x+" es igual a "+ SenX(x,lim));
                    System.out.println("Coseno de "+x+ " es igual a "+ CosX(x,lim));
                    if(x<90){
                        System.out.println("Tangente de "+x+" es igual a "+TanX(x, lim));
                    }else{
                        System.out.println("No se puede realizar la tangente");
                    }
                   
                    break;
                case 3:
                    
                    System.out.println("Has salido del menu...");
                    menu = false;
                    
                    break;
                default:
                    System.out.println("Opcion Invalida...");
                    break;
            }      
        }        
    }
    
    public static double fact(double a){
        if (a==0){
            return 1;
        }else{
            return a*fact(a-1);
        }
    }
    
    public static double SenX(int x, int lim){
        
        double num = Math.pow((-1),(double)lim);
        double den = (2*lim)+1;
        double den2 = fact(den);
        //double num = (2*lim)+1;
        double X = Math.pow(x, den );
        if (lim==0){
            return 1;
        }else{
 
            
         double tot;
         return tot = ((num/den2)*X)+SenX(x,lim-1);
 
        }       
    }
    public static double CosX(int x, int lim){
        
        if (lim==0) {
            return 1;
        } else {
           double num = Math.pow(-1, (double)lim);
           double den = fact(2*lim);
           double X = Math.pow(x, 2*lim);
           
           double tot;
           
           return tot = (num/den)*X+CosX(x, lim-1);
           
        }
    }
    
    public static double TanX(int x, int lim){
        
        if (lim==0) {
            return 1;
        }else{
            double Mat = (2*lim)+1;
            double Mat2 = 2*lim;
            double N = Math.pow(2,(double)lim);
            double N1 = Math.pow(-4, (double)lim);
           
            double N2 = (1-N1);
            double den = fact(Mat2);
            double X = Math.pow(x, Mat);
            
            double tot;
            
            return tot = (N*(N1)*(N2)/den)*X+TanX(x, lim-1);
                    
        }
        
    }
    
    public static double Newton_Raphson (int a, int b, int c, double valor_anterior, int i){
        
        if(i==100){
            return valor_anterior; 
        }else{
            valor_anterior = valor_anterior + ((2*Math.pow(valor_anterior,2)+valor_anterior+c)/((2*a)+b)) ;
            return Newton_Raphson(a, b, c, valor_anterior, i+1);
        }

    }
     public static double Newton_Raphson2 (int a, int b, int c, double valor_anterior, int i){
        
        if(i==100){
            return valor_anterior; 
        }else{
            valor_anterior = valor_anterior - ((2*Math.pow(valor_anterior,2)+valor_anterior+c)/((2*a)+b)) ;
            return Newton_Raphson(a, b, c, valor_anterior, i+1);
        }
              
   
    }

}
