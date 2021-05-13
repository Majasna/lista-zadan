package pl.wsb.students.course.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "list")
public class TDList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "list_type")
    private String listType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", length = 19)
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified", length = 19)
    private Date modified;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "position_fk", referencedColumnName = "id")
//    List<Positions> positions = new ArrayList<>();

//    public List<Positions> getPositions() {
//        return positions;
//    }
//
//    public void setPositions(List<Positions> positions) {
//        this.positions = positions;
//    }

    public TDList(){}

    public TDList(Date modified){this.modified = modified;}

    public TDList(int id, String title, String description, String listType, Date created, Date modified) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.listType = listType;
        this.created = created;
        this.modified = modified;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
