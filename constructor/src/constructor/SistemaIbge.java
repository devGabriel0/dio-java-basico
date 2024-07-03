package constructor;

public class SistemaIbge {

	public static void main(String[] args) {
		for(ExemploDeEnum e: ExemploDeEnum.values()) {
			System.out.println(e.getNome() + " - " + e.getSigla());
		}
		
		ExemploDeEnum e = ExemploDeEnum.SAO_PAULO;
		
		System.out.println(e.getNome() + "\n" + e.getNomeMaiusculo() + "\n" + e.getSigla());
		
		
	}
	
	
}
