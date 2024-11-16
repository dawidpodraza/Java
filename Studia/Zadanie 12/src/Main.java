public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Kamil","Nowak",1921);

        person1.setYearOfBirth(1989);
        

        System.out.println(person1.printInfo());
        System.out.println(person1.printAge()+" lat");

    }
}
