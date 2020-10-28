package Employee;

public class Project_planner extends Employee_Init {

    /**
     * @param nama
     * @param nip
     * @param upah
     * @param total_penjualan
     *
     * Project Planner memiliki atribut
     *    nama,
     *    nip,
     *    gaji pokok (upah),
     *    komisi
     *    total hasil proyek
     */

    public Project_planner(
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
                (float) 0,
                total_projek
        );
    }

    @Override
    public void getGaji() {
        float pajak = (this.upah * 5) / 100;
        float gaji = this.upah + (this.komisi * this.total_projek) - pajak;
        System.out.println("Total gaji " + this.nama + " adalah " + gaji);
    }
}
