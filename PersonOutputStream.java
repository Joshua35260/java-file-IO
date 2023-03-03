import java.io.*;

public class PersonOutputStream extends ObjectOutputStream {

    public PersonOutputStream(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    public void writePerson(Person person) throws IOException {
        writeObject(person);
    }
}
