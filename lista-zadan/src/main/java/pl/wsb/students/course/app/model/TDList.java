package pl.wsb.students.course.app.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "list")
public class TDList {

    private Integer id;
    private String title;
    private String description;
    private String listType;
    private Date created;
    private Date modified;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "list_type")
    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", length = 19)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified", nullable = false, length = 19)
    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
