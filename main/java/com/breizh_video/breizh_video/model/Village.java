package com.breizh_video.breizh_video.model;


import javax.persistence.*;

@Entity
 @Table(name = "VILLAGE")
public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String post_code;

    public Village() {
    }

    public Village(String name, String post_code) {
        this.name = name;
        this.post_code = post_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    @Override
    public String toString() {
        return "Village{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", post_code='" + post_code + '\'' +
                '}';
    }
}