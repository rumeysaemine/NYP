package nyp_proje;

public class BankaHesabi {
    private long iban;
    private double bakiye;

    //BankaHesabi sinifinin yapici metotlarini olusturdum.
    public BankaHesabi() {}

    public BankaHesabi(double bakiye) {
        this.bakiye = bakiye;
    }
    
    //get ve set metodlari
    public long getIban() {
        return iban;
    }

    public void setIban(long iban) {
        this.iban = iban;
    }
    
    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString(){
      return "IBAN: "+iban+"\nBakiye: "+bakiye;  
    }
}
