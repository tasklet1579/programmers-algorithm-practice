package edu.programmers.practice.kit.bf.p42840;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(new Solution().solution(answers)));
    }
}

class Solution {

    public int[] solution(int[] answers) {
        Persons persons = createPersons();

        Arrays.stream(answers)
              .forEach(persons::mark);

        return persons.answer();
    }

    public Persons createPersons() {
        Person p1 = new Person(Arrays.asList(1, 2, 3, 4, 5));
        Person p2 = new Person(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        Person p3 = new Person(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        return new Persons(Arrays.asList(p1, p2, p3));
    }
}

class Person {
    private final List<Integer> numbers;

    public Person(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public boolean contains(int number) {
        int i = numbers.get(0);
        numbers.remove(0);
        numbers.add(i);
        return i == number;
    }
}

class Persons {
    private final List<Person> persons;
    private final int[] answers;

    public Persons(List<Person> persons) {
        this.persons = new ArrayList<>(persons);
        this.answers = new int[persons.size()];
    }

    public void mark(int number) {
        int[] idx = {0};

        persons.forEach(person -> {
            if (person.contains(number)) {
                answers[idx[0]]++;
            }
            idx[0]++;
        });
    }

    public int[] answer() {
        int max = Arrays.stream(answers)
                        .max()
                        .getAsInt();
        int[] idx = {0};
        List<Integer> persons = new LinkedList<>();

        Arrays.stream(answers)
              .forEach(count -> {
                  if (count == max) {
                      persons.add(idx[0]);
                  }
                  idx[0]++;
              });

        return persons.stream()
                      .mapToInt(i -> i + 1)
                      .toArray();
    }
}
