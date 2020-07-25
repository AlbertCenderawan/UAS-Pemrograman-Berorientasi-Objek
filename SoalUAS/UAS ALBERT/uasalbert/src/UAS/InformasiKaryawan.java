package UAS;
import UAS.*;

/**
 * @author Albert Cenderawan (03082190015)
 * @Soal Nomor 3 (Implementasikan abstract class dan metodenya)
 * Nomor 7 (Urutkan dan tampilkan data melalui algoritma pengurutan = Selection Sort)
 */

// Soal Nomor 3
public class InformasiKaryawan extends abstractClass 
{
    // Soal Nomor 7
    // Urutkan data input ke dalam bentuk ascending atau descending

    @Override
    public int[] urutkanGajiKaryawan(int[] daftarGaji)
    {
        // Selection Sort (Ascending)
        int savedNode = 0;

        for (int firstIndex = 0; firstIndex < daftarGaji.length - 1; firstIndex++)
        {
            int headIndex = firstIndex;     
            // Node pertama = daftarGaji[firstindex]
            // Node paling depan (acuan) = daftarGaji[headIndex]
            
            for (int secondIndex = firstIndex + 1; secondIndex < daftarGaji.length; secondIndex++)
            {
                // Node kedua = daftarGaji[secondIndex]
                if(daftarGaji[headIndex] > daftarGaji[secondIndex]) 
                {
                    headIndex = secondIndex;
                    // Nilai (value) terkecil di array ketemu!
                    // Array index dari "nilai terkecil" diperoleh
                }
                // Node kedua akan berjalan bila tidak mendapat value terkecil
            }

            // Node pertama dan node kedua ditukar posisi
            savedNode = daftarGaji[headIndex];
            daftarGaji[headIndex] = daftarGaji[firstIndex];
            daftarGaji[firstIndex] = savedNode;
        }
        return daftarGaji;
    }

    @Override
    public int[] urutkanUmurKaryawan(int[] daftarUsia)
    { 
        // Selection Sort Descending
        int savedNode = 0;

        for (int firstIndex = 0; firstIndex < daftarUsia.length - 1; firstIndex++)
        {
            int headIndex = firstIndex;
            // Node pertama = daftarGaji[firstindex]
            // Node paling depan (acuan) = daftarGaji[headIndex]

            for (int secondIndex = firstIndex + 1; secondIndex < daftarUsia.length; secondIndex++)
            {
                // Node kedua = daftarGaji[secondIndex]
                if(daftarUsia[headIndex] < daftarUsia[secondIndex]) 
                {
                    headIndex = secondIndex;
                    // Nilai (value) terbesar di array ketemu!
                    // Array index dari "nilai terbesar" diperoleh
                }
                // Node kedua akan berjalan bila tidak terdapat value terbesar 
            }

            // Node pertama dan node kedua ditukar posisi
            savedNode = daftarUsia[headIndex];
            daftarUsia[headIndex] = daftarUsia[firstIndex];
            daftarUsia[firstIndex] = savedNode;
        }
        return daftarUsia;
    }
}
