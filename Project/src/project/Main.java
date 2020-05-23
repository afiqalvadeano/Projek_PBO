package project;

import java.util.*;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) throws Exception {

        PenjalananThread pt = new PenjalananThread();
        int pilih;
        char kembali;
        Scanner input = new Scanner(System.in);
        RandomAccessFile fSumber = null;

        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Bangun Ruang");
            System.out.println("2. Planet");
            System.out.println("3. Ilustrasi");
            System.out.print("Pilih :  ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1: {
                    int jari2, tinggi, sudut, jari2alas;
                    System.out.println("Masukan Jari-Jari ");
                    jari2 = input.nextInt();
                    System.out.println("Masukan Tinggi ");
                    tinggi = input.nextInt();
                    System.out.println("Masukan Besar Sudut ");
                    sudut = input.nextInt();
                    Lingkaran satu = new Lingkaran();

                    satu.setR(jari2);

                    System.out.printf("Luas lingkaran = %f cm2", satu.getLuas());
                    System.out.printf("\nKeliling lingkaran = %f cm2", satu.getKeliling());

                    Busur dua = new Busur();

                    dua.setR(jari2);
                    dua.setSudut(sudut);

                    System.out.printf("\n\nPanjang Busur = %f cm", dua.getPanjangBusur());

                    Bola tiga = new Bola();

                    System.out.printf("\n\nVolume Bola = %f cm", tiga.volumeBola(jari2));
                    System.out.printf("\n\nLuas Permukaan Tembereng 3D = %f cm", tiga.luasTembereng3D(jari2, tinggi));
                    System.out.printf("\n\nVolume Tembereng 3D = %f cm", tiga.volumeTembereng3D(jari2, tinggi));
                    System.out.printf("\n\nLuas Permukaan Juring 3D = %f cm", tiga.luasJuring3D(jari2, tinggi));
                    System.out.printf("\n\nVolume Juring 3D = %f cm", tiga.volumeJuring3D(jari2, tinggi));

                    Tembereng2D empat = new Tembereng2D();

                    empat.setR(jari2);
                    empat.setDerajat(sudut);

                    System.out.printf("\n\nKeliling Tembereng 2D = %f cm", empat.getKeliling());
                    System.out.printf("\nLuas Tembereng 2D = %f cm", empat.getLuas());

                    Juring2D lima = new Juring2D();

                    lima.setDerajat(sudut);
                    lima.setR(jari2);

                    System.out.printf("\n\nKeliling Juring 2D = %f cm", lima.getKeliling());
                    System.out.printf("\nLuas Juring 2D = %f cm", lima.getLuas());

                    Kerucut enam = new Kerucut();

                    enam.setR(jari2);
                    enam.setTinggi(tinggi);

                    System.out.printf("\n\nVolume Kerucut = %f cm", enam.getVolume());
                    System.out.printf("\n\nLuas Permukaan Kerucut = %f cm", enam.getLuas());

                    KerucutTerpancung tujuh = new KerucutTerpancung();
                    System.out.println("Masukkan Jari-jari Lingkaran Alas");
                    jari2alas = input.nextInt();

                    tujuh.setR(jari2);
                    tujuh.setR2(jari2alas);
                    tujuh.setTinggi(tinggi);

                    System.out.printf("\n\nVolume Kerucut Terpancung = %f cm", tujuh.getVolume());
                    System.out.printf("\n\nLuas Permukaan Kerucut Terpancung = %f cm", tujuh.getLuas());

                    Tabung delapan = new Tabung();

                    delapan.setTinggi(tinggi);
                    delapan.setR(jari2);

                    System.out.printf("\n\nLuas Permukaan Tabung = %f cm2", delapan.getLuas());
                    System.out.printf("\nVolume Tabung = %f cm3", delapan.getVolume());
                    break;
                }
                case 2: {
                    double rMerkurius, rVenus, rBumi, rMars, rJupiter, rSaturnus, rUranus, rNeptunus;
                    double linRevMerkurius, linRevVenus, linRevBumi, linRevMars, linRevJupiter, linRevSaturnus, linRevUranus, linRevNeputunus;
                    double lKalaRevMerkurius, lKalaRevVenus, lKalaRevBumi, lKalaRevMars, lKalaRevJupiter, lKalaRevSaturnus, lKalaRevUranus, lKalaRevNeptunus;
                    double lKalaRoMerkurius, lKalaRoVenus, lKalaRoBumi, lKalaRoMars, lKalaRoJupiter, lKalaRoSaturnus, lKalaRoUranus, lKalaRoNeptunus;

                    try {
                    String file = "E:\\UPN\\SMT 4\\PBO\\Project\\coba.txt";
                    fSumber = new RandomAccessFile(file, "rw");
                    
                    if (fSumber.length() < 1) {
                    System.out.println("--- Merkurius ---");
                    System.out.print("Masukkan Jari-Jari Merkurius : ");
                    rMerkurius = input.nextDouble();
                    System.out.print("Masukkan Lintasan Revolusi        : ");
                    linRevMerkurius = input.nextDouble();
                    System.out.print("Masukkan Kala Rotasi              : ");
                    lKalaRoMerkurius = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevMerkurius = input.nextDouble();
                    
                    fSumber.writeDouble(rMerkurius);
                        fSumber.writeDouble(linRevMerkurius);
                        fSumber.writeDouble(lKalaRoMerkurius);
                        fSumber.writeDouble(lKalaRevMerkurius);

                    Merkurius satu = new Merkurius(rMerkurius, linRevMerkurius, lKalaRoMerkurius, lKalaRevMerkurius, pt);

                    System.out.println("---Venus---");
                    System.out.print("Masukkan Jari-Jari Venus : ");
                    rVenus = input.nextDouble();
                    System.out.print("Masukkan Lintasan Revolusi        : ");
                    linRevVenus = input.nextDouble();
                    System.out.print("Masukkan Kala Rotasi              : ");
                    lKalaRoVenus = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevVenus = input.nextDouble();
                    
                    fSumber.writeDouble(rVenus);
                        fSumber.writeDouble(linRevVenus);
                        fSumber.writeDouble(lKalaRoVenus);
                        fSumber.writeDouble(lKalaRevVenus);

                    Venus dua = new Venus(rVenus, linRevVenus, lKalaRoVenus, lKalaRevVenus, pt);

                    System.out.println("---Bumi---");
                    System.out.print("Masukkan Jari-Jari Bumi : ");
                    rBumi = input.nextDouble();
                    System.out.print("MasukkanLintasan Revolusi        : ");
                    linRevBumi = input.nextDouble();
                    System.out.print("Masukkan Kala Rotasi              : ");
                    lKalaRoBumi = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevBumi = input.nextDouble();
                    
                    fSumber.writeDouble(rBumi);
                        fSumber.writeDouble(linRevBumi);
                        fSumber.writeDouble(lKalaRoBumi);
                        fSumber.writeDouble(lKalaRevBumi);

                    Bumi tiga = new Bumi(rBumi, linRevBumi, lKalaRoBumi, lKalaRevBumi, pt);

                    System.out.println("---Mars---");
                    System.out.print("Masukkan Jari-Jari Mars : ");
                    rMars = input.nextDouble();
                    System.out.print("Masukkan Lintasan Revolusi        : ");
                    linRevMars = input.nextDouble();
                    System.out.print("Masukkan Kala Rotasi              : ");
                    lKalaRoMars = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevMars = input.nextDouble();
                    
                    fSumber.writeDouble(rMars);
                        fSumber.writeDouble(linRevMars);
                        fSumber.writeDouble(lKalaRoMars);
                        fSumber.writeDouble(lKalaRevMars);

                    Mars empat = new Mars(rMars, linRevMars, lKalaRoMars, lKalaRevMars, pt);

                    System.out.println("---Jupiter---");
                    System.out.print("Masukkan Jari-Jari Jupiter : ");
                    rJupiter = input.nextDouble();
                    System.out.print("MasukkanLintasan Revolusi        : ");
                    linRevJupiter = input.nextDouble();
                    System.out.print("MasukkanKala Rotasi              : ");
                    lKalaRoJupiter = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevJupiter = input.nextDouble();
                    
                    fSumber.writeDouble(rJupiter);
                        fSumber.writeDouble(linRevJupiter);
                        fSumber.writeDouble(lKalaRoJupiter);
                        fSumber.writeDouble(lKalaRevJupiter);

                    Jupiter lima = new Jupiter(rJupiter, linRevJupiter, lKalaRoJupiter, lKalaRevJupiter, pt); // Belum ada classnya

                    System.out.println("---Saturnus---");
                    System.out.print("Masukkan Jari-Jari Saturnus : ");
                    rSaturnus = input.nextDouble();
                    System.out.print("Masukkan Lintasan Revolusi        : ");
                    linRevSaturnus = input.nextDouble();
                    System.out.print("Masukkan Kala Rotasi              : ");
                    lKalaRoSaturnus = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevSaturnus = input.nextDouble();
                    
                    fSumber.writeDouble(rSaturnus);
                        fSumber.writeDouble(linRevSaturnus);
                        fSumber.writeDouble(lKalaRoSaturnus);
                        fSumber.writeDouble(lKalaRevSaturnus);

                    Saturnus enam = new Saturnus(rSaturnus, linRevSaturnus, lKalaRoSaturnus, lKalaRevSaturnus, pt); // Belum ada classnya

                    System.out.println("---Uranus---");
                    System.out.print("Masukkan Jari-Jari Uranus : ");
                    rUranus = input.nextDouble();
                    System.out.print("Masukkan Lintasan Revolusi        : ");
                    linRevUranus = input.nextDouble();
                    System.out.print("Masukkan Kala Rotasi              : ");
                    lKalaRoUranus = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevUranus = input.nextDouble();
                    
                    fSumber.writeDouble(rUranus);
                        fSumber.writeDouble(linRevUranus);
                        fSumber.writeDouble(lKalaRoUranus);
                        fSumber.writeDouble(lKalaRevUranus);

                    Uranus tujuh = new Uranus(rUranus, linRevUranus, lKalaRoUranus, lKalaRevUranus, pt); // Belum ada classnya

                    System.out.println("---Neptunus---");
                    System.out.print("Masukkan Jari-Jari Neptunus : ");
                    rNeptunus = input.nextDouble();
                    System.out.print("Masukkan Lintasan Revolusi        : ");
                    linRevNeputunus = input.nextDouble();
                    System.out.print("Masukkan Kala Rotasi              : ");
                    lKalaRoNeptunus = input.nextDouble();
                    System.out.print("Masukkan Kala Revolusi              : ");
                    lKalaRevNeptunus = input.nextDouble();
                    
                    fSumber.writeDouble(rNeptunus);
                        fSumber.writeDouble(linRevNeputunus);
                        fSumber.writeDouble(lKalaRoNeptunus);
                        fSumber.writeDouble(lKalaRevNeptunus);

                    Neptunus delapan = new Neptunus(rNeptunus, linRevNeputunus, lKalaRoNeptunus, lKalaRevNeptunus, pt); // Belum ada classnya

                    satu.thread.start();
                    satu.thread.setPriority(12);
                    dua.thread.start();
                    dua.thread.setPriority(10);
                    tiga.thread.start();
                    tiga.thread.setPriority(9);
                    empat.thread.start();
                    empat.thread.setPriority(8);
                    lima.thread.start();
                    lima.thread.setPriority(7);
                    enam.thread.start();
                    enam.thread.setPriority(6);
                    tujuh.thread.start();
                    tujuh.thread.setPriority(5);
                    delapan.thread.start();
                    delapan.thread.setPriority(4);
                    }else{
                        System.out.println("Raf Leng : " + fSumber.length());

                        fSumber.seek(0);
                        int i = 0;
                        double planet[][] = new double[8][4];
                        while (fSumber.getFilePointer() < fSumber.length()) {
                            for (int j = 0; j < 4; j++) {
                                planet[i][j] = fSumber.readDouble();
                            }
                            i++;
                        }

                        String namaPlanet[] = {"MERKURIUS", "VENUS", "BUMI", "MARS", "JUPITER", "SATURNUS", "URANUS", "NEPTUNUS"};
                        for (int a = 0; a < 8; a++) {
                            System.out.println(namaPlanet[a] + "\n");
                            System.out.println("Jari jari " + namaPlanet[a].toLowerCase() + " : " + planet[a][0]);
                            System.out.println("lintasan " + namaPlanet[a].toLowerCase() + " : " + planet[a][1]);
                            System.out.println("rotasi " + namaPlanet[a].toLowerCase() + " : " + planet[a][2]);
                            System.out.println("revolusi " + namaPlanet[a].toLowerCase() + " : " + planet[a][3]);
                            System.out.println("");

                        }
                        Merkurius satu = new Merkurius(planet[0][0], planet[0][1], planet[0][2], planet[0][3], pt);
                        Venus dua = new Venus(planet[1][0], planet[1][1], planet[1][2], planet[1][3], pt);
                        Bumi tiga = new Bumi(planet[2][0], planet[2][1], planet[2][2], planet[2][3], pt);
                        Mars empat = new Mars(planet[3][0], planet[3][1], planet[3][2], planet[3][3], pt);
                        Jupiter lima = new Jupiter(planet[4][0], planet[4][1], planet[4][2], planet[4][3], pt);
                        Saturnus enam = new Saturnus(planet[5][0], planet[5][1], planet[5][2], planet[5][3], pt);
                        Uranus tujuh = new Uranus(planet[6][0], planet[6][1], planet[6][2], planet[6][3], pt);
                        Neptunus delapan = new Neptunus(planet[7][0], planet[7][1], planet[7][2], planet[7][3], pt);

                        satu.thread.start();
                        dua.thread.start();
                        tiga.thread.start();
                        empat.thread.start();
                        lima.thread.start();
                        enam.thread.start();
                        tujuh.thread.start();
                        delapan.thread.start();
                    }
                    fSumber.close();
                    }catch (Exception e) {
                    System.out.println(e);
                }
                    break;
                }
                case 3: {
                    System.out.println("---MENU--- : ");
                    System.out.println("1. Ilustrasi Pergerakan 2D ");
                    System.out.println("2. Ilustrasi Volume 3D ");
                    System.out.print("Masukkan Pilihan : ");
                    pilih = input.nextInt();
                    switch (pilih) {
                        case 1: {
                            System.out.println("---MENU---");
                            System.out.println("1. Revolusi & Rotasi ");
                            System.out.println("2. Revolusi ");
                            System.out.println("3. Rotasi ");
                            System.out.print("Masukkan Input : ");
                            pilih = input.nextInt();
                            switch (pilih) {
                                case 1: {
                                    IlustrasiRevolusiRotasi l = new IlustrasiRevolusiRotasi();
                                    l.setVisible(true);
                                    break;
                                }
                                case 2: {
                                    IlustrasiRevolusi r = new IlustrasiRevolusi();
                                    r.setVisible(true);
                                    break;
                                }
                                case 3: {
                                    IlustrasiRotasi rot = new IlustrasiRotasi();
                                    rot.setVisible(true);
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            IlustrasiVolume2 l = new IlustrasiVolume2();
                            l.setVisible(true);
                            JFrame myFrame = new JFrame("Hello");
                            myFrame.add(l);
                            myFrame.pack();
                            myFrame.setVisible(true);
                            myFrame.setSize(800, 800);

                            l.init();
                        }
                        break;
                    }
                }

            }
            System.out.print("\nKembali ke menu utama? : ");
            kembali = input.next().charAt(0);
        } while (kembali == 'y' || kembali == 'Y');

    }
}
