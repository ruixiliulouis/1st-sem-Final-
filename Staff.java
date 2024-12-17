public class Staff {
    private String name;
    private String email;
    private String phone;
    private int age;
    private String address;

    public Staff(String name, String email, String phone, int age, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }

    public void login() {
        System.out.println(name + " has logged in.");
    }

    @Override
    public String toString() {
        return "Staff [Name: " + name + ", Email: " + email + ", Phone: " + phone +
               ", Age: " + age + ", Address: " + address + "]";
    }
}
