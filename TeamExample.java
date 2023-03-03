import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> team = new ArrayList<>();
        team.add(new Person("John", 25, "123 Main St"));
        team.add(new Person("Jane", 30, "456 Elm St"));
        team.add(new Person("Jack", 35, "789 Pine St"));

        // Writing team to a file
        TeamOutputStream teamOutputStream = new TeamOutputStream(new FileOutputStream("team.dat"));
        teamOutputStream.writeTeam(team);
        teamOutputStream.close();

        // Reading team from a file
        TeamInputStream teamInputStream = new TeamInputStream(new FileInputStream("team.dat"));
        List<Person> readTeam = teamInputStream.readTeam();
        teamInputStream.close();

        System.out.println(readTeam);
    }
}
