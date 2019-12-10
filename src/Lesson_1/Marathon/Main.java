package Lesson_1.Marathon;

import Lesson_1.Marathon.courses.*;
import Lesson_1.Marathon.runners.*;

public class Main {
    public static void main(String[] args) {


        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] obstacles = {new Cross(80), new Wall(2), new Water(50), new Cross(120)};

        Team team = new Team("BestTeam", competitors);
        System.out.println(team.getTeamRunners());

        System.out.println("Test team");
        team.showResults();

        Course course = new Course(obstacles);
        System.out.println("Team runs obstacles");
        course.doIt(team);
        System.out.println("Show results");
        team.showResults();
        System.out.println("runners team finished obstacle course");
        team.showRunnersFinished();

    }
}

