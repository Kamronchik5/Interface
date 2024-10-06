public class FootballPlayer extends Player{
    private int card;
    public void setRedCard(int card){
        this.card = card;
    }
    public int getCard(){
        return card;
    }
    public void RedCard(){
        System.out.println(card);
    }

    private int goal;

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }
    public void CountGoal(){
        System.out.println(goal);
    }
}
