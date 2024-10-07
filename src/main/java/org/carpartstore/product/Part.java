package org.carpartstore.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "part")
@Inheritance(strategy = InheritanceType.JOINED)
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private BigDecimal price;

    private String number;

    private String description;

    private int quantity;

    @Column(name = "superseded_numbers")
    private String supersededNumbers;

    private String type;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "old_price")
    private String oldPrice;

    @Column(name = "price_change_date")
    private LocalDateTime priceChangeDate;

    private String sku;
}
