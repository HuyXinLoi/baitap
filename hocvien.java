package baitap;

public class hocvien extends person{
	private int diem1;
	public hocvien(String ten, String ns, int diem1, int diem2, int diem3) {
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}
	private int diem2;
	private int diem3;
	public int getDiem1() {
		return diem1;
	}
	public void setDiem1(int diem1) {
		this.diem1 = diem1;
	}
	public int getDiem2() {
		return diem2;
	}
	public void setDiem2(int diem2) {
		this.diem2 = diem2;
	}
	public int getDiem3() {
		return diem3;
	}
	public void setDiem3(int diem3) {
		this.diem3 = diem3;
	}
	public void nhap()
	{
		super.nhap̣̣̣̣̣̣̣̣̣̣̣̣̣();
		System.out.println("Nhap diem 1: ");
		diem1 = sc.nextInt();
		System.out.println("Nhap diem 2 : ");
		diem2 = sc.nextInt();
		System.out.println("Nhap diem 3: ");
		diem3 = sc.nextInt();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println(" diem 1: " + diem1);

		System.out.println(" diem 2 : "+ diem2);
		
		System.out.println(" diem 3: "+ diem3);
		
	}
	
}
