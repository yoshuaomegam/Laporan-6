/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author yudi hermawan
 */
public class Manager extends Employees {
private double tunjanganjabatan;
double gajitotal1;
    public Manager(String a, String b, int c, double d, String e, String f, int g){
    super(a, b, c, d, e,f ,g);
    }
public void bonus(){
    System.out.println("Tunjangan Lama Kerja :"+super.bonus1());    
}
public void TunjanganIstri(){
    System.out.println("Tunjangan Isri :"+super.istri());
}
public void TunjanganAnak(){
    System.out.println("Tunjangan Anak :"+super.anak());
}
    public double tunjanganManager(){
     tunjanganjabatan=(gaji+bonus1)*0.1;
     return tunjanganjabatan;
    }
    public double gajiTotal(){
        gajitotal=gaji+super.bonus1()+super.istri()+super.anak()+tunjanganjabatan;
        return gajitotal;
    }
}
