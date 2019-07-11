package Computer;

import Computer.CPU.CPU;

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
    }
}
