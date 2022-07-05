package es.alten.controller;

import es.alten.domain.Invoice;
import es.alten.web.BaseController;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface InvoiceController extends BaseController {
    ResponseEntity<List<Invoice>> listInvoices();
}
