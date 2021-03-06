package com.taogen.demo.springbootcrud.core.web.dto;

/**
 * @author Taogen
 */
public class IdName {
    private Integer id;
    private String name;

    public IdName() {
    }

    public IdName(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
