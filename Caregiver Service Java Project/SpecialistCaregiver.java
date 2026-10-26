import java.util.List;
/**
 * Write a description of class SpecialistCaregiver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpecialistCaregiver extends Caregiver
{
    private String specialisation;

    public SpecialistCaregiver(String name, String gender, String ethnicity,
    List<String> languages, List<String> servicesProvided, double hourlyRate,
    String specialisation) {
    super(name, gender, ethnicity, languages, servicesProvided, hourlyRate);
    this.specialisation = specialisation;
    }
    
    public String getSpecialisation() {
        return specialisation;
    }
    
    @Override
    public String getDescription() {
        return "Specialist in " + specialisation;
    }
    
}