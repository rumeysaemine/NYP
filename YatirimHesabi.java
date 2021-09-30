package nyp_proje;

public class YatirimHesabi extends BankaHesabi{
    private String hesapTuru;

    //YatirimHesabi sinifinin yapici metotlarini olusturdum.
    public YatirimHesabi() {}

    public YatirimHesabi(double bakiye) {
        super(bakiye);
    }

    //get ve set metodlari
    public String getHesapTuru() {
        return hesapTuru;
    }

    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }
    
    //YatirimHesabi sinifina ait metodlari yazdim.
    public void paraEkle(double miktar){
        super.setBakiye(super.getBakiye() + miktar);
        System.out.println("Yatirim hesabina "+miktar+" TL eklendi.");
        
    }
   
    public void paraCek(double miktar){
       super.setBakiye(super.getBakiye() - miktar);
       System.out.println("Yatirim hesabindan "+miktar+" TL cekildi.");
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nHesap Turu: "+hesapTuru+"";
    }
    
}
