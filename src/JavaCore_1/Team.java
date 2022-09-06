package JavaCore_1;

import java.util.Random;

public class Team {

    enum Results {START, RUN, WIN, LOSE}



    protected class Participant{

        private int duration;
        private Results result;

        public void Partisipant() {

            Random random = new Random;
            this.duration = random.nextInt(100);
            this.result = result.START;
        }

            public String toString(){
            return duration;
        }

        public void setResult(Results result){
            this.result = result;
        }

        public int getDuration(){
            return duration;
        }
        public void MinDuration(int i){
            this.duration = this.duration-i;
        }
    // Создаем команду участников

        protected Participant[] partisipantArray = new Participant[4];
        private String name;

        public Team() {
            this.name = "Команда Москва";
            for (int i=0; i<4; i+=1) {
                this.partisipantArray[i] = new Participant();
            }
        }
    public void printTeamWinner() {
            System.out.println("Команда" + this.name+":");
            for (int i = 0; i<4; i=+1){
                System.out.println("Участник" +(i=1)+(partisipantArray[i]+ " "+ partisipantArray[i].result+")");
            }
    }
     public void printTeamWinner();{
        System.out.println("Победители:");
        for (int i = 0; i< 4; i +=1) {
            if (partisipantArray[i].result==Results.WIN){
                System.out.println("Участник" +(i=1)+(partisipantArray[i]);
            }
        }
        }
    }
}
}


