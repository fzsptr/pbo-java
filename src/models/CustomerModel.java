package models;

public class CustomerModel extends User {
    private String nomorHp;
    private String alamat;

    public CustomerModel(String username, String password, String nomorHp, String alamat) {
        super(username, password);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }
    public String getNomorHp() { 
        return nomorHp; 
    }
    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }
    public String getAlamat() { 
        return alamat; 
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
