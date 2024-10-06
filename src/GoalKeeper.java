public class GoalKeeper extends FootballPlayer{

    private int saves;
    public void setSaves(int saves){
        this.saves=saves;
    }
    public int getSaves(){
        return saves;
    }
    public void CountSaves(){
        System.out.println(saves);
    }
}
