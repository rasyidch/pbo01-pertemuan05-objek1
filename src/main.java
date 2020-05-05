public class main {
    public static void main(String[] args){
        //instance
        jalalrun player1 = new jalalrun();
        jalalrun  player2 = new  jalalrun ();
        jalalrun  player3 = new  jalalrun ();
        jalalrun  player4 = new  jalalrun ();

        player1.Username = "Rasyid";
        player1.score = 100;
        player1.length = 1.5;



        player2.Username = "Elisabeth";
        player2.score = 85;
        player2.length = 1.4;


        player3.Username = "Margarita";
        player3.score = 80;
        player3.length = 1.3;

        player4.Username = "Jasmine";
        player4.score = 75;
        player4.length = 1.2;

        player1.run();

        System.out.println(player1.score);
        player1.fast(player2);
        System.out.println(player1.score);


    }
}
