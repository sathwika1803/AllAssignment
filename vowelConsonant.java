public class vowelConsonant {
    static char alpha='Z';
    public static void main(String[] args) {
        switch(alpha){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
           System.out.println("Vowels");
           break;
           default:
            System.out.println("Consonant");
        }
    }
}
