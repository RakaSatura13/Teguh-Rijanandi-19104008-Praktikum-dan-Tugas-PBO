package com.teguh.nomer3;

public class detaiKaryawan {
    /**
     * Deklarasi Nama Karyawan
     */
    protected String namaKaryawan = "Ahmad Subekti";

    /**
     * Deklarasi alamat karyawan
     */

    protected String alamatKaryawan = "Jatilawang Banyumas Jawa Tengah";

    /**
     * Deklarasi nomor telepon karyawan
     */

    protected String noTelp = "085438237282";

    /**
     * Deklarasi gaji karyawan
     */

    protected String gaji = "1.000.000";

    /**
     * Deklarasi untuk mendapatkan data
     * karyawan
     * @return
     */

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getGaji() {
        return gaji;
    }
}
