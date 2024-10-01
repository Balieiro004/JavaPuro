package model;

import java.util.HashMap;
import java.util.Map;

public class PersonSample {
    private Map<String, Person> samples;

    public PersonSample(){
        samples = new HashMap<>();
        loadsamples();
    }

    public Person get(String type){
        return samples.get(type);
    }

    private void  loadsamples(){
        samples.put("strickMan", new Person(
           "                    ",
           "        o            ",
           "       /|\\           ",
           "_______/_\\____________"
        ));
        samples.put("fatMan", new Person(
                "                    ",
                "     (^ ^)            ",
                "     <)  )\\           ",
                "_____/___\\____________"
        )); //video 40 8:25
    }
}
