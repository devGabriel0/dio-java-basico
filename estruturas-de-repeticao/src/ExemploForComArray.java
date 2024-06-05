
public class ExemploForComArray {
	public static void main(String[] args) {
		
		String nomes[] = {"Gabriel", "Israel", "Emanuel", "João"};
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(i + " - " + nomes[i]);
		}
		
		// For Each = recomendado para uso de arrays.
		for(String aluno : nomes) {
			
			if(aluno == "Gabriel") {
				System.out.println("Nome do aluno mais lindo: " + aluno);
			}else {
				System.out.println("Nome do aluno: " + aluno);
			}
			
		}
		
	}
}
