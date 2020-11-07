/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan39.nilaiterbesarterkecil;
import java.util.Scanner;

/**
 * @author
 * Nama      : Garry Prang
 * NIM       : 10116147
 * Kelas     : PBO-2
 * Deskripsi : Program untuk menentukan nilai tterbesar dan terkecil.
 */

public class PBO210116147Latihan39NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        Scanner scanner = new Scanner(System.in);
        String nama;
        
        System.out.println("======= Program Nilai Mahasiswa =======");
        System.out.print("Masukkan Nama Petugas\t: ");
        nama = scanner.nextLine();
        nilai.inputBanyakNilai();
        nilai.inputNilai();
        System.out.println();
        System.out.println("======== Hasil Nilai Mahasiswa ========");
        nilai.outputNilai();
        System.out.println("");
        System.out.println("Nilai Terbesar\t\t: " + nilai.max());
        System.out.println("Nilai Terkecil\t\t: " + nilai.min());
        System.out.println("");
        System.out.println("Petugas\t\t\t: " + nama);
    }
    
}
