package evaluacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] mochila= {"pociones","herramientas", "BOTIQUIN"};
		Personaje p1= new Personaje("Pepe", 100, 0, 2, mochila, 5);
		Personaje p2= new Personaje("Juan", 100, 0, 2, mochila, 7);
			
		Batalla.lucha(p1, p2);
	}

}
