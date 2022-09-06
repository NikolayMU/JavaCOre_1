package JavaCore_1;

public class Main {

    public static void main(String[] args) {
        Course course = new Course();
        Team team = new Team();
        course.printCourse();
        team.printTeam();
        course.doIt(team);
        team.printTeamWinner();
    }
}
