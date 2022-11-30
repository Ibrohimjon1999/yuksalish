package com.yuksalish.com.entity;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.sql.Timestamp;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "house")
public class House implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer number_rooms;
    @Column
    private Float area;
    @Column
    private String locality;
    @Column
    private Double rent;
    @Column
    private String picture;
    @Column
    private Timestamp created_at;
    @Column
    private Timestamp updated_at;
    @Column
    private Boolean status;
    @Column
    private Integer owner_id;
}
