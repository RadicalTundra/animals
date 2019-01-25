
package us.mattgreen;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalInput {
    
    public AnimalInput(ArrayList<Talkable> zoo){
        Prompt(zoo);

    }
    
    public ArrayList Prompt(ArrayList<Talkable> zoo){
        System.out.println("Do you want to be a cat, a dog, or a person?");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String test = userInput.toLowerCase();
        if( "cat".equals(test) || "dog".equals(test) || "person".equals(test)){
           switch (test){
               case "cat": addCat(zoo);
                            break;
               case "dog": addDog(zoo);
                           break;
               case "person": addPerson(zoo);
                              break;
           }
        }
        else{
            System.out.println("Please enter a proper type ya goof!");
           Prompt(zoo);
           
        }
        return zoo;
    }
    
    public ArrayList addCat(ArrayList<Talkable> zoo){
        System.out.println("ayyyy, you did it!\n");
        
        System.out.println("How many mice have you killed?");
        Scanner sc = new Scanner(System.in);
        int miceKilled = 0;
        try{
            miceKilled = sc.nextInt();
        }
        catch(NumberFormatException e){
            System.out.println("You must enter a number ya goof!");
            addCat(zoo);
        }
        
        
        return zoo;
    }
    public ArrayList addDog(ArrayList<Talkable> zoo){
        System.out.println("ayyyy, you did it!");
        return zoo;
    }
    public ArrayList addPerson(ArrayList<Talkable> zoo){
        //only student's are talkable btw, so add student.
        System.out.println("ayyyy, you did it!");
        return zoo;
    }
    
    
}
