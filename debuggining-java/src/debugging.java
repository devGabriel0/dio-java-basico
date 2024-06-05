
public class debugging {

	public static void main(String[] args) {

		System.out.println("Inicio do programa no método main.");
		a();
		System.out.println("Fim do programa no método main.");

	}

	static void a() {
		System.out.println("Inicio do programa no método a.");
		b();
		System.out.println("Fim do programa no método a.");
	}

	static void b() {
		System.out.println("Inicio do programa no método b.");
		for(int i = 0; i <= 4; i++)System.out.println(i);
		c();
		System.out.println("Fim do programa no método b.");
	}

	static void c() {
		System.out.println("Inicio do programa no método c.");
		
		System.out.println("Fim do programa no método c.");
	}
}
