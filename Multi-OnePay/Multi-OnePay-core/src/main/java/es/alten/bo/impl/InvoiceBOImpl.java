package es.alten.bo.impl;

import es.alten.dao.InvoiceRepository;
import es.alten.domain.Invoice;
import es.alten.dto.InvoiceFilterDTO;

public class InvoiceBOImpl extends ElvisGenericCRUDServiceImpl<Invoice, Long, QInvoice, InvoiceFilterDTO, InvoiceRepository> {
}
