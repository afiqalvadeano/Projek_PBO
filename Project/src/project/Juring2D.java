package project;

public class Juring2D extends Lingkaran
{
   private double derajat;

    public double getDerajat() 
    {
        return derajat;
    }

    public void setDerajat(double derajat) 
    {
        this.derajat = derajat;
    }

    private double hitungKeliling() 
    {
        return derajat / 360 * super.getKeliling() + 2 * super.getRadius();
    }

    private double hitungLuas() 
    {
        return derajat / 360 * super.getLuas();
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
