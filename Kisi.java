package nyp_proje;

public class Kisi {
    private String ad;
    private String soyad;
    private String email;
    private long telefonNumarasi;
    
    //Kisi sinifinin yapici metotlarini olusturdum.
    public Kisi() {}

    public Kisi(String ad, String soyad, String email, long telefonNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }

    //get ve set metodlari
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(long telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
    
    @Override
    public String toString(){
        return "Ad: "+ad+"\nSoyad: "+soyad+"\nEmail: "+email+"\nTelefon No: "+telefonNumarasi;
    }
    
}
