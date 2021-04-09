public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanvien = new NhanVien[10];
        nhanvien[0] = new NhanVienFulltime(1 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );
        nhanvien[1] = new NhanVienFulltime(2 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );
        nhanvien[2] = new NhanVienFulltime(3 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );
        nhanvien[3] = new NhanVienFulltime(4 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );
        nhanvien[4] = new NhanVienFulltime(5 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );

        nhanvien[5] = new NhanVienParttime(6, "hai", 25, 1212, "adda", 50);
        nhanvien[6] = new NhanVienParttime(7, "hai", 25, 1212, "adda", 50);
        nhanvien[7] = new NhanVienParttime(8, "hai", 25, 1212, "adda", 50);
        nhanvien[8] = new NhanVienParttime(9, "hai", 25, 1212, "adda", 50);
        nhanvien[9] = new NhanVienParttime(10, "hai", 25, 1212, "adda", 50);

        ManageNhanvien hai = new ManageNhanvien(nhanvien);
        hai.countAverageSalaryFulltime();
        System.out.println( hai.countAverageSalaryFulltime());

    }


}
