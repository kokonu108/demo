package inet.java.oop;

public class NhanVien extends ConNguoi {
    private String strBoPhan;
    private float floathesoluong;
    public String getStrBoPhan() {
        return strBoPhan;
    }
    public void setStrBoPhan(String strBoPhan) {
        this.strBoPhan = strBoPhan;
    }
    public float getFloathesoluong() {
        return floathesoluong;
    }
    public void setFloathesoluong(float floathesoluong) {
        this.floathesoluong = floathesoluong;
    }
    
    public float tinhLuong(int thang) {
        float result = 0;
        result = thang * 1800000;
        return result;
    }

}
