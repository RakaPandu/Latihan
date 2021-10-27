import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tiket Perjalanan Dari Bandung");
        System.out.println("-----------------------------");
        System.out.print("Masukan Kota Tujuan = ");
        String kota = in.nextLine();
        System.out.print("Masukan jumlah penumpang = ");
        int penumpang = in.nextInt();

        hasil(kota, penumpang);
    }
    private static void hasil(String kota, int penumpang) {
        switch(kota){
            case "Jakarta" :
                int biaya = 145000*penumpang;
                System.out.println("-------------------");
                System.out.println("Bandung - "+kota);
                System.out.println("");
                System.out.println("Biaya tiket");
                System.out.println("145000 X "+penumpang+" : "+biaya);
                System.out.println("Diskon 0%  : 0");
                System.out.println("Total : "+biaya);
                break;
            case "Bogor" :
                biaya = 200000*penumpang;

                if (biaya > 250000){
                    int diskon = (biaya/100)*10;
                    System.out.println("-------------------");
                    System.out.println("Bandung - "+kota);
                    System.out.println("");
                    System.out.println("Biaya tiket ");
                    System.out.println("200000 X "+penumpang+" : "+biaya);
                    System.out.println("Diskon 10%  : "+diskon);
                    System.out.println("Total : "+(biaya-diskon));
                }
                else{
                    System.out.println("-------------------");
                    System.out.println("Bandung - "+kota);
                    System.out.println("");
                    System.out.println("Biaya tiket ");
                    System.out.println("200000 X "+penumpang+" : "+biaya);
                    System.out.println("Diskon 0%  : 0");
                    System.out.println("Total : "+biaya);
                }
                break;
            case "Garut" :
                biaya = 75000*penumpang;
                System.out.println("-------------------");
                System.out.println("Bandung - "+kota);
                System.out.println("");
                System.out.println("Biaya tiket ");
                System.out.println("75000 X "+penumpang+" : "+biaya);
                System.out.println("Diskon 0%  : 0");
                System.out.println("Total : "+biaya);
                break;
            case "Purwakarta" :
                biaya = 75000*penumpang;
                System.out.println("-------------------");
                System.out.println("Bandung - "+kota);
                System.out.println("");
                System.out.println("Biaya tiket ");
                System.out.println("75000 X "+penumpang+" : "+biaya);
                System.out.println("Diskon 0%  : 0");
                System.out.println("Total : "+biaya);
                break;
            default :
                System.out.println("----Nama kota yang dimasukan invalid'----");
        }
    }
}

