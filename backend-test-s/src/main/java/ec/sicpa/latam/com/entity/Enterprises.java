package ec.sicpa.latam.com.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "enterprises")
public class Enterprises extends  BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(nullable = true)
    private String address;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String phone;
}
