package nyp_proje;

import java.util.ArrayList;

public class Musteri extends Kisi{
    private int musteriNumarasi;
    
    private ArrayList<BankaHesabi> hesaplar = new ArrayList<>();
    
    private ArrayList<KrediKarti> krediKartlari = new ArrayList<>();

    //Musteri sinifinin yapici metodlarini olusturdum.
    public Musteri() {}

    public Musteri(String ad, String soyad, String email, long telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
    }

    //get ve set metodlari
    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public ArrayList<BankaHesabi> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList<BankaHesabi> hesaplar) {
        this.hesaplar = hesaplar;
    }

    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }

    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }
    
    //Musteri sinifina ait  metodlari yazdim.
    public void hesapEkle(BankaHesabi hesap){
        hesaplar.add(hesap);
        //System.out.println(super.getAd()+" "+super.getSoyad()+" icin hesap olusturuldu.");
    }
    
    public void krediKartiEkle(KrediKarti krediKarti){
        krediKartlari.add(krediKarti);
        //System.out.println(super.getAd()+" "+super.getSoyad()+" icin kredi karti olusturuldu.");
    }
    
    public void hesapSil(BankaHesabi hesap){
        if(hesap.getBakiye()>0){
            System.out.println("Lutfen oncelikle bakiyenizi baska bir hesaba aktariniz.");
        }
        if(hesap.getBakiye()==0){
            hesaplar.remove(hesap);
            System.out.println("Hesap silindi.");
        }      
    }
    
    public void krediKartiSil(KrediKarti kart){
        if(kart.getGuncelBorc()==0){
            krediKartlari.remove(kart);
            System.out.println("Kredi karti silindi.");
        }
        else{
            System.out.println("Lutfen oncelikle borc odemesi yapiniz.");
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nMusteri Numarasi: "+musteriNumarasi;
    }
 
}
