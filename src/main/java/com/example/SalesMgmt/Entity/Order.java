package com.example.SalesMgmt.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "orderdetails")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn( name = "spare_parts_id_fk")
    private Spare_parts spare_parts;

    @Column(name = "is_active")
    private int is_active;

    @Column(name = "is_deleted")
    private int is_deleted;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime created_at;

    @UpdateTimestamp
    @Column(name = "modified_at")
    private LocalDateTime modified_at;

    @OneToOne
    @JoinColumn(name="user_id_fk")
    private User user;


}