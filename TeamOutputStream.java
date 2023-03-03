import java.io.*;
import java.util.List;

public class TeamOutputStream extends ObjectOutputStream {

    public TeamOutputStream(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    public void writeTeam(List<Person> team) throws IOException {
        writeObject(team);
    }
}
