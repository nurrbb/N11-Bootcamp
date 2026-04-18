package com.n11.oop;

public class Main {
    public static void main(String[] args) {

        // Classİsmi nesneadi = new Classİsmi();

        Insan i = new Insan();
        i.ad = "Nur";
        i.soyad = "Bülbül";
        i.yas = 28;
        i.maas = 85.3;
        i.cinsiyet = false;
        i.uyu();

        Anne a = new Anne();
        a.ad = "lorem";
        a.soyad = "Bozbey";
        a.ekranayaz(a.ad, a.soyad);
        a.oku(a.ad);
        a.yaz(a.ad);

        Baba b = new Baba();
        b.ad = "İmpsum";
        b.soyad = "Bülbül";
        b.ekranayaz(b.ad,b.soyad);
        b.dinle(b.ad);

        Cocuk c = new Cocuk();
        c.ad = "Lors";
        c.soyad = "Bülbül";
        c.ekranayaz(c.ad,c.soyad);

        AkilliCocuk ak  = new AkilliCocuk();
        ak.ad = "Hlor";
        ak.soyad = "İmps";
        ak.sifat = "Akıllıdır";
        ak.adSoyadSifatYaz(ak.ad, ak.soyad, ak.sifat);


        UsluCocuk uc = new UsluCocuk();
        uc.ad = "djkaf";
        uc.soyad = "fdfsdg";
        uc.sifat = "Usludur";

        uc.adSoyadSifatYaz(uc.ad, uc.soyad, uc.sifat);


    }
}