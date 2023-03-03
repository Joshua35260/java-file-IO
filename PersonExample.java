import java.io.*;

public class PersonExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("John", 25, "123 Main St");

        // Writing person to a file
        PersonOutputStream personOutputStream = new PersonOutputStream(new FileOutputStream("person.dat"));
        personOutputStream.writePerson(person);
        personOutputStream.close();

        // Reading person from a file
        PersonInputStream personInputStream = new PersonInputStream(new FileInputStream("person.dat"));
        Person readPerson = personInputStream.readPerson();
        personInputStream.close();

        System.out.println(readPerson);
    }
}
