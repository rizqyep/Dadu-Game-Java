package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in)   ;
	Pemain baru = new Pemain("Nama");
	Dadu dadu = new Dadu();
	int tebak,sisi;
	char lanjut;
    System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+");
    System.out.println("   Permainan tebak dadu   ");
    System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=");

	System.out.print("Masukkan nama pemain : ");
	String nama = sc.nextLine();
	baru.setNama(nama);
	System.out.println(baru.getNama());
	do{
    System.out.print("Masukkan tebakan nilai dadu : ");
    tebak = sc.nextInt();
    baru.setNilai(tebak);
    System.out.println(baru.getNilai());
    dadu.lemparDadu();
    sisi = dadu.getSisi();
    if(tebak!= sisi){
        System.out.println("Tebakan kamu masih salah,nilai dadu " + sisi);
    }
    System.out.println("Ingin menebak lagi ? (input y / n )");
	lanjut = sc.next().charAt(0);
	}while(lanjut == 'y');

    }
}
