package quiz;

/**
 *
 * @author Dimas
 */
public class AndroidDev extends User implements Calculation{
    private boolean isPass;
    private double score;
    

    AndroidDev() {
        
    }
    
    
    public boolean isIsPass() {
        return isPass;
    }
    
    public double getScore() {
        return score;
    }
    
    @Override
    public double calculate() {
        score = getWrite()*0.2 + getCoding()*0.5 + getInterview()*0.3;
        isPass = score>=85;
        return score;
    }

    @Override
    public void editValue(double write, double coding, double interview) {
        setCoding(coding);
        setWrite(write);
        setInterview(interview);
        
        calculate();
    }
}
