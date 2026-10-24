class Student extends Person {
    private String studentId;
    private String course;
    private char section;
    private String department;
    private double gpa;
    private boolean isEnrolled;

    Student(String name, int age, String birthdate, String studentId, String course, char section, String department, double gpa, boolean isEnrolled) {
        super(name, age, birthdate);
        setStudentId(studentId);
        setCourse(course);
        setSection(section);
        setDepartment(department);
        setGpa(gpa);
        setEnrolled(isEnrolled);
    }

    // getters
    public String getStudentId() { return studentId; }
    public String getCourse() { return course; }
    public char getSection() { return section; }
    public String getDepartment() { return department; }
    public double getGpa() { return gpa; }
    public boolean isEnrolled() { return isEnrolled; }

    // setters
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setCourse(String course) { this.course = course; }
    public void setSection(char section) { this.section = section; }
    public void setDepartment(String department) { this.department = department; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setEnrolled(boolean isEnrolled) { this.isEnrolled = isEnrolled; }

    // display
    void displayStudent() {
        displayPerson();
        System.out.println("Student ID : " + studentId + "\nCourse : " + course + "\nSection : " + section + "\nDepartment : " + department + "\nGPA : " + gpa + "\nIs Enrolled? : " + isEnrolled);
    }
}