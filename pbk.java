package baitap;

import java.util.Scanner;

import java.util.*;

public class pbk {
	Scanner sc = new Scanner(System.in);
	private String mapbk;
	private String tenpbk;
	public pbk(String mapbk, String tenpbk) {
		this.mapbk = mapbk;
		this.tenpbk = tenpbk;
	}
	public String getMapbk() {
		return mapbk;
	}
	public void setMapbk(String mapbk) {
		this.mapbk = mapbk;
	}
	public String getTenpbk() {
		return tenpbk;
	}
	public void setTenpbk(String tenpbk) {
		this.tenpbk = tenpbk;
	}
	public void nhap()
	{
		System.out.println("Nhap ma pbk: ");
		mapbk = sc.next();
		System.out.println("Nhap ten pbk : ");
		tenpbk = sc.next();
	}
	public void xuat()
	{
		System.out.println(" ma pbk: " + mapbk);

		System.out.println(" ten pbk: "+ tenpbk);

		
	}
}
