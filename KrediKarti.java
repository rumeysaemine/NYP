package nyp_proje;

public class KrediKarti {
    private long kartNumarasi;
    private double limit;
    private double guncelBorc;
    private double kullanilabilirLimit;

    //KrediKarti sinifinin yapici metotlarini olusturdum.
    public KrediKarti() {}

    public KrediKarti(double limit, double guncelBorc) {
        this.limit = limit;
        this.guncelBorc = guncelBorc;
    }
    
    //get ve set metodlari
    public long getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(long kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getGuncelBorc() {
        return guncelBorc;
    }

    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }

    public double getKullanilabilirLimit() {
        return kullanilabilirLimit;
    }

    public void setKullanilabilirLimit(double kullanilabilirLimit) {
        this.kullanilabilirLimit = kullanilabilirLimit;
    }
    
    @Override
    public String toString(){
        return "Kart Numarasi: "+kartNumarasi+"\nLimit: "+limit+"\nGuncel Borc: "+guncelBorc+"\nKullanilabilir Limit: "+kullanilabilirLimit;
    }
       
}
