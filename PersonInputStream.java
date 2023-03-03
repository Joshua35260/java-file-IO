import java.io.*;

public class PersonInputStream extends ObjectInputStream {

    public PersonInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    public Person readPerson() throws IOException, ClassNotFoundException {
        return (Person) readObject();
    }
}
