package mk.ukim.finki.photography.model;

import javax.persistence.*;

@Entity
public class Photoshoot {

    @Id
    @GeneratedValue
    private Long Id;

    @ManyToOne
    private User photographer;

    @ManyToOne
    private User user;

    Photoshoot(){

    }

}
