import java.util.Optional;

// Beispiel: Server hat CPU, GPU und RAM
// Optional: Wrapper-Klasse; kann Objekt in Optional tun der erlaubt bestimmte Methoden auf Optional auszuführen
// Optional erkennt, ob das Objekt das wrapped wurde null ist oder nicht

public class Server {

    // ohne Optional wÄre: private CPU cpu; ODER private CPU cpu = null;

    private CPU cpu;


    //private Optional<CPU> cpu = Optional.empty(); // leeres Optional erstellt
    private Optional<GPU> gpu = Optional.empty();
    private Optional<RAM> ram = Optional.empty();

    // statt bei fields, kann man Optional in der Methode definieren (sauberer,
    // da field nicht synchronisiert werden können, methoden ja.):
    public Optional<CPU> getCpu() {
        return Optional.of(this.cpu);
    }

    // Alternative wenn Optinal bei field definiert
    /*
     public Optional<CPU> getCpu() {
        return cpu;
    }
     */

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    /*
     public void setCpu(CPU cpu) {
        this.cpu = Optional.ofNullable(cpu);
    }
     */

    public Optional<GPU> getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = Optional.ofNullable(gpu);
    }

    public Optional<RAM> getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = Optional.ofNullable(ram);
    }




}
