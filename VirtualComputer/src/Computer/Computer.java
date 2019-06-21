package Computer;

import Computer.CPU.CPU;
import Computer.CPU.Decoder;
import Computer.Utils.BitSet;
public class Computer {

    private OperatingSystem operatingSystem = new OperatingSystem();
    private CPU cpu = new CPU();

    // TODO: Profundizar funcionamiento de JavaRX para ver si al final lo vamos a manejar con tabla de eventos o reactivo.
    // private Queue<Computer.Utils.Event> tableOfEvents;


    /**
     *
     */
    public Computer(){
        System.out.println("Constructor of Computer.Computer class");
    }

    /**
     *
     */
    public void start() {
        System.out.println("Starting computer");
        Decoder dec = new Decoder();
        BitSet bitSet = new BitSet("00000000011000000001000000000000");
        System.out.println(dec.decode(bitSet).toString());
    }
}
