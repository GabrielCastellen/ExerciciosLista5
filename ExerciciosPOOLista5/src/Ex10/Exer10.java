package lista05.Ex10;

public class Exer09{

	private int canal;
	private int volume;

	public Exer09(){
		canal = 1;
		volume = 12;
	}

	public void setCanal(int canal){
		if(canal > 0)
			this.canal = canal;
	}
	
	public void setVolume(int volume){
		if(volume >= 0 && volume <= 100)
			this.nome = nome;
	}

	public int getCanal(){
		return numeroConta;
	}

	public String getVolume(){
		return nome;
	}

	public void aumentarCanal(){
		setCanal(canal+1);
	}

	public void diminuirCanal(){
		setCanal(canal-1);
	}
	
	public void aumentarVolume(){
		setCanal(volume+1);
	}

	public void diminuirVolume(){
		setCanal(volume-1);
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Canal: ");
		builder.append(canal);
		builder.append("Volume: ");
		builder.append(volume);
		return builder.toString();
	}
}