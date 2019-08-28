package Ex08;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Robson");
		p.setIdade(15);
		p.setAltura(1.56f);
		p.setPeso(56);
		
		p.engordar(10);
		p.emagrecer(7);
		p.crescer(0.1f);
		p.envelhecer(3);
		
		System.out.println(p);
	}

}
