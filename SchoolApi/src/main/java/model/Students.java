package model;

import lombok.*;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@NamedQuery(name = "findAll", query = "SELECT i FROM Students i")
public class Students {
    public Students(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length = 200)
    private String name;

    @ManyToOne
    @JoinColumn(name = "groups_id")
    private Groups group;
}
