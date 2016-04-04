package ch.yarox.invoiceManager.model;

import java.util.List;

public class Company {
	private String name;
	private Address address;
	private Contacts contacts;
	private String partitaIVA;
	private String logo;
	
	private List<Invoice> invoices;
	private List<Quote> quotes;
}
