package prak1;

import java.util.Scanner;

class Buku <A,B>{
    public A judul;
    public B pengarang;
    public double harga;
    public String kategori;

    public Buku(A judul, B pengarang, double harga, String kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
        this.kategori = kategori;
    }

    public A getJudul() {
        return judul;
    }

    public B getPengarang() {
        return pengarang;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void displayInfo(){
        System.out.println("Informasi Buku: ");
        System.out.println("judul: "+getJudul());
        System.out.println("pengarang: "+getPengarang());
        System.out.println("harga: "+getHarga());
        System.out.println("kategori: "+getKategori());
    }
}

enum Kategori_list{
    NOVEL, BIOGRAFI, TEKNOLOGI, ANAK
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String judul;
        do {
            System.out.print("Masukkan judul: ");
            judul = scan.nextLine();

            if(judul.matches(".*[0-9].*")){
                System.out.println("harus huruf");
            }
        } while (judul.matches(".*[0-9].*"));

        String pengarang;
        do {
            System.out.print("Masukkan pengarang: ");
            pengarang = scan.nextLine();

            if(pengarang.matches(".*[0-9].*")){
                System.out.println("harus huruf");
            }
        } while (pengarang.matches(".*[0-9].*"));

        double harga;
        do {
            System.out.print("Masukkan harga: ");
            harga = scan.nextDouble();

            if(harga < 0){
                System.out.println("harus positif");
            }
        } while (harga < 0);
        
        

        System.out.println("Pilihan Kategori");

        Kategori_list kategoruList[] = Kategori_list.values();
        for(int i = 0; i < kategoruList.length; i++){
            System.out.println(i+" "+kategoruList[i]);
        }

        System.out.print("Pilih: ");
        int pilihan = scan.nextInt();
        Kategori_list Kategori = kategoruList[pilihan];

        Buku<String, String> buku = new Buku<>(judul, pengarang, harga, Kategori.toString());
        buku.displayInfo();

        scan.close();
    }
}