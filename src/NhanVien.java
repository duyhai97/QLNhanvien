public class NhanVien {
    private int codestaff ;
    private String name;
    private int age;
    private int phonenumber;
    private String email;

    public NhanVien(int codestaff, String name, int age, int phonenumber, String email) {
        this.codestaff = codestaff;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public int getCodestaff() {
        return codestaff;
    }

    public void setCodestaff(int codestaff) {
        this.codestaff = codestaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
