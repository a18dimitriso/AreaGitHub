package areagithub;

import java.util.Scanner;
public class AreaGitHub {
   	public static void main(String[] args) {
        		double altura;
       		 Scanner sc = new Scanner(System.in);
       		 System.out.print("Ingresar dato A: ");
       		 double a = sc.nextDouble(); 
		a = a*a; 
        		System.out.print("Ingresar dato B: ");
        		double b = sc.nextDouble(); 
		double B = b;
		b = b/2;
		b = b*b;
       		 altura = a - b; 
		double area;
		double h = Math.sqrt(altura);
      		 area = (h*B)/2;
     		System.out.println("Altura= " + h);
        		System.out.println("Area= " + area);
   }
}
