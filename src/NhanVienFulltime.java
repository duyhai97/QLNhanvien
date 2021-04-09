public class NhanVienFulltime extends NhanVien {
    private int bonusmoney;
    private int punishmoney;
    private int hardsalary;

    public NhanVienFulltime(int codestaff, String name, int age, int phonenumber, String email, int bonusmoney, int punishmoney, int hardsalary) {
        super(codestaff, name, age, phonenumber, email);
        this.bonusmoney = bonusmoney;
        this.punishmoney = punishmoney;
        this.hardsalary = hardsalary;
    }

    public int getBonusmoney() {
        return bonusmoney;
    }

    public void setBonusmoney(int bonusmoney) {
        this.bonusmoney = bonusmoney;
    }

    public int getPunishmoney() {
        return punishmoney;
    }

    public void setPunishmoney(int punishmoney) {
        this.punishmoney = punishmoney;
    }

    public int getHardsalary() {
        return hardsalary;
    }

    public void setHardsalary(int hardsalary) {
        this.hardsalary = hardsalary;
    }
}
