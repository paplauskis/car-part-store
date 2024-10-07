package org.carpartstore.product.engine;

import jakarta.persistence.Column;
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
@Table(name = "engine")
public class Engine extends Part {

    @NotBlank
    @DecimalMin(value = "0.0", message = "Size must be greater than zero")
    private float size;

    @NotBlank
    @Min(value = 1, message = "Power must be greater than zero")
    private int power;

    @NotBlank
    @Column(name = "engine_code")
    private String engineCode;

    @NotBlank
    private int mileage;

    @NotBlank
    @Column(name = "fuel_type")
    private String fuelType;

    public Engine(String name, BigDecimal price, String number, String description,
                  int quantity, String type, String sku, String supersededNumbers,
                  float size, int power, String engineCode, int mileage, String fuelType) {
        super(name, price, number, description, quantity, type, sku, supersededNumbers);
        this.size = size;
        this.power = power;
        this.engineCode = engineCode;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }
}
