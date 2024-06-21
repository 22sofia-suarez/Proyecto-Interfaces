
public class Rombo implements FiguraGeometrica{
	private String nombre;;
private double diagonal;
private double DIAGONAL;
private double lado;

	public Rombo (String nombre, double diagonal, double DIAGONAL, double lado){
		super();
		this.nombre = nombre;
		this.diagonal=diagonal;
		this.DIAGONAL= DIAGONAL;
		this.lado = lado;
	
	}
	//Constructor
	
	public double calcularArea() {
		return (DIAGONAL*diagonal)/2;
	}//calcular área
	
	public double calcularPerimetro() {
		return lado*4;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public double getDIAGONAL() {
		return DIAGONAL;
	}

	public void setDIAGONAL(double dIAGONAL) {
		DIAGONAL = dIAGONAL;
	}

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagonal=" + diagonal + ", DIAGONAL=" + DIAGONAL + ", lado=" + lado + "]";
	}
	
	
}
