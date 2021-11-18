package com.Tugas4;

public class Main {

    public static void main(String[] args) {
        Karyawan karyawan1 = new Tetap("Putri", 1000000, 5000000);
        Karyawan karyawan2 = new Tetap("Bintang", 2000000, 6000000);

        Karyawan karyawan3 = new Kontrak("Frisca", 40, 7000000);

        Departemen departemen = new Departemen("Rayhan");

        departemen.addKaryawan(karyawan1);
        departemen.addKaryawan(karyawan2);
        departemen.addKaryawan(karyawan3);

        System.out.println("\n Data Semua Kayawan \uD83D\uDC47\n");
        departemen.displayAll();

        System.out.println("\n Data Karyawan Tetap \uD83D\uDC47\n");
        departemen.displayTetap();

        System.out.println("\n Data Karyawan Kontrak \uD83D\uDC47\n");
        departemen.displayKontrak();
    }
}