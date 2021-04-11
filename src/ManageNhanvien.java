public class ManageNhanvien {
    private NhanVien[] nhanViens;

    public ManageNhanvien(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public NhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public int countSalaryReal(){
        int luongthuclinh = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanVienFulltime ){
                NhanVienFulltime a = (NhanVienFulltime)nhanViens[i];
                luongthuclinh = a.getHardsalary() + (a.getBonusmoney() -a.getPunishmoney());

            }
            else  if (nhanViens[i] instanceof NhanVienParttime ){
                NhanVienParttime b = (NhanVienParttime)nhanViens[i];
                luongthuclinh = b.getWorkinghours()*100000;
            }
        }
        return luongthuclinh;
    }

    public int countAverageSalaryFulltime(){
        int dem = 0;
        int total = 0;
        int count = 0;
        int luongtrungbinh = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanVienFulltime){
                NhanVienFulltime aa = (NhanVienFulltime)nhanViens[i];
                count++;
                total += aa.getHardsalary() + (aa.getBonusmoney() -aa.getPunishmoney());
                luongtrungbinh = total/count;
                if (aa.getHardsalary() + (aa.getBonusmoney() -aa.getPunishmoney()) < luongtrungbinh){
                        dem++;
                }
            }

        }
        return dem;
    }

    public int countTotalSalarypartime(){
        int total = 0;
        int count = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof NhanVienParttime){
                NhanVienParttime a = (NhanVienParttime)nhanViens[i];
              total += a.getWorkinghours()*100000;
            }
        }
        return total;
    }

    public NhanVien[] addNhanvien(NhanVien[] nhanViens, NhanVien nhanVien, int index){
        NhanVien[] nhanViens1 = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
                nhanViens1[i] =nhanViens[i];
                nhanViens1[index] = nhanVien;
        }
        for (int i = index + 1; i < nhanViens1.length; i++) {
                nhanViens1[i] = nhanViens[i -1];
        }
        return nhanViens1;
    }


}
