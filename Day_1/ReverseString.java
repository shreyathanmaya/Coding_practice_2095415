package Day_1;

public class ReverseString{
    public static void main(String[] args) {
        String Name = "Thanmaya";
        String reverse = "";
        for (int i = Name.length() - 1; i >= 0; i--) {
            reverse = reverse + Name.charAt(i);
        }
        System.out.println("Reverse of Thanmaya is: " + reverse);
    }
}
