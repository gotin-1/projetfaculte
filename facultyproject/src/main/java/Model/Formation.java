package Model;

import java.util.Date;

public class Formation {
    private int id;                 // Identifiant unique de la formation
    private String title;           // Titre de la formation
    private String description;     // Brève description de la formation
    private String trainer;         // Nom du formateur ou responsable de la formation
    private int durationInHours;    // Durée en heures
    private Date startDate;         // Date de début de la formation
    private Date endDate;           // Date de fin de la formation
    private Category category;      // Catégorie de la formation (informatique, mathématiques, etc.)
    private String location;        // Lieu ou mode (en ligne, présentiel)

    // Constructeurs
    public Formation() {}

    public Formation(int id, String title, String description, String trainer, int durationInHours, Date startDate, Date endDate, Category category, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.trainer = trainer;
        this.durationInHours = durationInHours;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.location = location;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

