package movie.jaz.demo.model;
import javax.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    private boolean isavailable;

    public Movie(Long id, String name, Category category, boolean isavailable) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.isavailable = isavailable;
    }

    public Movie(Long id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Movie(String name, Category category) {
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

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }
}
