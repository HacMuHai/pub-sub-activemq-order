package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "order_product")
public class OrderProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;
    private int quantity;
    private String email;
    private long orderId;
}
