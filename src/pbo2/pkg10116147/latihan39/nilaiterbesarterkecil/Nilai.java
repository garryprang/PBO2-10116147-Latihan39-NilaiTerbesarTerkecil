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

public class Nilai {
    Scanner scanner = new Scanner(System.in);
    int[]nilai = new int [10];
    int n;
    int max;
    int min;
    
    public int inputBanyakNilai() {
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        n = scanner.nextInt();
        return n;
    }
    
    public void inputNilai() {
        for (int i = 1; i <=n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + "\t: ");
            nilai[i] = scanner.nextInt();
        }
    }
    
    public void outputNilai() {
        for (int i = 1; i <=n; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + "\t: " + nilai[i]);
        }
    }
    
    public int max () {
        max=nilai[1];
        for (int i = 1; i <=n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }
    
    public int min () {
        min=nilai[1];
        for (int i = 1; i <=n; i++) {
            if (nilai[i] < min) {
                min=nilai[i];
            }
        }
        return min;
    }
}
