
public abstract class VatPham {
    protected String tenVatPham;
    protected double chiSoSucManh;
    protected double heSoSucManh;
    protected double soVang;

    public VatPham(){

    }

    public void nhap(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Mời bạn nhập so vang");
        this.soVang = scanner.nextInt();
    }

    public void xuat(){
        System.out.println("Chỉ số sức mạnh: "+ this.chiSoSucManh);
        System.out.println("Hệ số sức mạnh: "+ this.heSoSucManh);
        System.out.println("Số vàng: "+ this.soVang);

    }

    public double tinhSucCongPha(){
        return this.chiSoSucManh * this.heSoSucManh;
    }

    public double tinhSoVangDeMua(){
        return this.tinhSucCongPha() * this.soVang;
    }

    public double getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(double chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public double getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(double heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public double getSoVang() {
        return soVang;
    }

    public void setSoVang(double soVang) {
        this.soVang = soVang;
    }
}
