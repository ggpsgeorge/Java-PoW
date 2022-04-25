public class App {
    public static void main(String[] args) throws Exception {
        //Blockchain init and creation of the Genesis block
        Blockchain blockchain = new Blockchain();
        Block genBlock = blockchain.getBlock();
        String hash = (Hashing.proof_of_work(genBlock));
        System.out.println(hash);
        blockchain.setBlock(genBlock);
        genBlock = blockchain.getBlock();
        blockchain.getChain().add(genBlock);

        //Insert new blocks
        int count = 0;
        while(count < 10){
            Block block = new Block(hash, "");
            hash = (Hashing.proof_of_work(block));
            System.out.println(hash);
            blockchain.getChain().add(block);
            count++;
        }

        blockchain.printChain();
    }
}
