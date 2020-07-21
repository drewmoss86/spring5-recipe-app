package guru.springframework.models;

import javax.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY = AUTO_INCREMENT
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob //large objects
    private String recipeString;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeString() {
        return recipeString;
    }

    public void setRecipeString(String recipeString) {
        this.recipeString = recipeString;
    }
}
