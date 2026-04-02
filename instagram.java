public class instagram{
    static String instaid="sathwika_rathkantho05";
    static int followers=350;
     static String password="Sathwika@123";
     static int ageOfUser=20;
    public static void userName(){
        System.out.println("This account Belongs to :" + instaid);
    }
    public static void addFellowers(int number){
    followers=followers+number;
    System.out.println("My current Fellowers after addind new members are: "+followers);

    }
    public static void removeFollowers(int number){
        followers=followers-number;
    System.out.println("My current Fellowers after remove : "+followers);


    }
    public static void checkPassword(String newPassword){
        if (newPassword==password){
           System.out.println("Password matches your password is correct");
        }
        else{
           System.out.println("Password dismatches to your password please enter again"); 
        }
    }
    public static void changeName(String name){
          System.out.println("Change my user name to new user name:"+name);


    }
    public static void changePassword(String password){
          System.out.println("Change my password to new password:"+password);


    }
    public static void checkAge(){
        if (ageOfUser>=18){
           System.out.println("This user id belongs to Adult");
        


        }
        else{
System.out.println("This id Belongs to Teen age");
        }
    }


    public static void main(String[] args) {
    userName();
    checkAge();
    addFellowers(30);
    removeFollowers(150);
    checkPassword("Sathwika@123");
    changeName("Sathwika_Rathkanthi");
    changePassword("Chinni0303");



    }
}