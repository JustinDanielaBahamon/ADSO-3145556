package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="view_action")
public class ViewAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long viewId;

    private Long actionId;

    @Column(nullable = false)
    private Boolean permitted;

    public ViewAction(){}

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

    public Long getActionId(){
        return actionId;
    }

    public void setActionId(Long actionId){
        this.actionId = actionId;
    }

    public Boolean getPermitted(){
        return permitted;
    }

    public void setPermitted(Boolean permitted){
        this.permitted = permitted;
    }
}