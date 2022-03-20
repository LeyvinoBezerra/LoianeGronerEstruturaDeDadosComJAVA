package loianeGroner_EstruturaDeDadosComJAVA;

public class Main {

	public static void main(String[] args) {
		double[] temperatura = new double[10];

		temperatura[0] = 18.6;
		temperatura[1] = 22.0;
		temperatura[2] = 23.6;
		temperatura[3] = 27.6;
		temperatura[4] = 32.6;

		System.out.println("O valor da temperatura hoje é:" + temperatura[4]);

		System.out.println("o tamanho do array é:" + temperatura.length);

		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("temperatura do dia:" + (i+1) + "E:" + temperatura[1]);
		}

	}
}