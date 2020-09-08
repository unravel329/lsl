package org.cskj.goodsdome.bean;

public class Goods {

	private  int id;
	private String name;
	private String price;
	private String createDate;
	private String keepDate;
	private String weight;
	private String content;
	public Goods(int id, String name, String price, String createDate, String keepDate, String weight, String content) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createDate = createDate;
		this.keepDate = keepDate;
		this.weight = weight;
		this.content = content;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getKeepDate() {
		return keepDate;
	}
	public void setKeepDate(String keepDate) {
		this.keepDate = keepDate;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", createDate=" + createDate + ", keepDate="
				+ keepDate + ", weight=" + weight + ", content=" + content + "]";
	}
	
	
}
