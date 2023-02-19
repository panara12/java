public class Stringmethods {
    public static void main(String[] args) {
        String a = "my name is abhay";
        String b = "I am very bad boy";
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        //returns the index (the position) of the first 
        //occurrence of a specified text in a string
        System.out.println(a.indexOf("is"));
        System.out.println(a+" and ".concat(b));
        System.out.println("hel\rlo \"mr.abhay\" it\'s very\f nice\f to meet\b you! ");
    }
}
