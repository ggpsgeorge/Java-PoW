import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger; 
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class AddressGeneration {
    
    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String generateAddress(int wordsNum) throws NoSuchAlgorithmException{
        
        String stringAddress = "";
        int wordsLength = 6;
        
        for (int i = 0; i < wordsNum; i++) {
            stringAddress += generateRandomWord(wordsLength) + " ";
        }

        return generateHash(stringAddress);
       
    }

    public static String generateHash(String address) throws NoSuchAlgorithmException{

        MessageDigest message = MessageDigest.getInstance("SHA-256");
        byte[] digested = message.digest(address.getBytes(StandardCharsets.UTF_8));
        BigInteger number = new BigInteger(1, digested);
        StringBuilder hex = new StringBuilder(number.toString(16));
        
        while(hex.length() < 32){
            hex.insert(0, "0");
        
        }
        return hex.toString();
    }

    public static String generateRandomWord(int length){

        String tempString = "";

        for(int i = 0; i < length; i++){
            // size of the alphabet 
            int index = generatedRandomInt(0, 52);
            tempString += alphabet[index];
        }

        return tempString;
    }

    public static int  generatedRandomInt(int min, int max){
        int num = (int)(Math.random()*(max - min) + min);
        return num;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        int numWords = 24;
        int numAddresses = 1000;
        
        try{
        
            FileWriter output = new FileWriter("addresses.txt", true);
            for (int i = 0; i < numAddresses; i++) {
                output.write(generateAddress(numWords) + '\n');
            }
            output.close();   
        
        }catch(Exception e){
            e.getStackTrace();
        }

    }
}
