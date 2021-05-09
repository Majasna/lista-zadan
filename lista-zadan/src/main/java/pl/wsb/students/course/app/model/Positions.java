package pl.wsb.students.course.app.model;


import javax.persistence.*;

@Entity
@Table(name = "positions")
public class Positions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    private String title;

    public Positions() {
    }

    public Positions(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
