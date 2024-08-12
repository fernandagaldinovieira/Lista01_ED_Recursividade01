package controller;

public class SomaNaturaisController {

	public SomaNaturaisController() {
		super();
	}

	public int somaNaturais(int i) {
		//Condição de parada: Se o número for negativo, retorna zero
		if (i < 0) {
			return 0;
		} else {
			//Soma i até i - 1
			return i + somaNaturais(i - 1);
		}
	}
}
