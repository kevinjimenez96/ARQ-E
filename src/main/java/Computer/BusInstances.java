package Computer;

import Computer.CPU.LocalBus;
import Computer.IOModule.ExpansionBus;
import Computer.MainMemory.MemoryBus;

public class BusInstances {

    public static final LocalBus localBus = new LocalBus();
    public static final ExpansionBus expansionBus = new ExpansionBus();
    public static final MemoryBus memoryBus = new MemoryBus();

}
