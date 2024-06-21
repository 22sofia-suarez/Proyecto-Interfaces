
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo bermudas= new Triangulo("Bermudas", 20, 10, 15);
		Cuadrado bob=new Cuadrado ("Bob", 30);
		Rectangulo r =new Rectangulo("R",20,10);
		Rombo rom= new Rombo("Rom", 10,10,10);
		Romboide rb=new Romboide("RB",15,15);
		Trapecio trap=new Trapecio("trap", 10, 20, 10, 15);
		imprimirCalculo(bermudas);
		imprimirCalculo(r);
		imprimirCalculo(bob);
		imprimirCalculo(rom);
		imprimirCalculo(rb);
		imprimirCalculo(trap);
		

	}
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+======================+");
		System.out.println("| El área de [" + f.getNombre()
				+ "] es : "+ f.calcularArea());
		System.out.println("| El perímetro de [" + f.getNombre()
		+ "] es : "+ f.calcularPerimetro());
		System.out.println("+======================+");
	}
}