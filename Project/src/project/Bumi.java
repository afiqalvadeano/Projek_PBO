package project;
import static java.lang.Math.pow;
/**
 *
 * @author ATANIA
 */
public class Bumi extends Bola implements Runnable{
    
    private double  kRotasi, kRevolusi; 
    protected static double keliling,kecRotasi,kecRevolusi,lBumi,vBumi , pRevolusi;
    Thread thread;
    PenjalananThread pt ;
    
    
    public Bumi(double radius,double pLintasanRevolusi,double kRotasi,double kRevolusi, PenjalananThread pt) {
        super.setR(radius);
        this.pRevolusi = pLintasanRevolusi ;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
        this.pt = pt ;
        thread = new Thread(this);
        
        //MENGAMBIL NILAI
        getKelilingGarisTengahBumi();
        getLuasPermukaanBumi();
        getVolumeBumi();
        getKecepatanRotasiBumi();
        getKecepatanRevolusiBumi();

    }

    protected double kelilingGarisTengahBumi() {
        keliling = 2*super.phi*super.r;
        return keliling ;
    }
    
    protected double luasPermukaanBumi () {
        lBumi = 4 * super.phi* pow(super.r,2) ;
        return lBumi;
    }
    
    private double volumeBumi () {
        vBumi = (double)4/3 * super.phi * pow(super.r,3);
        return vBumi;
    }
    
    private double kecepatanRotasiBumi () {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }
    
    private double kecepatanRevolusiBumi () {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }
    //METHOD GET 
    protected double getKelilingGarisTengahBumi(){
        return kelilingGarisTengahBumi();
    }
    
    protected double getLuasPermukaanBumi () {
        return luasPermukaanBumi();
    }
    
    protected double getVolumeBumi () {
        return volumeBumi();
    }
    
    protected double getKecepatanRotasiBumi(){
        return kecepatanRotasiBumi();
    }
    
    public double getKecepatanRevolusiBumi(){
        return kecepatanRevolusiBumi();
    }
    
    @Override
    public void run() {
        synchronized(pt){
            PenjalananThread.print("\nBumi : ", ""
                    + "\n - Keliling garis tengah : " + keliling+ ""
                    + "\n - Luas Permukaan : " + lBumi + ""
                    + "\n - Volume : " +vBumi + ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi + ""
                    + "\n - Kecepatan Revolusi : " +kecRevolusi);
        }
    }
    
}