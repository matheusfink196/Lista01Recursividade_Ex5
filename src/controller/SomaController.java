package controller;

public class SomaController {
	
	public SomaController() {
		super();
		
	}
	
	public double recsoma(double num) {
		if (num<=1) {
			return 1;
//ponto de saida = recursiva diminui 1 cada vez e quando chega 1 ele retorna			

		} else { 
			return 1/num + recsoma(num-1);
//passos = quando retorna o 1 a recursiva volta até o numero inicial	

			
		}
		
		
		
	}

}
