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

        System.out.print("Masukkan judul: ");
        String judul = scan.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scan.nextLine();
        System.out.print("Masukkan harga: ");
        double harga = scan.nextDouble();

        System.out.println("Pilihan Kategori");

        Kategori_list kategoruList[] = Kategori_list.values();
        for(int i = 1; i < kategoruList.length; i++){
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