public class Player implements Information{

    private String name;

    public String getName() {
        return name;
    }

    public void nameOfPlayer(String name) {
        this.name = name;
    }
    private String sportType;

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String type) {
        this.sportType = type;
    }
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public void getInfo() {
        System.out.println(name);
        System.out.println(sportType);
        System.out.println(position);
    }
    private String teamName;
    public String getTeam(){
        return teamName;
    }

    public void setTeamName(String Teamname) {
        this.name = Teamname;
    }

    @Override
    public void getTeamName() {
        System.out.println(teamName);
    }

}
