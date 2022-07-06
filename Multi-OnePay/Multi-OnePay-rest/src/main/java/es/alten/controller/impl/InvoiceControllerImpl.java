package es.alten.controller.impl;

import es.alten.controller.InvoiceController;
import es.alten.domain.Invoice;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/invoices")
@Api(value = "invoices", produces = MediaType.APPLICATION_JSON_VALUE)
public class InvoiceControllerImpl implements InvoiceController {
    @Override
    @GetMapping
    public ResponseEntity<List<Invoice>> listInvoices() {
        List<Invoice> facturas = new ArrayList<Invoice>();
        facturas.add(new Invoice("Fontanería","RE123456789", 405.5,new Date(122, 5, 3, 10 , 5, 6),true ));
        facturas.add(new Invoice("Electricidad","RE111144444", 105.5,new Date(122, 7, 3, 10 , 5, 6),false ));
        ResponseEntity response = new ResponseEntity<>(facturas, HttpStatus.OK);
        return response;
    }

}
