package interfacee.equipamentos.multifulcional;

import interfacee.equipamentos.copiadora.Copiadora;
import interfacee.equipamentos.digitalizadora.Digitalizadora;
import interfacee.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	public void copiadora() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
	}

	public void impressora() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
	}

	public void digitalizadora() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
	}
	
}
