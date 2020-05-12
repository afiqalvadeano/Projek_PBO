package project;

public class Tembereng2D extends Lingkaran
{
    private double sudut;

    public double getSudut() 
    {
        return sudut;
    }

    public void setDerajat(double sudut) 
    {
        this.sudut = sudut;
    }

    private double hitungBusur()
    {
        return (getSudut() * super.getKeliling()) / 360;
    }

    private double hitungTaliBusur()
    {
        double bagian = sudut/360;
        double hasilBusur = bagian*2*phi*r;
        return hasilBusur;
    }

    private double hitungKeliling() 
    {
        return hitungBusur()+hitungTaliBusur();
    }

    private double hitungLuas() 
    {
        double sin = Math.sin(sudut);
        double bagian = sudut/360;
        double hasilLuasTembereng = (bagian*phi*r*r)-(sin*r*r*0.5);
        return hasilLuasTembereng;
    }

    public double getLuas() 
    {
        return hitungLuas();
    }

    public double getKeliling() 
    {
        return hitungKeliling();
    }
}