package pl.wsb.students.course.app.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    @OneToMany(targetEntity = TDList.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "tdlist_foreign_key", referencedColumnName = "id")
    private List<TDList> lists;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
