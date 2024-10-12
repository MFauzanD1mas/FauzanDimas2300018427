import java.util.ArrayList;
import java.util.List;

class Hewan {
    private String nama;
    private String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
}

class Mamalia extends Hewan {
    private String warnaBulu;

    public Mamalia(String nama, String jenis, String warnaBulu) {
        super(nama, jenis);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void bersuara() {
        System.out.println("Mamalia bersuara");
    }
}

class Burung extends Hewan {
    private String warnaBulu;
    private String jenisSayap;

    public Burung(String nama, String jenis, String warnaBulu, String jenisSayap) {
        super(nama, jenis);
        this.warnaBulu = warnaBulu;
        this.jenisSayap = jenisSayap;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    public String getJenisSayap() {
        return jenisSayap;
    }

    public void setJenisSayap(String jenisSayap) {
        this.jenisSayap = jenisSayap;
    }

    @Override
    public void bersuara() {
        System.out.println("Burung berkicau");
    }
}

class Ikan extends Hewan {
    private String warnaSisik;

    public Ikan(String nama, String jenis, String warnaSisik) {
        super(nama, jenis);
        this.warnaSisik = warnaSisik;
    }

    public String getWarnaSisik() {
        return warnaSisik;
    }

    public void setWarnaSisik(String warnaSisik) {
        this.warnaSisik = warnaSisik;
    }

    @Override
    public void bersuara() {
        System.out.println("Ikan berenang");
    }
}

class Reptil extends Hewan {
    private String jenisKulit;

    public Reptil(String nama, String jenis, String jenisKulit) {
        super(nama, jenis);
        this.jenisKulit = jenisKulit;
    }

    public String getJenisKulit() {
        return jenisKulit;
    }

    public void setJenisKulit(String jenisKulit) {
        this.jenisKulit = jenisKulit;
    }

    @Override
    public void bersuara() {
        System.out.println("Reptil bersuara");
    }
}

public class Main {
    public static void main(String[] args) {
        List<Hewan> hewanList = new ArrayList<>();
        hewanList.add(new Mamalia("Kucing", "Mamalia", "Hitam"));
        hewanList.add(new Burung("Elang", "Burung", "Coklat", "Sayap lebar"));
        hewanList.add(new Ikan("Ikan Mas", "Ikan", "Kuning"));
        hewanList.add(new Reptil("Ular", "Reptil", "Sisik"));

        for (Hewan hewan : hewanList) {
            System.out.println("Nama: " + hewan.getNama());
            System.out.println("Jenis: " + hewan.getJenis());
            hewan.bersuara();
            System.out.println();
        }
    }
}
