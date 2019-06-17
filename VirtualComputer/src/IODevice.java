import java.util.BitSet;

interface IODevice {
    BitSet read();
    void write(BitSet data);
}