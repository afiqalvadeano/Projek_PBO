package project;

public class Lingkaran 
{
    public final double phi = 22/7.0;
    double r;

    public double getRadius() 
    {
        return r;
    }

    public void setR(double r) 
    {
        this.r = r;
    }

    private double hitungLuas() 
    {
        double jari= r;
        double hasilLuas = phi*jari*jari;
        return hasilLuas;
    }

    private double hitungKeliling() 
    {
        return phi * 2 * r;
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