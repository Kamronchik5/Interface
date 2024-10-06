public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setSportType("Football");
        player.getInfo();

        FootballPlayer player1 = new FootballPlayer();

        player1.setPosition(10);
        player1.setTeamName("Miami");
        player1.setRedCard(3);
        player1.getInfo();
        player1.RedCard();
    }
}