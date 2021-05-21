package pl.pjatk.movieSpring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Enum<Category> category;

    public Movie(Long id, String name, Enum<Category> category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Movie(String name, Enum<Category> category) {
        this.name = name;
        this.category = category;
    }

    public Movie() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaame() {
        return name;
    }

    public void setNaame(String naame) {
        this.name = name;
    }

    public Enum<Category> getCategory() {
        return category;
    }

    public void setCategory(Enum<Category> category) {
        this.category = category;
    }
}
