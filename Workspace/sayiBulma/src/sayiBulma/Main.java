package sayiBulma;


public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 11;
		
		boolean flag = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				flag=true;
				System.out.println("aranan sayi bulundu.");
				break;
			}
		}
		if(!flag) {
			System.out.println("Aranan sayi bulunamadi.");
		}
	}

}
