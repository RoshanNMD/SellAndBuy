package Client;

import javax.xml.bind.annotation.*;

@XmlRootElement

public class shipping {
	
	private int Id;
	private String name;
	private String address;
	private int tel;
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Shipping [Id=" + Id + ", name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	


}

