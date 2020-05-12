/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import static java.lang.Math.pow;

/**
 *
 * @author ATANIA
 */
public class Venus extends Bola implements Runnable{
        protected double kRotasi, kRevolusi; 
    protected static double keliling,kecRotasi,kecRevolusi,lVenus,vVenus,pRevolusi;
    Thread thread;
    PenjalananThread pt ;
    
    public Venus(double radius,double pLintasanRevolusi,double kRotasi,double kRevolusi, PenjalananThread pt) {
        super.setR(radius);
        this.pRevolusi = pLintasanRevolusi ;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
         this.pt = pt ;
        thread = new Thread(this);
        
        //MENGISI NILAI
        getKelilingGarisTengahVenus();
        getLuasPermukaanVenus();
        getVolumeVenus();
        getKecepatanRotasiVenus();
        getKecepatanRevolusiVenus();
        
        
    }

    private double kelilingGarisTengahVenus() {
        keliling = 2*super.phi*super.r;
        return keliling ;
    }
    
    private double luasPermukaanVenus () {
        lVenus = 4 * super.phi* pow(super.r,2) ;
        return lVenus;
    }
    
    private double volumeVenus () {
        vVenus =(double)4/3 * super.phi * pow(super.r,3);
        return vVenus;
    }
    
    private double kecepatanRotasiVenus () {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }
    
    private double kecepatanRevolusiVenus () {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }
    //METHOD GET 
    protected double getKelilingGarisTengahVenus(){
        return kelilingGarisTengahVenus();
    }
    
    protected double getLuasPermukaanVenus () {
        return luasPermukaanVenus();
    }
    
    protected double getVolumeVenus () {
        return volumeVenus();
    }
    
    protected double getKecepatanRotasiVenus(){
        return kecepatanRotasiVenus();
    }
    
    protected double getKecepatanRevolusiVenus(){
        return kecepatanRevolusiVenus();
    }
    
    @Override
    public void run() {
        synchronized(pt){
            
            PenjalananThread.print("\nVenus : ", ""
                    + "\n - Keliling garis tengah : " + keliling+ ""
                    + "\n - Luas Permukaan : " + lVenus+ ""
                    + "\n - Volume : " +vVenus+ ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi+ ""
                    + "\n - Kecepatan Revolusi : " +kecRevolusi);
        }
    }
}
