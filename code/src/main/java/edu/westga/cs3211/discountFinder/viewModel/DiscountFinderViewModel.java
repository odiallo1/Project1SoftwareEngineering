package edu.westga.cs3211.discountFinder.viewModel;

import java.util.ArrayList;
import java.util.List;

import edu.westga.cs3211.discountFinder.model.Discount;
import edu.westga.cs3211.discountFinder.model.Item;

import edu.westga.cs3211.discountFinder.model.Seller;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * The Class DiscountFinderViewModel.
 * 
 * @author oumar diallo
 */
public class DiscountFinderViewModel {
	
	/** The discount list property. */
	private  ListProperty<Discount> discountListProperty;
	

	/**
	 * Instantiates a new discount finder view model.
	 */
	public DiscountFinderViewModel() {
		this.discountListProperty = new SimpleListProperty<Discount>(FXCollections.observableArrayList());
		this.populateDiscountFinderList();
	}
	
	/**
	 * Populate discount finder list.
	 */
	public void populateDiscountFinderList() {
		Item apple = new Item("apple", 20.35);

		Seller walMart = new Seller("Wal-Mart", 30215);
		Discount first = new Discount(apple, 15.67, walMart);
		
		Item milk = new Item("milk", 20.35);
		Seller target = new Seller("Target", 30119);
		Discount second = new Discount(milk, 15.67, target);
		
		Item cheese1 = new Item("cheese1", 20.35);
		Seller foodDepot = new Seller("Food-Depot", 30317);
		Discount third = new Discount(cheese1, 15.67, foodDepot);
		
		Item cheese = new Item("cheese", 20.35);
		Seller kroger = new Seller("Kroger", 30216);
		Discount fourth = new Discount(cheese, 15.67, kroger);
		
		Item oranges = new Item("oranges", 20.35);
		Seller aldi = new Seller("Aldi", 30218);
		Discount fifth = new Discount(oranges, 15.67, aldi);
		
		Item broccoli = new Item("broccoli", 20.35);
		Seller ingles = new Seller("Ingles", 30215);
		Discount sixth = new Discount(broccoli, 15.67, ingles);

		this.discountListProperty.add(first);
		this.discountListProperty.add(second);
		this.discountListProperty.add(third);
		this.discountListProperty.add(fourth);
		this.discountListProperty.add(fifth);
		this.discountListProperty.add(sixth);
	
	}
	
	/**
	 * Discount list property.
	 *
	 * @return the list property
	 */
	public ListProperty<Discount> discountListProperty() {
		return this.discountListProperty;
	}
	
	public ObservableList<Discount> filter(String item) {
		List<Discount> filtered = new ArrayList<Discount>();
		
		for (Discount currentItem: this.discountListProperty) {
			if (currentItem.getItem().getItemName().equalsIgnoreCase(item)) {
				filtered.add(currentItem);
			}
		}
		
		return FXCollections.observableArrayList(filtered);
		
	}

}
