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
public class Neptunus extends Bola implements Runnable {

    protected double  kRotasi, kRevolusi;
    protected static double keliling, kecRotasi, kecRevolusi, lNeptunus, vNeptunus,pRevolusi;
    Thread thread;
    PenjalananThread pt;

    public Neptunus(double radius, double pRevolusi, double kRotasi, double kRevolusi, PenjalananThread pt) {
        super.setR(radius);
        this.pRevolusi = pRevolusi;
        this.kRotasi = kRotasi;
        this.kRevolusi = kRevolusi;
        this.pt = pt ;
        thread = new Thread(this);

        kelilingGarisTengahNeptunus();
        luasPermukaanNeptunus();
        volumeNeptunus();
        kecepatanRotasiNeptunus();
        kecepatanRevolusiNeptunus();
    }

    private double kelilingGarisTengahNeptunus() {
        keliling = 2 * super.phi * super.r;
        return keliling;
    }

    private double luasPermukaanNeptunus() {
        lNeptunus = 4 * super.phi * pow(super.r, 2);
        return lNeptunus;
    }

    private double volumeNeptunus() {
        vNeptunus = (double) 4 / 3 * super.phi * pow(super.r, 3);
        return vNeptunus;
    }

    private double kecepatanRotasiNeptunus() {
        kecRotasi = keliling / kRotasi;
        return kecRotasi;
    }

    private double kecepatanRevolusiNeptunus() {
        kecRevolusi = pRevolusi / kRevolusi;
        return kecRevolusi;
    }

    //METHOD GET 
    protected double getKelilingGarisTengahNeptunus() {
        return kelilingGarisTengahNeptunus();
    }

    protected double getLuasPermukaanNeptunus() {
        return luasPermukaanNeptunus();
    }

    protected double getVolumeNeptunus() {
        return volumeNeptunus();
    }

    protected double getKecepatanRotasiNeptunus() {
        return kecepatanRotasiNeptunus();
    }

    protected double getKecepatanRevolusiNeptunus() {
        return kecepatanRevolusiNeptunus();
    }

    @Override
    public void run() {
        synchronized (pt) {
            PenjalananThread.print("\nNeptunus : ", ""
                    + "\n - Keliling garis tengah : " + keliling + ""
                    + "\n - Luas Permukaan : " + lNeptunus + ""
                    + "\n - Volume : " + vNeptunus + ""
                    + "\n - Kecepatan Rotasi : " + kecRotasi + ""
                    + "\n - Kecepatan Revolusi : " + kecRevolusi);
        }
    }
}
