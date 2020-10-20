/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119079.latihan5.kambingglobal;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:   Berisi codingan dengan contoh Kambing Global
 *
 */
public class PBOIF210119079Latihan5KambingGlobal {

    // variabel jumlahkambing menjadi variabel instance
    int jumlahkambing = 88;

    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahkambing);

    }

    public void tambahKambing() {
        jumlahkambing = jumlahkambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +
                            jumlahkambing);
    }

    public static void main(String[] args) {
        PBOIF210119079Latihan5KambingGlobal kambingSusu = new PBOIF210119079Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }

}
