//package exercise4;
/**
* This class is an immutable class. 
*
*/
public final class Product 
{
	private final String productName;
	private final String productDescription;
	private final double productPrice;
	private final int maxQuantity;
	
	//constructor
	public Product(String productName, String productDescription, double productPrice, int maxQuantity)
	{
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.maxQuantity = maxQuantity;
	}
	
	//all the getters
	public String getProductName()
	{
		return productName;
	}
	
	public String getProductDescription()
	{
		return productDescription;
	}
	
	public double getProductPrice()
	{
		return productPrice;
	}
	
	public int getMaxQuantity()
	{
		return maxQuantity;
	}
	
	/**
	* This method returns all the information about the product
	*
	*/
	@Override
	public String toString()
	{
		return "Name: " + productName + ", Description: " + productDescription + ", Price: " + productPrice + ", Maximum Quantity: " + maxQuantity;
	}

}
