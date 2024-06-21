
public class Triangulo  implements FiguraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public Triangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	//Constructor
	
	public double calcularArea() {
		return (base*altura)/2;
	}//calcular área
	
	public double calcularPerimetro() {
		return(lado+lado+lado);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altuta) {
		this.altura = altuta;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	//GettersanSetters
	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}
	
	
	//toString
}
