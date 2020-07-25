package UAS;
import UAS.*;

/**
 * @author Albert Cenderawan (03082190015)
 * @Isi Data yang digunakan dalam proses Sign In
 */

public class Registrasi
{
    private String namaLengkap;
    private String pendidikanTerakhir;

    public Registrasi(String namaLengkap, String pendidikanTerakhir)
    {
        this.namaLengkap = namaLengkap;
        this.pendidikanTerakhir = pendidikanTerakhir;
    }
    
    void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    
    void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    String getNamaLengkap() {
        return this.namaLengkap;
    }

    String getPendidikanTerakhir() {
        return this.pendidikanTerakhir;
    }
}