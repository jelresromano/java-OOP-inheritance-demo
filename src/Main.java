public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Jelres", 19, "2006-12-27");
        Student s1 = new Student("Jumapit", 19, "2006-12-05", "202500771", "BSIT", 'C', "Norsu", 90.25d, true);
        Registrar r1 = new Registrar("Ilde", 19, "2006-08-20", "2012011", 4, 24000.55f, true, 'A', "Bindoy");

        p1.displayPerson();
        s1.displayStudent();
        r1.displayRegistrar();
    }
}