package UAS;
import UAS.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Soal Nomor 5
// Membuat class yang berisi input data terhadap 2 class yang terpilih

/**
 * @author Albert Cenderawan (03082190015)
 * @Soal Nomor 5 (Membuat class berisi input data terkait 2 class terpilih & method untuk inisialisasi data);
 * Nomor 6 (Buat Exception Handling untuk Validasi data input)
 */

public class menuAwal
{
    /**
     * @Soal Nomor 5
     */

    static Scanner scan = new Scanner(System.in);
    static InformasiKaryawan tampilkanInformasi = new InformasiKaryawan();
    static ArrayList <RegistrasiKaryawan> daftarKaryawan = new ArrayList<RegistrasiKaryawan>();

    public static void main(String[] args)
    {
        Initialize(); // Soal Nomor 5
        String inputNamaKaryawan, inputPendidikanTerakhir, inputJabatanKaryawan;
        Integer inputUmurKaryawan, inputGajiKaryawan; boolean Exit = false;

        String strUmurKaryawan, strGajiKaryawan;
        int[] daftarGaji = new int[10], daftarUsia = new int[10];
        int[] daftarGajiTerurut = new int[10], daftarUsiaTerurut = new int[10];

        do
        {
            try
            {
                System.out.println();
                System.out.println("---------------------------");
                System.out.println(" Sistem Manajemen Karyawan ");
                System.out.println("       <<Main Menu>>       ");
                System.out.println("--------------------------- \n");

                System.out.println("===========================");
                System.out.println("1. Registrasi Karyawan Lama");
                System.out.println("2. Registrasi Karyawan Baru");
                System.out.println("3. Info Semua Akun Karyawan");
                System.out.println("4. Keluar dari Program     ");
                System.out.println("=========================== \n");

                System.out.print("Pilihan Menu = "); Integer choice = scan.nextInt(); 
                scan.nextLine(); System.out.println();

                if (choice == 1) 
                {
                    /**
                     * @Soal Nomor 6
                     */

                    try
                    {
                        System.out.println("Anda Memilih Registrasi Karyawan Lama");
                        System.out.println("--------------------------------------------------------------- \n");

                        System.out.print("Masukkan Nama Karyawan       = "); inputNamaKaryawan = scan.nextLine();
                        System.out.print("Masukkan Pendidikan Terakhir = "); inputPendidikanTerakhir = scan.nextLine();
                        System.out.print("Masukkan Umur Karyawan       = "); inputUmurKaryawan = scan.nextInt(); scan.nextLine(); strUmurKaryawan = String.valueOf(inputUmurKaryawan);
                        System.out.print("Masukkan Gaji Karyawan       = "); inputGajiKaryawan = scan.nextInt(); scan.nextLine(); strGajiKaryawan = String.valueOf(inputGajiKaryawan);
                        System.out.print("Masukkan Jabatan Karyawan    = "); inputJabatanKaryawan = scan.nextLine();

                        RegistrasiKaryawan karyawanLama = new RegistrasiKaryawan(inputNamaKaryawan, strUmurKaryawan, strGajiKaryawan, inputJabatanKaryawan, inputPendidikanTerakhir);
                        daftarKaryawan.add(karyawanLama); System.out.println();
                    }
                    catch (Exception e)
                    {
                        System.out.println();
                        System.out.println("Maaf, input Anda terdapat kesalahan. Silakan kembali ke menu. \n");
                    }
                    finally
                    {
                        System.out.print("Press Any Key to Continue... "); scan.nextLine();
                        System.out.println();
                    }
                }
                else if (choice == 2)
                {
                    /**
                     * @Soal Nomor 6
                     */

                    try
                    {
                        System.out.println("Anda memilih Registrasi Karyawan Baru");
                        System.out.println("--------------------------------------------------------------- \n");

                        System.out.print("Masukkan Nama Karyawan       = "); inputNamaKaryawan = scan.nextLine();
                        System.out.print("Masukkan Pendidikan Terakhir = "); inputPendidikanTerakhir = scan.nextLine();
                        System.out.print("Masukkan Umur Karyawan       = "); inputUmurKaryawan = scan.nextInt(); scan.nextLine(); strUmurKaryawan = String.valueOf(inputUmurKaryawan);
                        
                        RegistrasiKaryawan karyawanBaru = new RegistrasiKaryawan(inputNamaKaryawan, strUmurKaryawan, inputPendidikanTerakhir);
                        daftarKaryawan.add(karyawanBaru); System.out.println();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Maaf, input Anda terdapat kesalahan");
                        System.out.println("Silakan kembali ke menu \n");
                    }
                    finally
                    {
                        System.out.print("Press Any Key to Continue... "); scan.nextLine();
                        System.out.println();
                    }
                }
                else if (choice == 3)
                {
                    System.out.println("Anda Memilih Info Akun Karyawan");
                    System.out.println("--------------------------------------------------------------- \n");

                    for(int urutanDaftar = 0; urutanDaftar < daftarKaryawan.size(); urutanDaftar++) 
                    {
                        daftarGaji[urutanDaftar] = daftarKaryawan.get(urutanDaftar).getGajiKaryawan();
                        // Masukkan data gaji karyawan ke daftarGaji: int[]
                    }

                    daftarGajiTerurut = tampilkanInformasi.urutkanGajiKaryawan(daftarGaji);
                    
                    System.out.println("Urutan Karyawan berdasarkan Gaji Terendah");
                    System.out.println("===============================================================");

                    for (int i = 0; i < daftarGajiTerurut.length; i++)
                    {
                        for (int j = 0; j < daftarKaryawan.size(); j++)
                        {
                            if (daftarGajiTerurut[i] == daftarKaryawan.get(j).getGajiKaryawan()) {
                                System.out.println( daftarKaryawan.get(j).getNamaKaryawan() + "\t" + 
                                                    daftarKaryawan.get(j).getStrGajiKaryawan() + "\t" + 
                                                    daftarKaryawan.get(j).getStrUmurKaryawan() + "\t" + 
                                                    daftarKaryawan.get(j).getJabatanKaryawan() + "\t" + 
                                                    daftarKaryawan.get(j).getPendidikanTerakhirKaryawan());
                            }
                        }
                    } System.out.println();

                    for(int urutanDaftar = 0; urutanDaftar < daftarKaryawan.size(); urutanDaftar++) 
                    {
                        daftarUsia[urutanDaftar] = daftarKaryawan.get(urutanDaftar).getUmurKaryawan();
                        // Masukkan data usia karyawan ke daftarUsia: int[]
                    }

                    daftarUsiaTerurut = tampilkanInformasi.urutkanUmurKaryawan(daftarUsia);
                    
                    System.out.println("Urutan Karyawan berdasarkan Usia Tertinggi");
                    System.out.println("===============================================================");

                    for (int i = 0; i < daftarUsiaTerurut.length; i++)
                    {
                        for (int j = 0; j < daftarKaryawan.size(); j++)
                        {
                            if(daftarUsiaTerurut[i] == daftarKaryawan.get(j).getUmurKaryawan()) {
                                System.out.println( daftarKaryawan.get(j).getNamaKaryawan() + "\t" +
                                                    daftarKaryawan.get(j).getStrGajiKaryawan() + "\t" +
                                                    daftarKaryawan.get(j).getStrUmurKaryawan() + "\t" +
                                                    daftarKaryawan.get(j).getJabatanKaryawan() + "\t" +
                                                    daftarKaryawan.get(j).getPendidikanTerakhirKaryawan());
                            }
                        }
                    }
                    System.out.println();
                }
                else if (choice == 4)
                {
                    System.out.println("Anda memilih Keluar dari Program");
                    System.out.println("--------------------------------------------------------------- \n");

                    System.out.print("Anda ingin keluar? "); String konfirmasi = scan.nextLine();
                    if (konfirmasi.equals("ya") || konfirmasi.equals("iya") || konfirmasi.equals("y"))
                    {
                        System.out.print("Press Any Key to Continue... "); scan.nextLine();
                        Exit = true; // Keluar dari program
                    }
                    else
                    {
                        System.out.println("Anda tidak jadi keluar dari program");
                        System.out.println("----------------------------------- \n");
                        System.out.print("Press Any Key to Continue... "); scan.nextLine();
                    }
                }
            }

            /**
             * @Soal Nomor 6
             */
            
            catch (Exception e) 
            {
                System.out.println("----------------------------------------------");
                System.out.println("Maaf, Anda menginput pilihan di luar Menu     ");
                System.out.println("Silakan pilih menu antara menu 1 sampai 3   \n");

                System.out.print("Press Any Key to Continue... "); scan.nextLine();
                System.out.println("---------------------------------------------- \n");
            }
        } while (Exit == false);        
    }

    static void Initialize()
    {
        /**
         * @Soal Nomor 5
         */

        // Inisialisasi Karyawan Lama
        daftarKaryawan.add(new RegistrasiKaryawan("Budi Setiawan", "31", "3000000", "Administrator", "S1"));
        daftarKaryawan.add(new RegistrasiKaryawan("Andi Lau", "36", "4500000", "Staf Engineer", "S1"));
        daftarKaryawan.add(new RegistrasiKaryawan("Jason Deck", "35", "3500000", "Staf Keuangan", "SMA"));

        // Inisialisasi Karyawan Baru
        daftarKaryawan.add(new RegistrasiKaryawan("Dennis Andian", "29", "SMA"));
        daftarKaryawan.add(new RegistrasiKaryawan("Husin Gunawan", "38", "SMA"));
        daftarKaryawan.add(new RegistrasiKaryawan("John Nurhadi", "21", "SMA"));
    }
}