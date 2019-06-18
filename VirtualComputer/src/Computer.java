public class Computer {

    private OperativeSystem operativeSystem = new OperativeSystem();
    private Cpu cpu = new Cpu();

    /**
     *
     */
    Computer(){
        System.out.println("Constructor of Computer class");
    }

    /**
     *
     */
    public void start() {
        System.out.println("Starting computer");
    }
}
