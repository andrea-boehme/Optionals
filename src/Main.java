
//Optionals: neue Art und Weise um sich gegen Nullpointerexceptions zu schützen
// Möglichkeit mit Null-Werten umzugehen; reagieren, wenn kein Objekt existiert

public class Main {
    public static void main(String[] args) {

        // Erstellen 3 Objekte

        CPU cpu = new CPU("CPUCPU");
        GPU gpu = new GPU("GPUGPU");
        RAM ram = new RAM("RAMRAM");

        // Setzen beim server, ist befüllt

        Server server = new Server();
        server.setCpu(cpu);
        server.setGpu(gpu);
        server.setRam(ram);

        //server.getRam().get; .orElse, .ifPresentOrElse, .orElseThrow

        // braucht nicht mit "IF"-Statement prüfen ob es RAM gibt;
        // mit ""orElse" braucht nicht: if (server.getRam() != null) {server.getRam().getName()}
        RAM myRam = server.getRam().orElse(new RAM("Default")); // gespeichert; wenn kein RAM gesetzt (no set), heisst default

        System.out.println(myRam);

        server.getRam().orElseThrow(() -> new RuntimeException("No RAM")); // exception geworfen

        server.getRam()                                                         // ab hier wird etwas ausgeführt
                        .ifPresentOrElse(
                                ram2 -> System.out.println(ram2.getName()),
                                () -> System.out.println("Unknown"));


    }
}