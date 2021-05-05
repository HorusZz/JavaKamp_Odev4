
public class Discounts {

	String discountName;
	float discount;
	String discountCode;
	float amountOfDiscount;

	public Discounts(String discountName, String discountCode, float amountOfDiscount) {
		this.discountName = discountName;
		this.discountCode = discountCode;
		this.amountOfDiscount = amountOfDiscount;

	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	
}
