package jdbc.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class EProduct {

	@Id
	@GeneratedValue
	@Column(name="productid")
	private int productid;
	
	@Column(name="Productname")
	private String Productname;
	
	@Column(name="quantity")
	private Double quantity;

	
	
	public int getproductId() {
		return productid;
	}

	public void setId(int Productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return Productname;
	}

	public void setName(String name) {
		this.Productname = name;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setPrice(Double quantity) {
		this.quantity = quantity;
	}

	
}