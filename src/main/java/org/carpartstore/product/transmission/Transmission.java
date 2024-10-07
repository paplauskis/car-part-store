package org.carpartstore.product.transmission;

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
@Table(name = "transmission")
public class Transmission extends Part {

    @NotBlank
    private String system;

    @NotBlank
    private int mileage;

    private String code;

    public Transmission(String name, BigDecimal price, String number, String description,
                        int quantity, String type, String sku, String supersededNumbers,
                        String system, int mileage, String code) {
        super(name, price, number, description, quantity, type, sku, supersededNumbers);
        this.system = system;
        this.mileage = mileage;
        this.code = code;
    }
}
