import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.w3c.dom.NameList;

public class Main {

    private static String[] names = { "Mike", "Alex", "Matt", "Dee Dee", "Wendy", "Missy", "Dewey", "Farley",
            "Denver" };

    private static String[][] box = { { "Mike", "Alex" }, { "Matt", "Dee Dee" }, { "Wendy", "Missy" },
            { "Dewey", "Farley" }, { "Denver", "Mystery" } };

    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Mike", 61);
        ages.put("Wendy", 55);
        ages.put("Alex", 26);
        ages.put("Matt", 23);
        ages.put("Dee Dee", 17);
        ages.put("Missy", 16);
        ages.put("Dewey", 7);
        ages.put("Farley", 4);
        ages.put("Denver", 5);

        List<String> namesList = Arrays.asList(names);

        List<Person> persons = new ArrayList<>();

        var iter = ages.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            persons.add(new Person(key, ages.get(key)));
        }

        List<Person> humans = persons.stream().filter(p -> "Mike,Wendy,Alex,Matt".contains(p.getName()))
                .collect(Collectors.toList());
        List<Person> pets = persons.stream().filter(p -> !"Mike,Wendy,Alex,Matt".contains(p.getName()))
                .collect(Collectors.toList());

        humans.stream().forEach(h -> h.setSpecies(Person.Species.HUMAN));
        pets.stream().forEach(p -> p.setSpecies(Person.Species.ANIMAL));

        persons.clear();
        persons.addAll(humans);
        persons.addAll(pets);

        MyList list = new MyList();
        persons.forEach(p -> {
            list.add(p);
        });

        MyStack myStack = new MyStack();
        persons.forEach(p -> {
            myStack.push(p);
        });

        MyQueue myQueue = new MyQueue();
        persons.forEach(p -> {
            myQueue.enqueue(p);
        });

        list.remove(4);

        Iterator iters = list.getIterator();
        while (iters.hasNext()) {
            System.out.println(iters.next());
        }

        System.out.println("GET IT: " + list.get(0).toString());

        MyTree tree = new MyTree();
        namesList.forEach(n -> tree.add(n));

        Node result = (Node) tree.search("Dee Dee");
        System.out.println("Here::" + result.getData().toString());
        tree.traverse();

        System.out.println("Name:" + box[3][0]);

        SimpleObject simpleObject = new SimpleObject(new SmallObject("Zippy", 22));

        SimpleObject simpleObject2 = new SimpleObject(simpleObject);

        System.out.println(simpleObject.toString());

        Integer age = simpleObject.getSmallObject().getAge();

        age = Integer.valueOf(33);

        System.out.println(simpleObject.toString());

        SmallObject smallObject = simpleObject.getSmallObject();

        smallObject.setAge(34);

        System.out.println(simpleObject.toString());

        System.out.println("The Stack!!!");
        while (myStack.size() > 0) {
            System.out.println(" " + myStack.size() + ": " + myStack.pop().toString());
        }

        int i = 1;
        while (myQueue.size() > 0) {
            System.out.println(" " + (i++) + ": " + myQueue.dequeue().toString());
        }

    }

}