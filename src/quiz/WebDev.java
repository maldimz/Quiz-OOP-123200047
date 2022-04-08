/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Dimas
 */
public class WebDev extends User implements Calculation{
    private boolean isPass;
    private double score;
    
    WebDev(){
        
    }
    
    public boolean isIsPass() {
        return isPass;
    }
    
    public double getScore() {
        return score;
    }
    
    @Override
    public double calculate() {
        score = getWrite()*0.4 + getCoding()*0.35 + getInterview()*0.25;
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
