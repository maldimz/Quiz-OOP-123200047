package quiz;

import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Main {
    public static boolean handlerInput(double input){
        return input < 0 || input > 100;
    }
    public static void main(String[] args) {
        AndroidDev android = new AndroidDev();
        WebDev web = new WebDev();
        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        int choiceDiv, choice=1;
        String nik, name;
        double writing, coding, interview;
        
        do{
            System.out.println("RERGISTRATION FORM PT. HORSE INDONESIA");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Choose Form Type : ");
            choiceDiv = inputNum.nextInt();
        }while(choiceDiv!=1 && choiceDiv!=2);
        
        System.out.println("\nREGISTRATION FORM\n");
        
        System.out.print("Input Student Number       : ");
        nik = inputStr.nextLine();
        System.out.print("Input Name                 : ");
        name = inputStr.nextLine();
        
        
        do{
            System.out.print("Input Writing Exam Score   : ");
            writing = inputNum.nextDouble();
        }while(handlerInput(writing));
        
        do{
            System.out.print("Input Coding Test Score    : ");
            coding = inputNum.nextDouble();
        }while(handlerInput(coding));
        
        do{
            System.out.print("Input Interview Test Score : ");
            interview = inputNum.nextDouble();
        }while(handlerInput(interview));

        
        if(choiceDiv==1){
            android.setName(name);
            android.setNik(nik);
            android.editValue(writing, coding, interview);
        }else{
            web.setName(name);
            web.setNik(nik);
            web.editValue(writing, coding, interview);
        }
        
        while(choice!=3){
            System.out.println("\nMenu");
            System.out.println("1. Edit");
            System.out.println("2. Output");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            choice = inputNum.nextInt();
            
            switch(choice){
                case 1:
                    do{
                        System.out.print("Input Writing Exam Score   : ");
                        writing = inputNum.nextDouble();
                    }while(handlerInput(writing));

                    do{
                        System.out.print("Input Coding Test Score    : ");
                        coding = inputNum.nextDouble();
                    }while(handlerInput(coding));

                    do{
                        System.out.print("Input Interview Test Score : ");
                        interview = inputNum.nextDouble();
                    }while(handlerInput(interview));
                    
                    if(choiceDiv==1){
                        android.editValue(writing, coding, interview);
                    }else{
                        web.editValue(writing, coding, interview);
                    }
                    break;
                    
                case 2:
                    if(choiceDiv==1){
                        System.out.println("Final Score " + android.getScore());
                        if(android.isIsPass()){
                            System.out.println("INFORMATION : SUCCESS");
                            System.out.println("Congratulations to " + android.getName() + " has been accepted as Android");
                        }else{
                            System.out.println("INFORMATION : FAILED");
                            System.out.println("Sorry to " + android.getName() + " your are not accepted as Android");
                        }
                    }else{
                        System.out.println("Final Score " + web.getScore());
                        if(web.isIsPass()){
                            System.out.println("INFORMATION : SUCCESS");
                            System.out.println("Congratulations to " + web.getName() + " has been accepted as Web");
                        }else{
                            System.out.println("INFORMATION : FAILED");
                            System.out.println("Sorry to " + web.getName() + " your are not accepted as Web");
                        }
                    }
                    
                    break;
                
                case 3:
                    break;
                
                default:
                    break;
            }
        } 
    }
    
}
