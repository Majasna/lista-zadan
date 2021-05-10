package pl.wsb.students.course.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import pl.wsb.students.course.app.model.TDList;

import java.util.Date;

public class TDListDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("listType")
    private  String listType;

    @JsonProperty("created")
    private Date created;

    @JsonProperty("created")
    private Date modified;

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
