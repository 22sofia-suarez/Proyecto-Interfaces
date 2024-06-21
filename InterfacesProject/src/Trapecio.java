
public class Trapecio implements FiguraGeometrica {
	private String nombre;;
	private double base;
	private double BASE;
	private double altura;
	private double lado;
	

	public Trapecio(String nombre, double base, double altura, double lado, double BASE ){
		super();
		this.nombre = nombre;
		this.base = base;
		this.BASE=BASE;
		this.altura = altura;
		this.lado = lado;
	
	
	}
	//Constructor
	
	public double calcularArea() {
		return ((base+BASE)*altura)/2;
	}//calcular área
	
	public double calcularPerimetro() {
		return(lado+lado+base+BASE);
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
	public double getBASE() {
		return BASE;
	}
	public void setBASE(double bASE) {
		BASE = bASE;
	}

	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", base=" + base + ", BASE=" + BASE + ", altura=" + altura + ", lado="
				+ lado + "]";
	}
	
	
	
}
