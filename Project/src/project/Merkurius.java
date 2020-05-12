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
public class Merkurius extends Bola implements Runnable{
    protected double  kRotasi, kRevolusi; 
    protected static double keliling,kecRotasi,kecRevolusi,lMerkurius,vMerkurius,pRevolusi ;
    Thread thread;
    PenjalananThread pt ;
    
    public Merkurius(double radius,double pLintasanRevolusi,double kRotasi,double kRevolusi, PenjalananThread pt) {
        super.setR(radius);
        this.pRevolusi = pLintasanRevolusi ;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
        this.pt = pt ;
        thread = new Thread(this);
        
        //MENGISI NILAI
        getKelilingGarisTengahMerkurius();
        getLuasPermukaanMerkurius();
        getVolumeMerkurius();
        getKecepatanRotasiMerkurius();
        getKecepatanRevolusiMerkurius();
        

    }

    private double kelilingGarisTengahMerkurius() {
        keliling = 2*super.phi*super.r;
        return keliling ;
    }
    
    private double luasPermukaanMerkurius () {
         lMerkurius = 4 * super.phi* pow(super.r,2) ;
         return lMerkurius;
    }
    
    private double volumeMerkurius () {
        vMerkurius = (double)4/3 * super.phi * pow(super.r,3);
        return vMerkurius;
    }
    
    private double kecepatanRotasiMerkurius () {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }
    
    private double kecepatanRevolusiMerkurius () {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }
    //METHOD GET 
    protected double getKelilingGarisTengahMerkurius(){
        return kelilingGarisTengahMerkurius();
    }
    
    protected double getLuasPermukaanMerkurius () {
        return luasPermukaanMerkurius();
    }
    
    protected double getVolumeMerkurius () {
        return volumeMerkurius();
    }
    
    protected double getKecepatanRotasiMerkurius(){
        return kecepatanRotasiMerkurius();
    }
    
    protected double getKecepatanRevolusiMerkurius(){
        return kecepatanRevolusiMerkurius();
    }
    
    @Override
    public void run() {
         synchronized(pt){
            PenjalananThread.print("\nMerkurius : ", ""
                    + "\n - Keliling garis tengah : " + keliling+ ""
                    + "\n - Luas Permukaan : " + lMerkurius+ ""
                    + "\n - Volume : " +vMerkurius+ ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi+ ""
                    + "\n - Kecepatan Revolusi : " +kecRevolusi );
        }
    }
    
}
