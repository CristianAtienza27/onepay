package es.alten.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/*@Entity
@XmlRootElement
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor*/

@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Invoice implements Serializable {

    private static final long serialVersionUID = 7389705441694025319L;

    private String servicio;
    private String factura;
    private double importe;
    private Date fecha;

    private Boolean pagado;
}
