package Lesson_1.Marathon.runners;

public class Team {
    String teamTitle;

    Competitor[] teamRunners = new Competitor[4];

    public Team(String teamTitle, Competitor[] teamRunners) {
        this.teamTitle = teamTitle;
        this.teamRunners = teamRunners;
    }

    public String getTeamTitle() {
        return teamTitle;
    }

    public Competitor[] getTeamRunners() {
        return teamRunners;
    }
    public void showResults(){
        for (Competitor c : teamRunners){
            c.info();
        }
    }
    public void showRunnersFinished(){
        for (Competitor c : teamRunners){
            if(c.isOnDistance()){
                c.info();
            }
        }
    }
}


