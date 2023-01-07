/**
 * Question3
 */
public class Question3 {

	public static void main(String[] args) {
			
	}
}
class Invoice{
	private String PartNumber;
	private String PartDescription;
	private int PurchasedItems;
	private float Price;
	
	public String getPartDescription() {
		return PartDescription;
	}
	public String getPartNumber() {
		return PartNumber;
	}
	public float getPrice() {
		return Price;
	}
	public int getPurchasedItems() {
		return PurchasedItems;
	}

	public void setPartDescription(String partDescription) {
		PartDescription = partDescription;
	}
	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}
	public void setPrice(float price) {
		if(price>0)
		Price = price;
		else
		Price=0;
	}
	public void setPurchasedItems(int purchasedItems) {
		if(purchasedItems>0)
		PurchasedItems = purchasedItems;
		else
		PurchasedItems=0;
	}
	public float getInvoiceAmount(){
		float invoiceAmount=Price*PurchasedItems;
		if(invoiceAmount>0)
		return invoiceAmount;
		
		return 0;

	}

		
}