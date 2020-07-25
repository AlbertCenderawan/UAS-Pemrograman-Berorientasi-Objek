package UAS;
import UAS.*;

/**
 * @author Albert Cenderawan (03082190015)
 * @Isi Data yang dimiliki oleh karyawan setelah proses Registrasi \n
 * Data dari RegistrasiKaryawan.java ditransfer ke class ini
 */

public class AkunKaryawan
{
    private String namaKaryawan;
    private String strUmurKaryawan;
    private String strGajiKaryawan;
    private String jabatanKaryawan;
    private String pendidikanTerakhirKaryawan;

    private RegistrasiKaryawan dataRegistrasiKaryawan;
    // data Karyawan yang sebelumnya telah diinput

    public AkunKaryawan(RegistrasiKaryawan dataRegistrasiKaryawan)
    {
        this.dataRegistrasiKaryawan = dataRegistrasiKaryawan;
        // Data yang diinput oleh RegistrasiKaryawan.java akan ditransfer/ dikonversi ke AkunKaryawan.java
    }

    void setNamaKaryawan(RegistrasiKaryawan dataRegistrasiKaryawan) {
        this.namaKaryawan = dataRegistrasiKaryawan.getNamaKaryawan();    
    }

    void setStrUmurKaryawan(RegistrasiKaryawan dataRegistrasiKaryawan) {
        this.strUmurKaryawan = dataRegistrasiKaryawan.getStrUmurKaryawan();
    }

    void setStrGajiKaryawan(RegistrasiKaryawan dataRegistrasiKaryawan) {
        this.strGajiKaryawan = dataRegistrasiKaryawan.getStrGajiKaryawan();
    }

    void setJabatanKaryawan(RegistrasiKaryawan dataRegistrasiKaryawan) {
        this.jabatanKaryawan = dataRegistrasiKaryawan.getJabatanKaryawan();
    }

    void setPendidikanTerakhirKaryawan(RegistrasiKaryawan dataRegistrasiKaryawan) {
        this.pendidikanTerakhirKaryawan = dataRegistrasiKaryawan.getPendidikanTerakhirKaryawan();
    }

    String getNamaKaryawan() {
        return this.namaKaryawan;
    }

    String getStrUmurKaryawan() {
        return this.strUmurKaryawan;
    }

    String getStrGajiKaryawan() {
        return this.strGajiKaryawan;
    }

    String getJabatanKaryawan() {
        return this.jabatanKaryawan;
    }

    String getPendidikanTerakhirKaryawan() {
        return this.pendidikanTerakhirKaryawan;
    }
}