import java.io.*;
import java.util.List;

public class TeamInputStream extends ObjectInputStream {

    public TeamInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @SuppressWarnings("unchecked")
    public List<Person> readTeam() throws IOException, ClassNotFoundException {
        return (List<Person>) readObject();
    }
}
