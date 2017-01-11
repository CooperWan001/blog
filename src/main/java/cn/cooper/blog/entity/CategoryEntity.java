package cn.cooper.blog.entity;

import java.util.Date;

public class CategoryEntity {
    private String id;

    private String name;

    private Integer leftv;

    private Integer rightv;

    private Boolean visible;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLeftv() {
        return leftv;
    }

    public void setLeftv(Integer leftv) {
        this.leftv = leftv;
    }

    public Integer getRightv() {
        return rightv;
    }

    public void setRightv(Integer rightv) {
        this.rightv = rightv;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}