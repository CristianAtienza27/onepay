/*package es.alten.dto;

import es.alten.domain.Invoice;
import es.alten.domain.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;

public class InvoiceFilterDTO extends BaseFilterDTO<Invoice>{

    /** serialVersionUID for object serialization. */
 /*   private static final long serialVersionUID = -7726776743129637984L;

    /** User email. */
   /* private Boolean pagado;
    @Override
    public Specification<Invoice> obtainFilterSpecification() {
        return (root, query, cb) -> {
            // Not deleted users
            Predicate predicate = cb.and();
            // User email filter
            if (this.pagado != null) {
                predicate =
                        cb.and(predicate, cb.equal(root.get("pagado"), this.pagado));
            }

            return predicate;
        };
    }
}
*/