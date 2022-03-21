package loianeGroner_EstruturaDeDadosComJAVA.Aula3;

public class Aula03 {

	public static void main(String[] args) {
	
		Vetor vetor = new Vetor(10); 
		
		try {

			vetor.adicionar("Leyva!");
			vetor.adicionar("Leyva!");
			vetor.adicionar("Leyva!");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
