class Registrar extends Person {
    private String employeeId;
    private int yearsOfService;
    private float documentFee;
    private boolean isOnDuty;
    private char accessLevel;
    private String address;

    Registrar(String name, int age, String birthdate, String employeeId, int yearsOfService, float documentFee, boolean isOnDuty, char accessLevel, String address) {
        super(name, age, birthdate);
        setEmployeeId(employeeId);
        setYearsOfService(yearsOfService);
        setDocumentFee(documentFee);
        setOnDuty(isOnDuty);
        setAccessLevel(accessLevel);
        setAddress(address);
    }

    // getters
    public String getEmployeeId() { return employeeId; }
    public int getYearsOfService() { return yearsOfService; }
    public float getDocumentFee() { return documentFee; }
    public boolean isOnDuty() { return isOnDuty; }
    public char getAccessLevel() { return accessLevel; }
    public String getAddress() { return address; }

    //setters
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public void setYearsOfService(int yearsOfService) { this.yearsOfService = yearsOfService; }
    public void setDocumentFee(float documentFee) { this.documentFee = documentFee; }
    public void setOnDuty(boolean isOnDuty) { this.isOnDuty = isOnDuty; }
    public void setAccessLevel(char accessLevel) { this.accessLevel = accessLevel; }
    public void setAddress(String address) {this.address = address; }

    // display
    void displayRegistrar() {
        displayPerson();
        System.out.println("Employee ID : " + employeeId + "\nYears Of Service : " + yearsOfService + "\nDocument Fee : " + documentFee + "\nIs On Duty? : " + isOnDuty + "\nAccess Level : " + accessLevel + "\nAddress : " + address);
    }
}