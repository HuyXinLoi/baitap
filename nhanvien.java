package baitap;

public class nhanvien extends person{
	private int luong;
	private String ngaynhanviec;
	private pbk pbk;
	
	public nhanvien(String ten, String ns, int luong, String ngaynhanviec, baitap.pbk pbk) {
		super(ten, ns);
		this.luong = luong;
		this.ngaynhanviec = ngaynhanviec;
		this.pbk = pbk;
	}
	
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getNgaynhanviec() {
		return ngaynhanviec;
	}
	public void setNgaynhanviec(String ngaynhanviec) {
		this.ngaynhanviec = ngaynhanviec;
	}
	public pbk getPbk() {
		return pbk;
	}
	public void setPbk(pbk pbk) {
		this.pbk = pbk;
	}
	public void nhap()
	{
		super.nhap̣̣̣̣̣̣̣̣̣̣̣̣̣();
		System.out.println("Nhap luong: ");
		luong = sc.nextInt();
		System.out.println("Nhap ngay nhan viec: ");
		ngaynhanviec = sc.next();
		pbk.nhap();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println(" luong: " + luong);

		System.out.println("Nhap ngay nhan viec: "+ ngaynhanviec);
		pbk.xuat();
	}
}
