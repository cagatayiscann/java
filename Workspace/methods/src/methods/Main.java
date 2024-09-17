package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(5);

	}



	public static void sayiBulmaca(int sayiGirdisi) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = sayiGirdisi;
		
		boolean flag = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				flag=true;
				System.out.println("aranan sayi bulundu: " + aranacak);
				break;
			}
		}
		if(!flag) {
			System.out.println("Aranan sayi bulunamadi: " + aranacak);
		}
	}
};
