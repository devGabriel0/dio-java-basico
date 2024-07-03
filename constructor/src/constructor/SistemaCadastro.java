package constructor;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa(null, null);
		
		// Definir nome da pessoa
		//p.setNome("Gabriel");
		//p.setCpf("123.456.789-00");
		p.setEndereco("Rua das Graças, 123 - São Paulo ");

		
		System.out.println("Nome: " + p.getNome() + "\nCpf: " + p.getCpf() + "\nEndereço: " + p.getEndereco());
		
	}
	
}
