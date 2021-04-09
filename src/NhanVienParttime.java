public class NhanVienParttime extends NhanVien {
    private int workinghours;

    public NhanVienParttime(int codestaff, String name, int age, int phonenumber, String email, int workinghours) {
        super(codestaff, name, age, phonenumber, email);
        this.workinghours = workinghours;
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(int workinghours) {
        this.workinghours = workinghours;
    }
}
