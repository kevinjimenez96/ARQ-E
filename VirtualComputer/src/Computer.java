public class Computer {

    private OperatingSystem operatingSystem = new OperatingSystem();
    private Cpu cpu = new Cpu();

    /**
     *
     */
    public Computer(){
        System.out.println("Constructor of Computer class");
    }

    /**
     *
     */
    public void start() {
        System.out.println("Starting computer");
    }
}
