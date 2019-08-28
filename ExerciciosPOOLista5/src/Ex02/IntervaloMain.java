package Ex02;

public class IntervaloMain {

	public static void main(String[] args) {
		Intervalo intervalo = new Intervalo();
		
		intervalo.setNumInicial(10);
		intervalo.setNumFinal(6);
		System.out.println(intervalo.testaNum());
		
		/*
		 * for(int k = 0; k<= intervalo.tamanho(); k++) {
			System.out.println(intervalo.valorDoIntervalo(k));
		}
		*/
		
		System.out.println(intervalo);
	}

}
