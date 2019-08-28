package Ex01;

public class NomeSobrenome {
	
	private String nome;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 1)
			this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		if(sobrenome.length() > 1)
			this.sobrenome = sobrenome;
	}
	
	public String nomeCompleto() {
		return nome + sobrenome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NomeSobrenome [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", nomeCompleto()=");
		builder.append(nomeCompleto());
		builder.append("]");
		return builder.toString();
	}
	
	
}
