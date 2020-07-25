package UAS;
import UAS.*;

/**
 * @author Albert Cenderawan (03082190015)
 * @Soal Nomor 1 (Buat subclass dari salah satu class terpilih);
 * Nomor 4 (Buat method overloading dari subclass di nomor 1)
 */

public class RegistrasiKaryawan extends Registrasi
{
    /**
     * @Soal Nomor 1
     */

    private String strUmurKaryawan;
    private String strGajiKaryawan;
    private String jabatanKaryawan = "Belum ada Jabatan";

    private Integer umurKaryawan = 0;
    private Integer gajiKaryawan = 0;

    /**
     * @Soal Nomor 4
     */

    // Registrasi Karyawan Lama
    public RegistrasiKaryawan(String namaKaryawan, String strUmurKaryawan, String strGajiKaryawan, String jabatanKaryawan, String pendidikanTerakhirKaryawan)
    {
        super(namaKaryawan, pendidikanTerakhirKaryawan);
        this.strUmurKaryawan = strUmurKaryawan;
        this.strGajiKaryawan = strGajiKaryawan;
        this.jabatanKaryawan = jabatanKaryawan;
    }

    // Registrasi Karyawan Baru
    public RegistrasiKaryawan(String namaKaryawan, String strUmurKaryawan, String pendidikanTerakhirKaryawan)
    {
        super(namaKaryawan, pendidikanTerakhirKaryawan);
        this.strUmurKaryawan = strUmurKaryawan;
        this.strGajiKaryawan = "2000000";          // Gaji dari karyawan baru
        this.jabatanKaryawan = "Baru Masuk Kerja"; // Jabatan dari karyawan baru 
    }

    void setNamaKaryawan(String namaKaryawan) {
        super.setNamaLengkap(namaKaryawan);
    }

    void setPendidikanTerakhirKaryawan(String pendidikanTerakhirKaryawan) {
        super.setPendidikanTerakhir(pendidikanTerakhirKaryawan);
    }

    void setStrUmurKaryawan(String strUmurKaryawan) {
        this.strUmurKaryawan = strUmurKaryawan;
    }

    void setStrGajiKaryawan(String strGajiKaryawan) {
        this.strGajiKaryawan = strGajiKaryawan;
    }

    void setJabatanKaryawan(String jabatanKaryawan) {
        this.jabatanKaryawan = jabatanKaryawan;
    }

    String getNamaKaryawan() {
        return super.getNamaLengkap();
    }

    String getPendidikanTerakhirKaryawan() {
        return super.getPendidikanTerakhir();
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

    Integer getUmurKaryawan() 
    {
        this.umurKaryawan = Integer.parseInt(this.strUmurKaryawan);
        return this.umurKaryawan;
    }
    
    Integer getGajiKaryawan()
    {
        this.gajiKaryawan = Integer.parseInt(this.strGajiKaryawan);
        return this.gajiKaryawan;
    }
}