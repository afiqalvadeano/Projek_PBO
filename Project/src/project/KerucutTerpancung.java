package project;

public class KerucutTerpancung extends Kerucut 
{
    private double radius2;

    public double getR2() 
    {
        return radius2;
    }

    public void setR2(double radius2) 
    {
        this.radius2 = radius2;
    }

    private double hitungVolume() 
    {
        return 1 / 3.0 * phi * super.getTinggi()
                * (Math.pow(super.getRadius(), 2) + Math.pow(this.radius2, 2) + (super.getRadius() * this.radius2));
    }

    public double getVolume() 
    {
        return hitungVolume();
    }

    private double hitungA() 
    {
       return Math.sqrt(Math.pow(super.getTinggi(), 2) + Math.pow((Math.abs(super.getRadius() - this.radius2)), 2));
    }

    private double hitungLuasSelimut() 
    {
        return phi * hitungA() * (super.getRadius() + this.radius2);
    }

    public double getLuasSelimut() 
    {
        return hitungLuasSelimut();
    }

    private double hitungLuas() 
    {
        return getLuasSelimut() + phi * (Math.pow(super.getRadius(), 2) + Math.pow(this.radius2, 2));
    }

    public double getLuas() 
    {
        return hitungLuas();
    }

    public void setRadius(double r1, double r2) throws ExceptionKerucutTerpancung 
    {
        if (r1 != r2) 
        {
            super.setR(r1);
            this.radius2 = r2;
        } else 
        {
            ExceptionKerucutTerpancung e = new ExceptionKerucutTerpancung("Jari-jari 1 sama dengan jari-jari 2. bangun bukan merupakan kerucut pancung");
            throw e;
        }
    }
}