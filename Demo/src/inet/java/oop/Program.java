package inet.java.oop;

import java.util.Scanner;

public class Program {

    private Scanner input;
    /**
     * [Give the description for method].
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // NhanVien objNhanVien = new NhanVien();
        // Program objProgram = new Program();
        // objProgram.inputNhanVien(objNhanVien);
        // objProgram.outputNhanVien(objNhanVien);
        //
        // NhanVien NguyenVanA = new NhanVien();
        // objProgram.inputNhanVien(NguyenVanA);
        // objProgram.outputNhanVien(NguyenVanA);
        // System.out.println("Luong: " + NguyenVanA.tinhLuong(6));
        //
        // NhanVien NguyenVanB = new CongTacVien();
        // objProgram.inputNhanVien(NguyenVanB);
        // objProgram.outputNhanVien(NguyenVanB);
        // System.out.println("Luong: " + NguyenVanB.tinhLuong(6));
//        DanhSachKhachHang js = new DanhSachKhachHang();
//        js.menu();

        Program pro = new Program();
        int x = 7;
        pro.DemoPrimitive(x);
        System.out.println("x la " + x);

    }

    public void DemoPrimitive(int x) {
        x = x * x;
    }
    private void inputNhanVien(NhanVien objNhanVien) {
        // TODO Auto-generated method stub
        input = new Scanner(System.in);
        System.out.println("Ten nhan vien: ");
        String strTenNV = input.nextLine();
        objNhanVien.setStrten(strTenNV);
        System.out.println("Nam sinh nhan vien ");
        int intNamSinhNV = input.nextInt();
        objNhanVien.setIntnamsinh(intNamSinhNV);
        input.nextLine(); // bi loi khi getInt nam sinh lay luon /n
        System.out.println("Que Quan: ");
        String strquequan = input.nextLine();
        objNhanVien.setStrquequan(strquequan);
        System.out.println("Bo Phan : ");
        String strBoPhan = input.nextLine();
        objNhanVien.setStrBoPhan(strBoPhan);
        System.out.println("He so luong : ");
        float floathesoluong = input.nextFloat();
        objNhanVien.setFloathesoluong(floathesoluong);

    }

    private void outputNhanVien(NhanVien objNhanVien) {
        // TODO Auto-generated method stub
        System.out.println("Thong tin nhan vien: " + objNhanVien.getStrten());
        System.out.println("Nam Sinh: " + objNhanVien.getIntnamsinh());
        System.out.println("Que Quan: " + objNhanVien.getStrquequan());
        System.out.println("Bo Phan: " + objNhanVien.getStrBoPhan());
        System.out.println("He so luong: " + objNhanVien.getFloathesoluong());

    }

}
