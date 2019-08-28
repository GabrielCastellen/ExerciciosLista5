package Ex07;

public class Quadrado {
	
	private float lado;

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		if(lado > 0)
			this.lado = lado;
	}
	
	public float area() {
		return (float)Math.pow(getLado(),2);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado [lado=");
		builder.append(lado);
		builder.append(", area()=");
		builder.append(area());
		builder.append("]");
		return builder.toString();
	}
	
	

}
