/*package es.alten.dto;

import es.alten.domain.Invoice;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@ApiModel(value = "InvoiceDTO", description = "Data transfer object: invoice")
@EqualsAndHashCode(callSuper = true)
@Data
public class InvoiceDTO extends ElvisBaseDTO<Invoice>{

    private static final long serialVersionUID = 883832912345648321L;
    private static final Logger LOG = LoggerFactory.getLogger(InvoiceDTO.class);

    private String servicio;
    private String factura;
    private double importe;
    private Date fecha;
    private boolean pagado;
}*/
