
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DSVatPham {
    private List<VatPham> arr;

    public DSVatPham(){
        this.arr = new ArrayList<>();
    }

    public void xuat(){
        System.out.println("Thông tin vật phẩm Chiếc Búa Thần:");
        VatPham buaThan = new ChiecBuaThan();
        buaThan.xuat();
        System.out.println("Sức công phá: "+buaThan.tinhSucCongPha());
        System.out.println("######################");
        System.out.println("Thông tin vật phẩm Bao Tay Sấm Sét:");
        VatPham baoTay = new BaoTaySamSet();
        baoTay.xuat();
        System.out.println("Sức công phá: "+baoTay.tinhSucCongPha());
        System.out.println("######################");
        System.out.println("Thông tin vật phẩm Hòn Đá Kích Nổ:");
        VatPham honDa = new HonDaKichNo();
        honDa.xuat();
        System.out.println("Sức công phá: "+honDa.tinhSucCongPha());
        System.out.println("######################");
        System.out.println("Thông tin vật phẩm Cây Rìu Phép Thuật:");
        VatPham cayRiu = new CayRiuPhepThuat();
        cayRiu.xuat();
        System.out.println("Sức công phá: "+cayRiu.tinhSucCongPha());
        System.out.println("######################");
        System.out.println("Thông tin vật phẩm Cây Gậy Chiến Thần:");
        VatPham cayGay = new CayGayChienThan();
        cayGay.xuat();
        System.out.println("Sức công phá: "+cayGay.tinhSucCongPha());
        System.out.println("######################");
    }

//    public void cau3(){
//        Optional<VatPham> vatPham = arr.stream()
//                .max(Comparator.comparingDouble(VatPham::tinhSoVangDeMua));
//        System.out.println("Vật phẩm nhiều vàng nhất là: " + vatPham.orElse(null).tenVatPham);
//    }

    public VatPham cau3() {
        Optional<VatPham> vatphamnhieunhat = arr.stream()
                .filter(vp -> vp instanceof VatPham)
                .map(vp -> (VatPham) vp)
                .max(Comparator.comparingDouble(VatPham::tinhSoVangDeMua));

        return vatphamnhieunhat.orElse(null);
    }

    public float tinhTongVang(){
        float sum=0;
        sum = (float) (25*2*10 + 30*1*7 + 40*2*12 + 30*1.5*10 + 20*1*7);
        return sum;
    }

    public void cau4(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Mời bạn nhập số vàng Spon thu được");
        int sovang = scanner.nextInt();
        float sovangcanthiet = tinhTongVang();
        if (sovang<sovangcanthiet){
            System.out.printf("Spon cần thu thập thêm %f nữa để cứu đồng đội nha",  sovangcanthiet - sovang );
        } else {
            System.out.println("Spon có thể cứu đồng đội");
        }

    }



}
