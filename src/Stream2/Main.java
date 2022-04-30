package src.Stream2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static src.Stream2.Education.HIGHER;
import static src.Stream2.Sex.MAN;
import static src.Stream2.Sex.WOMAN;


public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");

        Collection<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

        Stream<Person> personStream = persons.stream();
        Long countKids = personStream.filter(x -> x.getAge() < 18).count();
        System.out.println(countKids);


        Stream<Person> personStream1 = persons.stream();
        List<String> warn;
        warn = personStream1
                .filter(x -> x.getAge() > 17)
                .filter(x -> x.getAge() < 28)
                .map(x -> x.getFamily())
                .collect(Collectors.toList());
        System.out.println(warn);


        Stream<Person> personStream2 = persons.stream();
        List<String> workPeople;
        workPeople = personStream2
                .filter(x -> x.getEducation() == HIGHER)
                .filter(x -> x.getAge() >= 18)
                .filter(x -> (x.getAge() <= 60 && x.getSex() == WOMAN) || (x.getAge() <= 65 && x.getSex() == MAN))
                .sorted(Comparator.comparing(Person::getFamily))
                .map(x -> x.getFamily())
                .collect(Collectors.toList());
        System.out.println(workPeople);

    }
}
