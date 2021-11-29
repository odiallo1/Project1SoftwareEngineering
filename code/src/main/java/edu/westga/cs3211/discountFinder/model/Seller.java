/**
 * 
 */
package edu.westga.cs3211.discountFinder.model;

/**
 * @author Oumar Diallo
 *
 */
public class Seller {
	
	private int zipCode;
	private String sellerName;
	
	public Seller(String name, int location) {
		this.sellerName = name;
		this.zipCode = location;
	}

	/**
	 * Gets the zip code.
	 *
	 * @return the zip code
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * Gets the seller name.
	 *
	 * @return the seller name
	 */
	public String getSellerName() {
		return sellerName;
	}

}
