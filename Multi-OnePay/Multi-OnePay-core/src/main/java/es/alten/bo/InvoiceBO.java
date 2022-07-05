package es.alten.bo;

import es.alten.domain.Invoice;
import es.alten.dto.InvoiceFilterDTO;

public interface InvoiceBO extends GenericCRUDService<Invoice, Long, QInvoice, InvoiceFilterDTO>{
    Invoice findByPagado(Boolean pagado);
}
