package quiz;
/**
 *
 * @author Dimas
 */
public class User {
    private String name, nik;
    private double write, coding, interview;
    
    public User(){
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
    
    public void setWrite(double write) {
        this.write = write;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public void setInterview(double interview) {
        this.interview = interview;
    }
    
    
    public String getName() {
        return name;
    }

    public String getNik() {
        return nik;
    }

    public double getWrite() {
        return write;
    }

    public double getCoding() {
        return coding;
    }

    public double getInterview() {
        return interview;
    }
}
