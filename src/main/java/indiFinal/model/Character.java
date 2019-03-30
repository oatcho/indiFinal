package indiFinal.model;

public class Character {
    private String name;
    private String birthYear;
    private String gender;
    private String homeworld;

    public Character(String name, String birthYear, String gender, String homeworld) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.homeworld = homeworld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }
}
