import model.Person;
import model.PersonSample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Person> frames = new ArrayList<Person>();

    public static void animate() throws InterruptedException {
        System.out.println("********************************");
        System.out.println("* ");
        System.out.println("* Ajuste a altura da sua tela!");
        System.out.println("* ");
        System.out.println("********************************");
        Thread.sleep(3000);
        for (Person frame: frames){
            frame.draw();
            Thread.sleep(500);
        }
        System.out.println("********************");
        System.out.println("* ");
        System.out.println("* Fim");
        System.out.println("* ");
    }


    //Clona o ultimo frame e joga para o lado esquerdo
    public static Person addleft(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.left();
        frames.add(person);
        return person;
    }

    public static Person addRight(Person p) throws CloneNotSupportedException {
        Person person = (Person) p.clone();
        person.right();
        frames.add(person);
        return person;
    }
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        PersonSample sample = new PersonSample();

        //Person person = sample.get("strickMan");
        Person person = sample.get("fatMan");
        frames.add(person);
        person = addleft(person);
        person = addleft(person);
        person = addleft(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addleft(person);
        person = addleft(person);
        animate();
    }
}