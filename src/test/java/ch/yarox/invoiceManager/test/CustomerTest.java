package ch.yarox.invoiceManager.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ch.yarox.invoiceManager.model.Customer;
import ch.yarox.invoiceManager.model.Invoice;

public class CustomerTest {
	Customer c1 = new Customer("name", "surname");
	
	@Test
	public void test() {	
		assertTrue("name".equals(c1.getName()));
		assertTrue("surname".equals(c1.getSurname()));
	}
	
	@Test
	public void testInvoiceAdd(){
		c1.addInvoice(new Invoice(c1));
		assertTrue(1 == c1.getNumberOfInvoices());
	}

}
