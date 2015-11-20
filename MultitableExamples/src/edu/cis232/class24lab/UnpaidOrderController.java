package edu.cis232.class24lab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class UnpaidOrderController {

	@FXML
    private ListView<String> listView;
	
	public void initialize(){
		ObservableList<String> list = FXCollections.observableArrayList(UnpaidOrderModel.getUnpaidCustomerNames());
		listView.setItems(list);
	}
}
