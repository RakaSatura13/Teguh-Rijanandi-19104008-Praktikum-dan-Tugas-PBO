package Employee;

public class Commision extends Employee_Init {

    /**
     * @param nama
     * @param nip
     * @param komisi
     * @param total_penjualan
     *
     * Commision Employee memiliki atribut
     *      nama,
     *      nip,
     *      gaji pokok (upah),
     *      komisi
     *      total penjualan
     */

    public Commision(
            String nama,
            String nip,
            float upah,
            float komisi,
            float total_penjualan,
            float total_projek

    ) {
        super(
                nama,
                nip,
                upah,
                komisi,
                total_penjualan,
                total_projek
        );
    }

    @Override
    public void getGaji() {
        float gaji = this.upah + (this.komisi * this.total_penjualan);
        System.out.println("Total gaji " + this.nama + " adalah " + gaji);
    }
}
