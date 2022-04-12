public class App {
    public static void main(String[] args) throws Exception {
        Block block = new Block();
        System.out.println(block.toString());
        System.out.println((Hashing.toHexString(Hashing.hash_256(block))));
    }
}
