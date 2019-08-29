package lista05.Ex09;

public class Exer09{

	private int numeroConta;
	private String nome;
	private float saldo;

	public Exer09(){
		numeroConta = 1;
		nome = "";
		saldo = 0;
	}

	public void setNumeroConta(int numeroConta){
		if(numeroConta > 0)
			this.numeroConta = numeroConta;
	}
	
	public void setNome(String nome){
		if(nome != null)
			this.nome = nome;
	}
	
	public void setSaldo(float saldo){
		if(saldo >= 0)
	}

	public int getNumerConta(){
		return numeroConta;
	}

	public String getNome(){
		return nome;
	}

	public float getSaldo(){
		return saldo;
	}

	public void incluidConta(int numeroConta, String nome, float saldo){
			setNumeroConta(numeroConta);
			setNumeroConta(nome);
			setSaldo(saldo);
	}

	public void alturaNome(String nome){
		setNome(nome);

	}

	public void deposito(float deposito){
		if(deposito > 0)
			setSaldo(getSaldo()+deposito);
	}

	public void saque(float saque){
		if(saque > 0)
			setSaldo(getSaldo()-saque);
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Nome: ");
		builder.append(nome);
		builder.append("Saldo: ");
		builder.append(saldo);
		return builder.toString();
	}
}