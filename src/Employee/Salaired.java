package Employee;

public class Salaired extends Employee_Init {

    /**
     * @param nama
     * @param nip
     * @param upah
     * @param total_penjualan
     *
     * Salaried Employee memiliki atribut
     *      nama,
     *      nip,
     *      upah mingguan (upah)
     */

    public Salaired(
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
                (float) 0,
                (float) 0,
                (float) 0
        );
    }

    @Override
    public void getGaji() {
        System.out.println("Total gaji " + this.nama + " adalah " + this.upah);
    }
}
