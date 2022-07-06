/*package es.alten.bo.impl;

import es.alten.bo.InvoiceBO;
import es.alten.dao.InvoiceRepository;
import es.alten.domain.Invoice;
import es.alten.domain.QInvoice;
import es.alten.dto.InvoiceFilterDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InvoiceBOImpl
        extends ElvisGenericCRUDServiceImpl<Invoice, Long, QInvoice, InvoiceFilterDTO, InvoiceRepository>
        implements InvoiceBO {

    private static final long serialVersionUID = -4166529873832767435L;
    private static final Logger LOG = LoggerFactory.getLogger(InvoiceBOImpl.class);

    @Override
    public Invoice findByPagado(Boolean pagado) {
        LOG.debug("findByPagado");
        return this.repository.findByPagado(pagado);
    }
}*/
