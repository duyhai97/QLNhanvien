import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanvien = new NhanVien[10];
        nhanvien[0] = new NhanVienFulltime(1 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );
        nhanvien[1] = new NhanVienFulltime(2 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );
        nhanvien[2] = new NhanVienFulltime(3 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 20000000 );
        nhanvien[3] = new NhanVienFulltime(4 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 10000000 );
        nhanvien[4] = new NhanVienFulltime(5 ,"hai" ,24, 11111, "aaa", 1000000, 500000, 20000000 );

        nhanvien[5] = new NhanVienParttime(6, "hai", 25, 1212, "adda", 50);
        nhanvien[6] = new NhanVienParttime(7, "hai", 25, 1212, "adda", 50);
        nhanvien[7] = new NhanVienParttime(8, "hai", 25, 1212, "adda", 50);
        nhanvien[8] = new NhanVienParttime(9, "hai", 25, 1212, "adda", 100);
        nhanvien[9] = new NhanVienParttime(10, "hai", 25, 1212, "adda", 100);

        NhanVien nhanvien10 = new NhanVienFulltime(11, "aaa", 25, 2322, "sddd", 1000000, 0, 10000000);


        ManageNhanvien hai = new ManageNhanvien(nhanvien);
        System.out.println( hai.countAverageSalaryFulltime());
        System.out.println(hai.countTotalSalarypartime());

        hai.addNhanvien(nhanvien, nhanvien10, 9 );
        for (int i = 0; i < nhanvien.length; i++) {
            System.out.println(nhanvien[i]);
//            System.out.println(nhanvien[i].getEmail());
//            System.out.println(nhanvien[i].getName());
//            System.out.println(nhanvien[i].getPhonenumber());
        }
//        System.out.println(Arrays.toString(nhanvien));

//        Arrays.asList(nhanvien).stream().forEach(s -> System.out.println(s));

    }


}
