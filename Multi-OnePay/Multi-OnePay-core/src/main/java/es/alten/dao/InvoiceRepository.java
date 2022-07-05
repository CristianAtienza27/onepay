package es.alten.dao;

import es.alten.domain.Invoice;
import es.alten.domain.QUser;
import es.alten.domain.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

public interface InvoiceRepository extends ElvisBaseRepository<Invoice, Long, QInvoice>,
        JpaSpecificationExecutor<Invoice>,
        QuerydslPredicateExecutor<Invoice>,
        QuerydslBinderCustomizer<QInvoice> {
}
