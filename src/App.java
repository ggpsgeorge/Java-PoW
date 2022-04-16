public class App {
    public static void main(String[] args) throws Exception {
        Block block = new Block();
        String hash = (Hashing.proof_of_work(block));
        System.out.println(block.toString());
        System.out.println(hash);
        System.out.println(Hashing.findHash(block));
    }
}
