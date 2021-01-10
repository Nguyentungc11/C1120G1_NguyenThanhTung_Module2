package test;

public class Test {

    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
        //System.out.println(nhanVien1 instanceof TruongPhong);
        //((TruongPhong)nhanvien1).getTen();
        TruongPhong truongPhong = new TruongPhong();
        //((NhanVien)truongPhong).getLuong();
//        System.out.println(truongPhong instanceof NhanVien);
//        nhanVien1.getLuong();
//        truongPhong.getLuong();
        nhanVien1.setName("tung");
//        truongPhong.setName("abc");
//        System.out.println(nhanVien1.getName());
//        System.out.println(truongPhong.getName());
//        NhanVien nhanvien2 = new TruongPhong();
//        nhanvien2.getLuong();
//        ((TruongPhong)nhanvien2).getTen();
    }
}
