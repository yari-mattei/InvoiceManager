package ch.yarox.invoiceManager.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
	private String name;
	private String surname;
	private Address address;
	private Contacts contacts;
	private List<Invoice> invoices;
	private List<Quote> quotes;
	
	public Person(String name, String surname){
		this.name = name;
		this.surname = surname;
		this.invoices = new ArrayList<Invoice>();
		this.quotes = new ArrayList<Quote>();
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getSurname(){
		return this.surname;
	}

	public void addInvoice(Invoice invoice) {
		this.invoices.add(invoice);
	}

	public int getNumberOfInvoices() {
		return this.invoices.size();
	}
}
