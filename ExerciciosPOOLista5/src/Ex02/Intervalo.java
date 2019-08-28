package Ex02;

public class Intervalo {
	
	private int numInicial;
	private int numFinal;
	
	public int getNumInicial() {
		return numInicial;
	}
	public void setNumInicial(int numInicial) {
		this.numInicial = numInicial;
	}
	public int getNumFinal() {
		return numFinal;
	}
	public void setNumFinal(int numFinal) {
		this.numFinal = numFinal;
	}
	
	private void trocaNum() {
		int troca = getNumInicial();
		setNumInicial(getNumFinal());
		setNumFinal(troca);
	}
	
	public String testaNum() {
		if(getNumInicial() > getNumFinal()) {
			trocaNum();
			return "Os números foram trocados";
		}
		else
			return "Os números não foram trocados";
	}
	
	public int tamanho() {
		return getNumFinal() - getNumInicial();
	}
	
	public int valorDoIntervalo(int posicao) {
		if(posicao < 0 || posicao > tamanho())
			return 0;
		else
			return getNumInicial() + posicao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Intervalo [numInicial=");
		builder.append(numInicial);
		builder.append(", numFinal=");
		builder.append(numFinal);
		builder.append(", getNumInicial()=");
		builder.append(getNumInicial());
		builder.append(", getNumFinal()=");
		builder.append(getNumFinal());
		builder.append(", tamanho()=");
		builder.append(tamanho());
		for(int i = 0; i <= tamanho();i++) {
			builder.append(", valorDoIntervalo(");
			builder.append(i);
			builder.append(")=");
			builder.append(valorDoIntervalo(i));
		}
		builder.append("]");
		return builder.toString();
	}
	
	

}
