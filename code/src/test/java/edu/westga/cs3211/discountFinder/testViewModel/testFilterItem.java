package edu.westga.cs3211.discountFinder.testViewModel;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.discountFinder.model.Discount;
import edu.westga.cs3211.discountFinder.model.Item;
import edu.westga.cs3211.discountFinder.model.Seller;
import edu.westga.cs3211.discountFinder.viewModel.DiscountFinderViewModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class testFilterItem {

	@Test
	void testNoDiscountsForItem() {
		Item oranges = new Item("oranges", 20.35);
		Seller aldi = new Seller("Aldi", 30218);
		Discount fifth = new Discount(oranges, 15.67, aldi);
		ArrayList<Discount> orangeDiscount = new ArrayList<Discount>();
		
		ObservableList<Discount> orange = FXCollections.observableArrayList(orangeDiscount);
		
		DiscountFinderViewModel viewM = new DiscountFinderViewModel();
		ObservableList<Discount> oneDiscount = viewM.filterItem("grapes");
		
		assertEquals(true, oneDiscount.isEmpty());
	}
	
	@Test
	void testOneDiscountsForItem() {
		Item oranges = new Item("oranges", 20.35);
		Seller aldi = new Seller("Aldi", 30218);
		Discount fifth = new Discount(oranges, 15.67, aldi);
		ArrayList<Discount> orangeDiscount = new ArrayList<Discount>();
		
		ObservableList<Discount> orange = FXCollections.observableArrayList(orangeDiscount);
		
		DiscountFinderViewModel viewM = new DiscountFinderViewModel();
		ObservableList<Discount> oneDiscount = viewM.filterItem("oranges");
		
		assertEquals("Aldi", oneDiscount.get(0).getDiscountSeller().getSellerName());
	}

}
