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
public class Tetap extends Employees {
    public Tetap(String a, String b, int c, double d, String e, String f, int g){
super(a,b,c,d,e,f,g);
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
public void GajiTotal(){
    System.out.println("Gaji Total :"+super.gajitotal());
}
}   
