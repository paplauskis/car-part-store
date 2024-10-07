package org.carpartstore.product.wheel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
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
@Table(name = "wheel")
public class Wheel extends Part {

    private String style;

    @NotBlank
    @DecimalMin(value = "0.0", message = "Width must be greater than zero")
    private float width;

    @NotBlank
    @Min(value = 1, message = "Diameter must be greater than zero")
    private int diameter;

    @NotBlank
    private int offset;

    @NotBlank
    private String position;

    public Wheel(String name, BigDecimal price, String number, String description,
                 int quantity, String type, String sku, String supersededNumbers,
                 String style, float width, int diameter, int offset,
                 String position) {
        super(name, price, number, description, quantity, type, sku, supersededNumbers);
        this.style = style;
        this.width = width;
        this.diameter = diameter;
        this.offset = offset;
        this.position = position;
    }
}
