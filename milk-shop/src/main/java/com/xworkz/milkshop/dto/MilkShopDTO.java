package com.xworkz.milkshop.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "milk")
public class MilkShopDTO {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id;
	private String mName;
	private String mOwnerName;
	private String Brand;
	private String price;
	private String ambassador;

	public MilkShopDTO() {
		System.out.println("create default constructor ");
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmOwnerName() {
		return mOwnerName;
	}

	public void setmOwnerName(String mOwnerName) {
		this.mOwnerName = mOwnerName;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmbassador() {
		return ambassador;
	}

	public void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}

	@Override
	public String toString() {
		return "MilkShopDTO [mName=" + mName + ", mOwnerName=" + mOwnerName + ", Brand=" + Brand + ", price=" + price
				+ ", ambassador=" + ambassador + "]";
	}

}
