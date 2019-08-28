package Ex06;

public class Cardapio {
	
	private int codigo;
	private int quantidade;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo >= 100 && codigo <= 105)
			this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade > 0)
			this.quantidade = quantidade;
	}
	
	public float valorTotal() {
		final float preco100 = (float)1.20;
		final float preco101 = (float)1.30;
		final float preco102 = (float)1.50;
		final float preco103 = (float)1.20;
		final float preco104 = (float)1.30;
		final float preco105 = (float)1.00;
		
		float precoFinal = 0;
		
		switch (getCodigo()) {
		case 100:
			precoFinal = preco100;
			break;
		case 101:
			precoFinal = preco101;
			break;
		case 102:
			precoFinal = preco102;
			break;
		case 103:
			precoFinal = preco103;
			break;
		case 104:
			precoFinal = preco104;
			break;
		case 105:
			precoFinal = preco105;
			break;
		}
		return precoFinal * getQuantidade();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cardapio [codigo=");
		builder.append(codigo);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", valorTotal()=");
		builder.append(valorTotal());
		builder.append("]");
		return builder.toString();
	}
	
	

}
