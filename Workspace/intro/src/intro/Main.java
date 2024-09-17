package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int vade = 12;
		double dolarDun = 33.1;
		double dolarBugun = 33.13;
		boolean dolarDustuMu = false;
		String yukariOk = "up.svg";
		String asagiOk = "down.svg";
		
		if(dolarDun>dolarBugun) {
			System.out.println(asagiOk);
		}
		else {
			System.err.println(yukariOk);
		}
		
		String[] arr = {"a","b","c","d","e"};
		
		for (int i = 0; i < arr.length; i++) {
			System.err.println(arr[i]);
		}

	}

}
