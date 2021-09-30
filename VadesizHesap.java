package nyp_proje;

public class VadesizHesap extends BankaHesabi {

    private String hesapTuru;

    //VadesizHesap sinifinin yapici metotlarini olusturdum.
    public VadesizHesap() {}
    
    public VadesizHesap(double bakiye) {
        super(bakiye);
    }
    
    //get ve set metodlari
    public String getHesapTuru() {
        return hesapTuru;
    }
    
    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }
   
    //VadesizHesap sinifina ait metodlari yazdim.
    public void paraTransferi(BankaHesabi aliciHesap,BankaHesabi gonderenHesap,double miktar){
        aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
        gonderenHesap.setBakiye(gonderenHesap.getBakiye() - miktar);
        System.out.println(miktar +" TL transfer edildi.");
    }
    
    public void krediKartiBorcOdeme(KrediKarti kart,double odenecekMiktar){
        super.setBakiye(super.getBakiye() - odenecekMiktar);
        kart.setGuncelBorc(kart.getGuncelBorc() - odenecekMiktar);
        System.out.println(odenecekMiktar+" TL kredi karti borcu odendi");
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nHesapTuru: "+hesapTuru;
    }
    
}
