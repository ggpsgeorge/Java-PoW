import java.util.ArrayList;

public class Blockchain {

    private Block block;
    private ArrayList<Block> chain;

    public Blockchain(){
        this.block = new Block("0", "");
        this.chain = new ArrayList<Block>();
    }

    public void  printChain(){
        for(Block tempBlock : chain ){
            System.out.println(tempBlock.toString());
        }
    }

    public Block getBlock() {
        return this.block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public ArrayList<Block> getChain() {
        return this.chain;
    }

    public void setChain(ArrayList<Block> chain) {
        this.chain = chain;
    }

}
