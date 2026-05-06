public class movieTicket {
    String MovieName;
    int SeatNumber;
    int Price;
    public movieTicket( String MovieName,int SeatNumber,int Price){
        this.MovieName=MovieName;
        this.SeatNumber=SeatNumber;
        this.Price=Price;
    }

    public static void main(String[] args) {
       movieTicket m1=new movieTicket("Rebel",23,345);
       movieTicket m2=new movieTicket("Salaar",100,450);
       movieTicket m3=new movieTicket("Saaho",45,800);
       m1.call();
       m2.call();
       m3.call();
       

    }
    public void call() {
        System.out.println("MovieName:"+MovieName+"SeatNumber:"+SeatNumber+"Price:"+Price);
        
    }
}
