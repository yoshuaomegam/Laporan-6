/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Scanner;

/**
 *
 * @author yudi hermawan
 */
public class MainEmployees {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int pilihan,lk,anak;
        double gaji;
         String nama,id, jabatan, istri;
        System.out.println("Program Menghitung Gaji");
        System.out.println("1. Pegawai Tetap");
        System.out.println("2. Pegawai Tidak Tetap");
        System.out.println("3. Manager");
        System.out.println("Masukkan Pilihan Anda :");
        pilihan=input.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("Masukkan nama :");
                nama=input.nextLine();input.nextLine();
                System.out.println("Masukkan ID Kerja :");
                id=input.nextLine();
                System.out.println("Masukkan Lama Kerja (Tahun) :");
                lk=input.nextInt();
                System.out.println("Masukkan gaji pokok anda :");
                gaji=input.nextDouble();
                System.out.println("Masukkan Jabatan Anda :");
                jabatan=input.nextLine();input.nextLine();
                System.out.println("Apakah Anda Punya Istri (Ya/Tidak) :");
                istri=input.nextLine();
                System.out.println("Berapa Anak yang anda miliki(tunjangan dihitung maksimal 3 anak) :"); 
                anak=input.nextInt();
                Tetap a = new Tetap(nama,id,lk,gaji,jabatan,istri,anak);
                System.out.println("Slip Gaji");
                System.out.println("Nama :"+nama);
                System.out.println("ID Kerja :"+id);
                System.out.println("Gaji Pokok"+gaji);
                a.bonus();
                a.TunjanganIstri();
                a.TunjanganAnak();
                a.GajiTotal();
            case 2:
                System.out.println("Masukkan nama :");
                nama=input.nextLine();input.nextLine();
                System.out.println("Masukkan ID Kerja :");
                id=input.nextLine();
                System.out.println("Masukkan Gaji pokok :");
                gaji=input.nextDouble();
                System.out.println("Masukkan Jabatan Anda : ");
                jabatan=input.nextLine();input.nextLine();
                TidakTetap b=new TidakTetap(nama,id,gaji,jabatan);
                System.out.println("Masukkan Jam Kerja :");
                int jamkerja=input.nextInt();
                b.setJamKerja(jamkerja);
                System.out.println("Slip Gaji");
                System.out.println("Nama :"+nama);
                System.out.println("ID Kerja :"+id);
                System.out.println("Gaji Pokok :"+gaji);
                System.out.println("Anda Mendapatkan tambahan lembur sebesar :"+b.gajilembur());
                System.out.println("Total Gaji Anda "+b.gajiTotal());
            case 3:
                                System.out.println("Masukkan nama :");
                nama=input.nextLine();input.nextLine();
                System.out.println("Masukkan ID Kerja :");
                id=input.nextLine();
                System.out.println("Masukkan Lama Kerja (Tahun) :");
                lk=input.nextInt();
                System.out.println("Masukkan gaji pokok anda :");
                gaji=input.nextDouble();
                System.out.println("Masukkan Jabatan Anda :");
                jabatan=input.nextLine();input.nextLine();
                System.out.println("Apakah Anda Punya Istri (Ya/Tidak) :");
                istri=input.nextLine();
                System.out.println("Berapa Anak yang anda miliki(tunjangan dihitung maksimal 3 anak) :"); 
                anak=input.nextInt();
                Manager c = new Manager(nama,id,lk,gaji,jabatan,istri,anak);
                System.out.println("Slip Gaji");
                System.out.println("Nama :"+nama);
                System.out.println("ID Kerja :"+id);
                System.out.println("Gaji Pokok :"+gaji);                
                c.bonus();
                c.TunjanganIstri();
                c.TunjanganAnak();
                System.out.println("Tunjangan Manager :"+c.tunjanganManager());
                System.out.println("Total Gaji Anda"+c.gajiTotal());
                
                
        }
    }
}
