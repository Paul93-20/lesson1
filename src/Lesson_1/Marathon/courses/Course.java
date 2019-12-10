package Lesson_1.Marathon.courses;

import Lesson_1.Marathon.runners.Competitor;
import Lesson_1.Marathon.runners.Team;

public class Course {
    Obstacle[] obstacles;
    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Competitor[] teamRunners = team.getTeamRunners();
        if(teamRunners.length > 0){
            for(Competitor c: teamRunners){
                for(Obstacle o: obstacles){
                    o.doIt(c);
                    if(!c.isOnDistance())
                        break;
                }
            }
        }else{
            System.out.println("There are no runners in the team");
        }
    }

}
