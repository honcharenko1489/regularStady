package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants= new ArrayList<>();

    public Team (String name){
        this.name=name;
    }
    public void addNewParticipant(T p){
        participants.add(p);
        System.out.println("To team "+name+"  was added new participant with name "+ p.getName());

    }
    public void playWith(Team<T> team){
        String winnerName;
        Random ran = new Random();
        int i = ran.nextInt(2);
        if (i==0){
            winnerName = this.name;
        }else {
            winnerName = team.name;
        }
        System.out.println("Win team : "+ winnerName);
    }
}
