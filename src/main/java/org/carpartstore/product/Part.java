package org.carpartstore.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "part")
@Inheritance(strategy = InheritanceType.JOINED)
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    @DecimalMin(value = "0.0", message = "Price must be greater than zero")
    private BigDecimal price;

    @NotBlank
    private String number;

    @NotBlank
    private String description;

    @NotBlank
    private int quantity;

    @Column(name = "superseded_numbers")
    private String supersededNumbers;

    @NotBlank
    private String type;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "old_price")
    private String oldPrice = null;

    @Column(name = "price_change_date")
    private LocalDateTime priceChangeDate = null;

    @NotBlank
    private String sku;

    public Part(String name, BigDecimal price, String number, String description,
                int quantity, String type, String sku, String supersededNumbers) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.type = type;
        this.sku = sku;
        this.supersededNumbers = supersededNumbers;
    }
}
