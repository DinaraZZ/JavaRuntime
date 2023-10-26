package oop_practice.task_1;

public class City {
    private String name;
    private Person[] people;

    // alt+insert
    public City(String name) {
        this.name = name;
        people = new Person[]{};
    }

    public City(String name, Person[] people) {
        this.name = name;
        this.people = people;
    }

    public int adultNumber() {
        if (people.length != 0) {
            int adultNum = 0;

            for (int i = 0; i < people.length; i++) {
                if (people[i].getAge() >= 18) {
                    adultNum++;
                }
            }
            return adultNum;
        } else return -1;
    }

    public double adultAverageAge() {
        if (people.length != 0) {
            int sumAge = 0;
            int adultNum = adultNumber();
            double averageAge;

            for (int i = 0; i < people.length; i++) {
                if (people[i].getAge() >= 18) {
                    sumAge += people[i].getAge();
                }
            }

            averageAge = (double) sumAge / adultNum;
            return averageAge;
        } else return -1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public Person[] getPeople() {
        return people;
    }
}
