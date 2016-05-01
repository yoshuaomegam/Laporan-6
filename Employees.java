package employees;
public class Employees {
private  String nama;
private  String id;
private  String jabatan;
private int masakerja;
protected double gaji;
protected double bonus1;
private double bonus2;
private double bonus3;
private double tunjangan;
private String istri;
private int anak;
public double gajitotal;
public Employees(String a, String b, int c, double d, String e, String f, int g){
    nama=a;
    id=b;
    masakerja=c;
    gaji=d;
    jabatan=e;
    istri=f;
    anak=g;
}
public Employees(String a, String b,  double d, String e){
    nama=a;
    id=b;
    gaji=d;
    jabatan=e;
}
private String getNama(){
    return nama;
}
private String getId(){
    return id;
}
private String getJabatan(){
    return jabatan;
}
private double gaji(){
    return gaji;
}
public double bonus1(){
    double bonus;
    if(masakerja<=5){
        bonus=0;
        tunjangan=0;
        bonus1=tunjangan+bonus;
    }
    else if(masakerja>=6 && masakerja<=10){
        bonus=masakerja*0.05*gaji;
        tunjangan=0;
        bonus1=tunjangan+bonus;
    }
    else{
        bonus=masakerja*0.1*gaji;
        tunjangan=masakerja*0.1*gaji;
        bonus1=tunjangan+bonus;
    }
    return bonus1;
}
public double istri(){
    if(istri.equalsIgnoreCase("Ya")){
    bonus2=(gaji+bonus1)*0.1;
}
    if(istri.equalsIgnoreCase("Tidak")){
        bonus2=0;
    }
    return bonus2;
}
public double anak(){
    if(anak==1){
    bonus3=(gaji+bonus1)*0.15;
    }
    else if(anak==2){
    bonus3=(gaji+bonus1)*0.3;
    }
    else if(anak>=3){
    bonus3=(gaji+bonus1)*0.45;
    }
    else if(anak==0){
        bonus3=0;
    }
    return bonus3;
}
public double gajitotal(){
    gajitotal=gaji+bonus1+bonus2+bonus3;
    return gajitotal;
}
}

    

