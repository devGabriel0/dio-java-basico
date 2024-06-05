
public class Usuario {
	
	public static void main(String[] args) throws Exception{
		SmartTv smartTv = new SmartTv();
		
		
		if(smartTv.ligada == false) {
			System.out.println("A televisão está desligada.");
		} else {
			System.out.println("A televisão está ligada. ");
			System.out.println("Está no canal: " + smartTv.canal);
			System.out.println("Está no volume: " + smartTv.volume);
		}
		
		smartTv.desligar();
		System.out.println("Tv ligada? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Volume: " + smartTv.volume);
		smartTv.diminuirVolume();
		
		
		smartTv.mudarCanal(10);
		System.out.println("Está no canal: " + smartTv.canal);
	}
	
}
