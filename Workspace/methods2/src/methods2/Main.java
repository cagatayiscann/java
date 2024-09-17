package methods2;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel. ";
        String yeniMesaj = mesaj.substring(0, 2);
        String yeniMesaj1 = sehir();
        System.out.println(yeniMesaj);
        System.out.println(yeniMesaj1);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int toplam = topla2(1, 3, 4, 7, 9, 11);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi. ");

    }

    public static void sil() {
        System.out.println("Silindi. ");

    }

    public static void güncelle() {
        System.out.println("Güncellendi. ");

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehir() {
        return "Ankara";
    }

}
