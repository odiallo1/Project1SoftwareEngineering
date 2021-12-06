package edu.westga.cs3211.discountFinder.view;


import org.controlsfx.control.textfield.TextFields;

import edu.westga.cs3211.discountFinder.model.Discount;
import edu.westga.cs3211.discountFinder.viewModel.DiscountFinderViewModel;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DiscountFinderCodeBehind {


    @FXML
    private ListView<Discount> discountList;

    
    @FXML
    private TextField filterTextBox;

    @FXML
    private Button addFilterButton;


    @FXML
    private Button clearFilterButton;
    
    @FXML
    private Label labelText;
    
    @FXML
    private ComboBox<String> filterComboBox;
    
    private DiscountFinderViewModel vm;
    
    public DiscountFinderCodeBehind() {
    	this.vm = new DiscountFinderViewModel();
    }
    
    @FXML
    public void initialize() {
    	this.discountList.itemsProperty().set(this.vm.discountListProperty()); 
    	this.discountListListener();
  
    	this.filterTextBoxListener();
    	
    	String[] filterByOptions = {"Item", "Store"};
    	this.filterComboBox.itemsProperty().set(FXCollections.observableArrayList(filterByOptions));
    	this.filterComboBox.getSelectionModel().select(0);
    	
    	String[] items = {"apple", "milk", "broccoli", "oranges", "Ingles", "Wal-Mart", "Aldi", "Food Depot"};
		TextFields.bindAutoCompletion(this.filterTextBox, items);
    }
    
    @FXML
    void handleAddFilter(ActionEvent event) {

    	if (this.filterComboBox.selectionModelProperty().get().getSelectedItem().equals("Item")) {
    		this.discountList.itemsProperty().set(this.vm.filterItem(this.filterTextBox.getText()));
    		
    		
    	} else if (this.filterComboBox.selectionModelProperty().get().getSelectedItem().equals("Store")) {
    		this.discountList.itemsProperty().set(this.vm.filterStore(this.filterTextBox.getText()));
    		
    	} else {
    		this.initialize();
    	}
    	
    	

    }
    
    @FXML
    void handleClearFilter(ActionEvent event) {
    	this.initialize();
    	this.filterTextBox.textProperty().set("");
    }
    
    private void discountListListener() {
    	this.discountList.itemsProperty().addListener((observable, oldValue, newValue) -> {
			if (observable.getValue().isEmpty()) {
				this.labelText.visibleProperty().set(true);
			} else {
			
				this.labelText.visibleProperty().set(false);
			}
		});
    }
    
    private void filterTextBoxListener() {
    	this.filterTextBox.textProperty().addListener((observable, oldValue, newValue) -> {
    		if (observable.getValue().isEmpty()) {
    			this.addFilterButton.disableProperty().set(true);
    		} else {
    			this.addFilterButton.disableProperty().set(false);
    		}
    	});
    }
    

    
    
    

}

