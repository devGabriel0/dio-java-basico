package constructor;

public enum ExemploDeEnum {
	SAO_PAULO("SP", "São Paulo"),
	RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
	PIAUI("PI", "Piauí"),
	MARANHAO("MA", "Maranhão") ;

	private String nome;
	private String sigla;
	
	private ExemploDeEnum(String sigla, String nome) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
		
	}
	
}
