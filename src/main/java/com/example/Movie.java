package com.example;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by caneraydin on 15.03.2016.
 */
@Entity
@Table(name = "movie")
public class Movie {

    @Column (name="actors")
    private String actors;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name="title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public Movie(){}

    public Movie(long id){
        this.id = id;
    }

    public Movie(String title, String actors){
        this.title = title;
        this.actors = actors;
    }

    public String toString(){
        return ("Movie \n id="+id+"\ntitle: "+title+"\nactors= "+actors);
    }

}