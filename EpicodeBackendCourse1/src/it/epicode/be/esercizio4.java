package it.epicode.be;

import java.util.Scanner;

public class esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("inserisci la misura dei lati del rettangolo");
		String stringaN1= in.nextLine();
		String stringaN2= in.nextLine();
        double n1 = Double.parseDouble(stringaN1);
	    double n2 = Double.parseDouble(stringaN2);
	    System.out.println(perimetroRettangolo(n1,n2));
		
	    System.out.println("inserisci un numero per sapere se è pari o dispari");
        String stringaNum =in.nextLine();
	    int num = Integer.parseInt(stringaNum);
	    System.out.println(stringaPariDispari(pariDispari(num)));
	    
	    System.out.println("inserisci i tre lati di un triangolo per conoscerne l'area");
        String stringaLato1 =in.nextLine();
        String stringaLato2 =in.nextLine();
        String stringaLato3 =in.nextLine();
        double lato1=Double.parseDouble(stringaLato1);
        double lato2=Double.parseDouble(stringaLato2);
        double lato3=Double.parseDouble(stringaLato3);
	    System.out.println(perimetroTriangolo(lato1,lato2,lato3));

        in.close();
	}
	static double perimetroRettangolo(double n1, double n2) {
		return (n1+n2)*2;
	}
	
	static int pariDispari(int num) {
		if(num % 2 == 0 ) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
	    double semiperimetro = (lato1 + lato2 + lato3) / 2;
	    double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
	    return area;
	}
	static String stringaPariDispari(int numero) {
		if(numero == 0) {
			return "il numero è pari";
			
		}else {
			return "il numero è dispari";
		}
	}

}
