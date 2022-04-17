package ua.goit.project.model.dao;

public class CompanyDao {
    private Integer id;
    private String name;
    private String description;
    private Integer numberOfEmployees;

    public CompanyDao(Integer id, String name, String description, Integer number_of_employees) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.numberOfEmployees = number_of_employees;
    }

    public CompanyDao() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
