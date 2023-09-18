package evaluacion;

import java.util.Random;

public class Batalla {
	
	public static Personaje lucha(Personaje per1,Personaje per2) {
		Random num= new Random(System.nanoTime());
		int numero = num.nextInt(3-1+1)+1;
		
		per1.recibirGolpe(per1.getPuntosVida()-numero*per2.getPuntosFuerza());
		per2.recibirGolpe(per2.getPuntosVida()-numero*per1.getPuntosFuerza());
		
		if(per1.getPuntosVida()<30) {
			per1.curar();
		}else if (per2.getPuntosVida()<30) {
			per2.curar();
		}
		
		if(per1.getPuntosVida()>per2.getPuntosVida()) {
			return per1;
		}else {
			return per2;
		}
	}
	
}
