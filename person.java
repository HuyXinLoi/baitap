package baitap;

import java.util.*;

public class person {
	Scanner sc = new Scanner(System.in);
	private String ten;
	public person(String ten, String ns) {
		this.ten = ten;
		this.ns = ns;
	}
	public person()
	{
	}
	private String ns;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}
	
	
	public void nhap̣̣̣̣̣̣̣̣̣̣̣̣̣() {
		System.out.println("Nhap ten: ");
		ten = sc.next();
		System.out.println("Nhap ngay sinh: ");
		ns = sc.next();
	}
	public void xuat()
	{
		System.out.println("Ten: " + ten);
		System.out.println("Ngay sinh: " + ns);
	}
	
}
