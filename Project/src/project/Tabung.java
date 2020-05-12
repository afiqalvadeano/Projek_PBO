package project;


public class Tabung extends Lingkaran{
   private double tinggi;

    public double getTinggi() 
    {
        return tinggi;
    }

    public void setTinggi(double tinggi) 
    {
        this.tinggi = tinggi;
    }

    private double hitungLuas() 
    {
        return super.getKeliling() * (super.getRadius() + getTinggi());
    }

    private double hitungVolume() 
    {
        return super.getLuas() * getTinggi();
    }

    public double getLuas() 
    {
        return hitungLuas();
    }

    public double getVolume() 
    {
        return hitungVolume();
    } 
    
}
