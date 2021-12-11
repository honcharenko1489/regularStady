package generics.game;

public class Test {
    public static void main(String[] args) {
        Scooler sc1 = new Scooler("Ivan", 13);
        Scooler sc2 = new Scooler("Borat", 35);

        Student st1 = new Student("Baran", 15);
        Student st2 = new Student("Taras", 33);

        Employee em1 = new Employee("Alesha", 50);
        Employee em2 = new Employee("Vasya", 51);

        Team<Scooler> scTeam = new Team<>("scTEAM!");
        scTeam.addNewParticipant(sc1);
        scTeam.addNewParticipant(sc2);

        Team<Student> stTeam = new Team<>("STADY!");
        stTeam.addNewParticipant(st1);
        stTeam.addNewParticipant(st2);

        Team<Employee> emTeam = new Team<>("WorkerS!");
        emTeam.addNewParticipant(em1);
        emTeam.addNewParticipant(em2);


        Team<Scooler> scoolerTeam = new Team<>("DROKERS!");
        Scooler scoo1 = new Scooler("Kostya", 10);
        Scooler scoo2 = new Scooler("Bodya", 8);
        scTeam.addNewParticipant(scoo1);
        scTeam.addNewParticipant(scoo2);

        scTeam.playWith(scoolerTeam);
    }
}
