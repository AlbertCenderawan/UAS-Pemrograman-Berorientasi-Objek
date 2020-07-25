package UAS;
import UAS.*;

/**
 * @author Albert Cenderawan (03082190015)
 * @Soal Nomor 2 (Membuat abstract class dari salah satu class terpilih)
 */

abstract class abstractClass 
{
    public int[] daftarGaji = new int[10];
    // berguna sebagai collection untuk Gaji Karyawan

    public int[] daftarUsia = new int[10];
    // berguna sebagai collection untuk Umur Karyawan

    public abstract int[] urutkanGajiKaryawan(int[] daftarGaji);
    // berguna untuk mengurutkan Gaji Karyawan

    public abstract int[] urutkanUmurKaryawan(int[] daftarUsia);
    // berguna untuk mengurutkan Umur Karyawan
}
