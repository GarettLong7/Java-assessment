import java.util.List;
/**
 * Write a description of class Caregiver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Caregiver implements Description
{
    private String name;
    private String gender;
    private String ethnicity;
    private List<String> languages;
    private List<String> servicesProvided;
    private double hourlyRate;

public Caregiver(String name, String gender, String ethnicity, List<String> languages,
List<String> servicesProvided, double hourlyRate) {
    this.name = name;
    this.gender = gender;
    this.ethnicity = ethnicity;
    this.languages = languages;
    this.servicesProvided = servicesProvided; 
    this.hourlyRate = hourlyRate;
}

public String getName() {
    return name;
}

public String getGender() {
    return gender;
}

public String getEthnicity() {
    return ethnicity;
}

public List<String> getLanguages() {
    return languages;
}

public List<String> getServicesProvided() {
    return servicesProvided;
}

public double getHourlyRate() {
    return hourlyRate;
}

@Override
public String getDescription() {
    return "General caregiver";
}

}