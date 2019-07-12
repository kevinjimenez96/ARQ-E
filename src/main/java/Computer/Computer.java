package Computer;

import Computer.CPU.CPU;
import Computer.CPU.Decoder;
import Computer.Utils.BitSet;
public class Computer {

    private OperatingSystem operatingSystem;
    private CPU cpu;

    // TODO: Profundizar funcionamiento de JavaRX para ver si al final lo vamos a manejar con tabla de eventos o reactivo.
    // private Queue<Computer.Utils.Event> tableOfEvents;


    /**
     *
     */
    public Computer()
    {
        operatingSystem = new OperatingSystem();
        cpu = new CPU();
        System.out.println("Constructor of Computer.Computer class");
    }

    /**
     *
     */
    public void start() {

        System.out.println("Starting computer");
    }

}
