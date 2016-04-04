package ch.yarox.invoiceManager.model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	private Customer customer;
	private Employee employee;
	private List<Item> items;
	private String object;
	private String description;
	private String date;
	private long id;
	private static long numberOfInvoice;
	private Company company;
	
	public Invoice(Customer customer){
		this.customer = customer;
		this.items = new ArrayList<Item>();
	}
}
