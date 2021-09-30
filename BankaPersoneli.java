package nyp_proje;

import java.util.ArrayList;

public class BankaPersoneli extends Kisi {
    
    private int personelId;
    private ArrayList<Musteri> musteriler = new ArrayList<>();
    
    //BankaPersoneli sinifinin yapici metotlarini olusturdum.
    public BankaPersoneli() {}

    public BankaPersoneli(String ad, String soyad, String email, long telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);   //Miras aldigi sinifin yapici metodunu kullandim.
    }

    //get ve set metodlari
    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nPesonel ID: "+personelId;
    }

}
