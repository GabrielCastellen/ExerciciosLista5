package Ex08;

public class Pessoa {
	
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 2)
			this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade >= 0)
			this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		if(peso > 0)
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		if(altura > 0)
			this.altura = altura;
	}
	
	public void envelhecer(int anos) {
		setIdade(getIdade() + anos);
		if(getIdade() < 21)
			crescer(0.005f * anos);
	}
	public void engordar(float pesoEngorda) {
		setPeso(getPeso() + pesoEngorda);
	}
	public void emagrecer(float pesoEmagrece) {
		if(pesoEmagrece < getPeso())
			setPeso(getPeso() - pesoEmagrece);
	}
	public void crescer(float alturaCrescer) {
		setAltura(getAltura() + alturaCrescer);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
}
