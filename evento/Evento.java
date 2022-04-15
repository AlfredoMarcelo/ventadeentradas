package evento;

public class Evento {

	public static void main(String[] args) {
		System.out.println("hola");
		int asientos [] = new int[30];
		asientos[2]=2;
		asientos[4]=3;
		asientos[5]=4;
		asientos[8]=9;
		
		int recaudacion = 0;
		int disponible = 0;
		int vendido = 0;
		
		
		//System.out.println(asientos);
		for(int i = 0;i < asientos.length;i++) { 
			if(asientos[i]==0) {
				System.out.println("asientos disponible");
				disponible = disponible + 1;
			}else {
				System.out.println("asiento vendido");
				recaudacion = recaudacion + 1;
				vendido = vendido + 1;
			}
		}
		
		int dinero = recaudacion * 3000;
		System.out.println("\nLo recaudado es: $" + dinero);
		System.out.println("\nHay disponible para el evento " + disponible + " asientos");
		System.out.println("\nSe han vendido " + vendido + " entradas");
		
	}
}
