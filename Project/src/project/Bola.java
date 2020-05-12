package project;

public class Bola 
{
    
    public final double phi=3.14;
    double r;

    public double getRadius() 
    {
        return r;
    }

    public void setR(double r) 
    {
        this.r = r;
    }
    double volumeBola(double r)
    {
        double jari=r*r*r;
        double hasilVolumeBola = (phi*4*jari/3);
        return hasilVolumeBola;
    }

    double luasTembereng3D(double r,double t)
    {
        double hasilLuasTembereng3D = 2*phi*r*t;
        return hasilLuasTembereng3D;
    }
    
    double volumeTembereng3D(double r,double t)
    {
        double tinggi=t*t;
        double hasilVolumeTembereng3D = tinggi*(3*r-t)*2/3;
        return hasilVolumeTembereng3D;
    }
    
    double luasJuring3D(double r, double t)
    {
        double hasilLuasJuring3D = (2*phi*t)+(phi*r);
        return hasilLuasJuring3D;
    }
    
    double volumeJuring3D(double r, double t)
    {
        double jari=r*r;
        double hasilVolumeJuring3D = phi*jari*t*2/3;
        return hasilVolumeJuring3D;
    }
   
    
}