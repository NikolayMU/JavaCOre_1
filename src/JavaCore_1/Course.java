package JavaCore_1;

public class Course {
    String result;
    private int run;
    private int swim;
    private int climb;


    public Course(int run, int swim, int climb) {
        this.run = run;
        this.swim = swim;
        this.climb = climb;
    }
    // Просим пройти полосу препятсвий
    public String doIt(Group group) {
        result = "Группа номер: " + group.getName() + " " + '\n';
        for (Person person : group.getPeoples()) {
            result += "Имя участника: " + person.getName() + " " + '\n';
            int value = person.getPower();
            testRun(value);
            testSwim(value);
            testClimb(value);

        }

        return result;
    }

    private void testRun(int value){
        if(value>=run) result = result + "Дистанцию пробежал "+ '\n';
        else result += "Дистанцию не пробежал "+ '\n';

    }

    private void testSwim(int value){
        if(value>=swim) result += "Дистанцию проплыл "+ '\n';
        else result += "Дистанцию не проплыл "+ '\n';
    }

    private void testClimb(int value){
        if(value>=climb) result += "Препятствие преодолел "+ '\n';
        else result += "Препятствие не преодолел  "+ '\n';
    }

    }