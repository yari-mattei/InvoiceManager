package ch.yarox.invoiceManager.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.yarox.invoiceManager.model.Customer;
import ch.yarox.invoiceManager.model.Invoice;

public class InvoiceTest {
	Invoice i1 = new Invoice(new Customer("name", "surname"));
	@Test
	public void test() {
		assertNotNull(i1);
	}

}
