package Employee;

/**
 * Coded with love by Teguh Rijanandi
 * 19104008
 * ITTP - S1SE03B
 *
 * Employee init (main parent) berfungsi untuk mendeklarasikan
 * semua class yang digunakan untuk semua class
 */

public abstract class Employee_Init {
    /**
     * Deklarasi nama nip upah
     */
    protected String nama;
    protected String nip;
    protected Float upah;
    protected Float komisi;
    protected Float total_penjualan;
    protected Float total_projek;

    // contructor
    Employee_Init(
            String nama,
            String nip,
            float upah,
            float komisi,
            float total_penjualan,
            float total_projek
    ) {
        // ambil value dari param
        this.nama = nama;
        this.nip = nip;
        this.upah = upah;
        this.komisi = komisi;
        this.total_penjualan = total_penjualan;
        this.total_projek = total_projek;
    }

    public abstract void getGaji();

    // @akhir adalah awal yang baru
}
