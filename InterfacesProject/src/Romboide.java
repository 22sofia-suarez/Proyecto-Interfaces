
public class Romboide implements FiguraGeometrica{
	private String nombre;
	private double altura;
	private double base;
	public Romboide(String nombre, double altura, double base ){
		super();
		this.nombre = nombre;
		this.base = altura;
		this.altura = base;
	}
		public double calcularArea() {
			return (altura*base);
		}//calcular área
		
		public double calcularPerimetro() {
			return(altura+base)*2;
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
		public void setAltura(double altura) {
			this.altura = altura;
		}
		@Override
		public String toString() {
			return "Romboide [nombre=" + nombre + ", altura=" + altura + ", base=" + base + "]";
		}
	
		
	

		//GettersanSetters
		
		
		
		//toString

}
