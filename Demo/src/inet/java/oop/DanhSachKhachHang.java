package inet.java.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachKhachHang {
    ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
    Scanner input = new Scanner(System.in);

    public void menu() {
        int intChucNang = 0;
        KhachHang nv;
        while (true) {
            System.out.println("Chuc nang cua chuong trinh: ");
            System.out.println("1 - Nhap thong tin Khach Hang: ");
            System.out.println("2 - Xuat thong tin Khach Hang:");
            System.out.println("3 - Thoat chuong trinh: ");
            System.out.println("Chon chuc nang:");
            intChucNang = input.nextInt();
            input.nextLine();
            switch (intChucNang) {
                case 1 :
                    nv = nhap1KhachHang();
                    dskh.add(nv);
                    break;
                case 2 :
                    XuatDanhSachKhachHang();
                    break;
                case 3 :

                    return; // de thoat chuong trinh

                default :
                    System.out.println("Ban chon sai chuc nang. \n Ban hay chon lai.");
                    break;
            }
        }
    }

    private void XuatDanhSachKhachHang() {
        // TODO Auto-generated method stub
        for (int i = 0; i < dskh.size(); i++) {
            KhachHang TempKhachHang = dskh.get(i);
            xuat1KhachHang(TempKhachHang);
        }
    }

    private void xuat1KhachHang(KhachHang tempKhachHang) {
        // TODO Auto-generated method stub
        System.out.println("Thong tin khach hang: " + tempKhachHang.getStrten());
        System.out.println("Nam sinh: " + tempKhachHang.getIntnamsinh());
        System.out.println("Que quan: " + tempKhachHang.getStrquequan());
        System.out.println("Chuyen mon: " + tempKhachHang.getStrchuyenmon());
    }

    private KhachHang nhap1KhachHang() {
        // TODO Auto-generated method stub
        KhachHang result = new KhachHang();
        System.out.println("thong tin khach hang");
        System.out.println("Ten: ");
        String strTen = input.nextLine();
        result.setStrten(strTen);
        System.out.println("Nam Sinh: ");
        int intNamSinh = input.nextInt();
        result.setIntnamsinh(intNamSinh);
        input.nextLine();
        System.out.println("Que Quan: ");
        String strQueQuan = input.nextLine();
        result.setStrquequan(strQueQuan);
        System.out.println("Chuyen mon: ");
        String strChuyenMon = input.nextLine();
        result.setStrchuyenmon(strChuyenMon);
        return result;
    }

}
