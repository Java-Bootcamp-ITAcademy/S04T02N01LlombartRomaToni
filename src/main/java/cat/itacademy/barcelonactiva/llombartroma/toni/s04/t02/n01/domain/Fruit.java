/* Domain layer */
package cat.itacademy.barcelonactiva.llombartroma.toni.s04.t02.n01.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode
@Entity
@Table(name="fruits")
public class Fruit {
    @Id
    @GeneratedValue
    @Getter @Setter
    private int id;
    @Column
    @Getter @Setter
    private String name;
    @Column
    @Getter @Setter
    private int quantity;

    public Fruit(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Fruit() {

    }

}
