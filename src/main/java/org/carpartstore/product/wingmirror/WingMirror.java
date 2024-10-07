package org.carpartstore.product.wingmirror;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.carpartstore.product.Part;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "wing_mirror")
public class WingMirror extends Part {

    @NotBlank
    private String features;

    public WingMirror(String name, BigDecimal price, String number, String description,
                      int quantity, String type, String sku, String supersededNumbers,
                      String features) {
        super(name, price, number, description, quantity, type, sku, supersededNumbers);
        this.features = features;
    }
}
