package ec.sicpa.latam.com.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Departments extends  BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_enterprise", nullable = false)
    private Enterprises enterprises;

}
