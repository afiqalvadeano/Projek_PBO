package project;

public class Kerucut extends Lingkaran
{
    private double tinggi;

    Kerucut(){
        
    }

    Kerucut(double tinggi, double radius)
    {
        this.tinggi = tinggi;
        super.setR(radius);
    }

    public double getTinggi() 
    {
        return tinggi;
    }

    public void setTinggi(double tinggi) 
    {
        this.tinggi = tinggi;
    }

    private double hitungsisiKerucut()
    {
        return Math.sqrt(Math.pow(super.getRadius(),2)+Math.pow(this.tinggi,2));
    }

    public double getsisiKerucut()
    {
        return hitungsisiKerucut();
    }

    private double hitungVolume()
    {
        return 1/3.0 * super.getLuas() * this.tinggi;
    }

    public double getVolume()
    {
        return hitungVolume();
    }

    private double hitungLuas()
    {
        return phi*super.getRadius()*(super.getRadius()+this.getsisiKerucut());
    }

    public double getLuas()
    {
        return this.hitungLuas();
    }
    
}
