package project;

public class Busur extends Lingkaran
{
     private double sudut;

    public double getSudut() 
    {
        return sudut;
    }

    public void setSudut(double sudut) 
    {
        this.sudut = sudut;
    }

    private double hitungPanjangBusur() 
    {
        return (getSudut() * super.getKeliling()) / 360;
    }

    public double getPanjangBusur() 
    {
        return hitungPanjangBusur();
    }
    
}
