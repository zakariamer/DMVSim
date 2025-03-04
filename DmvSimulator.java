import java.security.SecureRandom;

public class DmvSimulator {
    
    public static void main(String[] args) {
        System.out.println("Hi, welcome to the DMV");

        SecureRandom random = new SecureRandom();

        int num = random.nextInt(100) + 1;
        int counter = num + 1;
        System.out.println("Your number is " + num + ", please wait for your number to be called");

        while (counter != num){
            System.out.println(counter);
            if (counter >= 100){
                counter = 1;
            } else {
                counter += 1;
            }
        }
        System.out.println("May number " + num + " please come up");
        System.out.println("Oh sorry number " + num + " but you don't have the necessary paperwork, bye");
    }

}