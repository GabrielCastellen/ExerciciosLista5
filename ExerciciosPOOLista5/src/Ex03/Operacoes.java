package Ex03;

public class Operacoes {
	
	private float numero1;
	private float numero2;
	
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	public float adicao(){
		return getNumero1() + getNumero2();
	}
	public float subtracao(){
		return getNumero1() - getNumero2();
	}
	public float multiplicacao(){
		return getNumero1() * getNumero2();
	}
	public float divisao(){
		return getNumero1() / getNumero2();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacoes [numero1=");
		builder.append(numero1);
		builder.append(", numero2=");
		builder.append(numero2);
		builder.append(", adicao()=");
		builder.append(adicao());
		builder.append(", subtracao()=");
		builder.append(subtracao());
		builder.append(", multiplicacao()=");
		builder.append(multiplicacao());
		builder.append(", divisao()=");
		builder.append(divisao());
		builder.append("]");
		return builder.toString();
	}
	
	

}
