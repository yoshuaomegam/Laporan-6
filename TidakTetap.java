package employees;
public class TidakTetap extends Employees {
    private int jamkerja;
    private int lembur;
    private double hasillembur;
    
    public TidakTetap(String a, String b,  double d, String e){
        super(a,b,d,e);
}
    public void setJamKerja(int a){
        jamkerja=a;
    }
    public int getJamKerja(){
        return jamkerja;
    }
    public double gajilembur(){
        if(jamkerja>=10){
            lembur=jamkerja/10;
            hasillembur=lembur*10000;
        }
        else{
            hasillembur=0;
        }
        return hasillembur;
    }
    public double gajiTotal(){
        gajitotal=hasillembur+super.gajitotal();
        return gajitotal;
    }
}
    

