package Computer.CPU;

import Computer.BusInstances;
import Computer.IOModule.ExpansionBus;
import Computer.MainMemory.Cache;
import Computer.Utils.BitSet;

import static Computer.CPU.Operand.SECOND;
import static Computer.CPU.Operand.THIRD;

public class CPU {

    private long clock;
    private LocalBus localBus;
    private ExpansionBus expansionBus;
    private Cache L3 = new Cache();
    private Cache L2 = new Cache();
    private Cache L1 = new Cache();

    public CPU(){
        localBus = BusInstances.localBus;
        localBus.cpu = this;
        expansionBus = BusInstances.expansionBus;
        this.run();
    }

    public void run(){
        // Aqui se hace el while "infinito"
        while(true){
            // fetch
            BitSet bitSet = new BitSet("00000100001000000000000000000001");

            localBus.executeIntruction(bitSet);
            break;
        }

    }
    /**
     * This method fetches an instruction that is stored in a certain address.
     *
     * @param address main memory index from where instruction will be fetched.
     */
    public void fetchInstruction(int address) {

    }

    /**
     * This method sends
     */
    public void executeInstruction(Instruction instruction) {
        OpCode opCode = instruction.opCode;
        /*if(opCode.ordinal() <= 18){
            System.out.println(opCode.ordinal());
        }*/
    }

    /**
     * @param address
     * @return
     */
    public BitSet load(int address) {
        return new BitSet(0);
    }


    /**
     * @param address
     */
    public void store(int address, BitSet data) {

    }

    /**
     *
     */
    private void executeLoad() {

    }

    /**
     *
     */
    private void executeStore() {

    }

    /**
     * @param codedInstruction to be decoded.
     *
     * @return Instruction
     */
    private Instruction decode(BitSet codedInstruction) {
        return null;
    }

}

