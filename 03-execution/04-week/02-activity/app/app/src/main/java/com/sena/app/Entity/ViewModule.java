package com.sena.app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="view_module")
public class ViewModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long viewId;

    private Long moduleId;

    @Column(nullable = false)
    private Boolean enabled;

    public ViewModule(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getViewId(){
        return viewId;
    }

    public void setViewId(Long viewId){
        this.viewId = viewId;
    }

    public Long getModuleId(){
        return moduleId;
    }

    public void setModuleId(Long moduleId){
        this.moduleId = moduleId;
    }

    public Boolean getEnabled(){
        return enabled;
    }

    public void setEnabled(Boolean enabled){
        this.enabled = enabled;
    }
}