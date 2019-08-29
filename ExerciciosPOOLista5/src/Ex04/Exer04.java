package lista05.Ex04;

public class Exer04{

	private float valorHora;
	private float horasMes;

	public void setValorHora(float valorHora){
		if(valorHora > 0)
			this.valorHora = valorHora
	}

	public void setHorasMes(float horasMes){
		if(horasMes>0)
			this.horasMes = horasMes;
	}

	public float getValorHora(){
		return valorHora;
	}

	public float getHorasMes(){
		return horasMes;
	}

	public float salarioBruto(){
		return (float) valorHora*horasMes;
	}

	public float inss(){
		return (float) salarioBruto*0.08
	}

	public float ir(){
		return (float) salarioBruto*0.11;
	}

	public float sindicato(){
		return (float) salarioBruto*0.05;
	}

	public float totalDesconto(){
		return (float) inss()+ir()+sindicato();
	}
	public float salarioLiquido(){
 		return (float) salarioBruto()-totalDesconto();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salário bruto: ");
		builder.append(salarioBruto());
		builder.append("\nQuanto pagou ao INSS: ");
		builder.append(inss());
		builder.append("\nQuanto pagou ao sindicato: ");
		builder.append(sindicato());
		builder.append("\nO salário líquido: ");
		builder.append(salarioLiquido);

		return builder.toString();
	}

}