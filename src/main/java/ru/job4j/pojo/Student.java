package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fIO;
    private String group;
    private Date created;

    public String getFIO() {
        return fIO;
    }

    public void setFIO(String fIO) {
        this.fIO = fIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
