/*
Description:
A system designed to manage plants in a botanical garden. Users can add plants, specify their species, common name, and area within the garden. Additionally, it allows tracking the age of the plant, the date it was added to the garden, and transferring plants between different areas.

Integrated Concepts:

    OOP
    Lists/ArrayList
    Search Functions
    Flow Control
    Date Manipulation
*/
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plant {
    private String commonName;
    private String species;
    private String area;
    private Date dateAdded;
    private int age;

    public Plant(String commonName, String species, String area, int age) {
        this.commonName = commonName;
        this.species = species;
        this.area = area;
        this.dateAdded = new Date();
        this.age = age;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getSpecies() {
        return species;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public int getAge() {
        return age;
    }
}

public class BotanicalGarden {
    private List<Plant> plants;

    public BotanicalGarden() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public Plant searchByCommonName(String commonName) {
        for(Plant plant : plants) {
            if(plant.getCommonName().equalsIgnoreCase(commonName)) {
                return plant;
            }
        }
        return null;
    }

    public List<Plant> searchBySpecies(String species) {
        List<Plant> result = new ArrayList<>();
        for(Plant plant : plants) {
            if(plant.getSpecies().equalsIgnoreCase(species)) {
                result.add(plant);
            }
        }
        return result;
    }

    public List<Plant> plantsInArea(String area) {
        List<Plant> result = new ArrayList<>();
        for(Plant plant : plants) {
            if(plant.getArea().equalsIgnoreCase(area)) {
                result.add(plant);
            }
        }
        return result;
    }

    public void transferPlant(String commonName, String newArea) {
        Plant plant = searchByCommonName(commonName);
        if(plant != null) {
            plant.setArea(newArea);
        }
    }

    public static void main(String[] args) {
        // Testing the system can be done here
    }
}
