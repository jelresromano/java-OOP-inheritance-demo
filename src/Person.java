class Person  {
    private String name;
    private int age;
    private String birthdate;

    Person (String name, int age, String birthdate) {
        setName(name);
        setAge(age);
        setBirthdate(birthdate);
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getBirthdate() { return birthdate; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }

    // display
    void displayPerson() {
        System.out.println("\nName : " + name + "\nAge : " + age + "\nBirthdate : " + birthdate);
    }
}
