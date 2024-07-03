package interfacee.estabelecimento;

import interfacee.equipamentos.impressora.*;
import interfacee.equipamentos.copiadora.*;
import interfacee.equipamentos.digitalizadora.*;
import interfacee.equipamentos.multifulcional.EquipamentoMultifuncional;

public class Loja {
	
	public static void main(String[] args) {
		
		
		
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Copiadora c = em;
		Impressora i = em;
		Digitalizadora d = em;

		
		/* 
		 * Método sendo executado da classe EquipamentoMultifuncional 
		 * porque no mesmo foi implementado a interface Impressora.
		 * Sendo assim, podendo executar diretamente da interface Impressora.
		*/
		em.impressora();
		em.copiadora();
		
		

		
		
		
	}
	
}
