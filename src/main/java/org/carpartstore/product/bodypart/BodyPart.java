package org.carpartstore.product.bodypart;

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
@Table(name = "body_part")
public class BodyPart extends Part {

    @NotBlank
    private String colour;

    public BodyPart(String name, BigDecimal price, String number, String description, int quantity,
                    String type, String sku, String supersededNumbers, String colour) {
        super(name, price, number, description, quantity, type, sku, supersededNumbers);
        this.colour = colour;
    }
}
