package Computer.Utils;

public class BitSet {

    private boolean[] bitset;
    private int size;

    public BitSet(int size){
        this.size = size;
        this.bitset = new boolean[size];
    }

    public BitSet(BitSet bitset){
        this.size = bitset.getSize();
        this.bitset = bitset.getBitset();
    }

    public BitSet(String bits){
        this.size = bits.length();
        this.bitset = new boolean[size];
        for (int i = 0; i < size; i++) {
            if(bits.charAt(i) == '1'){
                bitset[i] = true;
            }else{
                bitset[i] = false;
            }
        }
    }

    // Hay que contemplar two's complement aquí
    public BitSet subBitSet(int from, int to){

        BitSet subBitSet = new BitSet(to-from);
        boolean[] values = new boolean[to-from];

        for(int i = from; i < to; ++i){
            values[i - from] = this.bitset[i];
        }

        subBitSet.setBitset(values);

        return subBitSet;
    }

    //Crear aquí métodos que sean necesarios para operaciones con Computer.Utils.BitSet.

    public int toInt (){
        int value = 0;

        for(int i = 0; i < this.size; ++i){
            if (this.bitset[0]) {
                if (!this.bitset[i]) {
                    value -= (int) Math.pow(2, i);
                }
            }else{
                if (this.bitset[i]) {
                    value += (int) Math.pow(2, i);
                }
            }
        }

        return value;
    }

    public void setIntToBitSet(int value){

        int mod = 0;

        for(int i = size-1; i >= 0; --i){

            mod = value % 2;
            if (mod == 1) {
                this.bitset[i] = true;
            }else{
                this.bitset[i] = false;
            }
            value = value / 2;
        }

    }

    public boolean[] getBitset() {
        return bitset;
    }

    public void setBitset(boolean[] bitset) {
        this.bitset = bitset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String toString(){
        String binary = "";
        for (boolean bit : bitset) {
            if(bit){
                binary += "1";
            }else{
                binary += "0";
            }
        }
        return binary;
    }
}
