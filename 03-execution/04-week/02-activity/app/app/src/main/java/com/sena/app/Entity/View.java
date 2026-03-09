package com.sena.app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="view")
public class View {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 200)
    private String route;

    @Column(nullable = false)
    private Boolean visible;

    public View(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRoute(){
        return route;
    }

    public void setRoute(String route){
        this.route = route;
    }

    public Boolean getVisible(){
        return visible;
    }

    public void setVisible(Boolean visible){
        this.visible = visible;
    }
}
