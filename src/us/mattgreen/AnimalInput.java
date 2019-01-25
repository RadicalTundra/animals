
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
            System.out.println("\n---------------------------------\n");
            System.out.println("Please enter a proper type ya goof!");
            System.out.println("\n---------------------------------\n");
           Prompt(zoo);
           
        }
        return zoo;
    }
    
    public ArrayList addCat(ArrayList<Talkable> zoo){
        System.out.println("\nHow many mice have you killed?");
        Scanner sc = new Scanner(System.in);
        int miceKilled = 0;
        String catName = "";
        try{
            miceKilled = sc.nextInt();
            System.out.println("\nSo what's your name little guy?");
            Scanner sc2 = new Scanner(System.in);
            catName = sc2.nextLine();
            zoo.add(new Cat(miceKilled, catName));
        }
        catch(Exception e){
            System.out.println("\n---------------------------------\n");
            System.out.println("You must enter a number ya goof!");
            System.out.println("\n---------------------------------");
            addCat(zoo);
        }
        
        
        return zoo;
    }
    public ArrayList addDog(ArrayList<Talkable> zoo){
        System.out.println("\nSo, are you a friendly little friend?");
        Scanner sc = new Scanner(System.in);
        boolean goodBoy = true;
        String dogName = "";
        try{
            goodBoy = sc.nextBoolean();
            System.out.println("\nSo what's your name little buddy?");
            Scanner sc2 = new Scanner(System.in);
            dogName = sc2.nextLine();
            zoo.add(new Dog(goodBoy, dogName));
        }
        catch(Exception e){
            System.out.println("\n---------------------------------\n");
            System.out.println("You must enter a true or a false statement!");
            System.out.println("\n---------------------------------");
            addCat(zoo);
        }
        
        
        return zoo;
    }
    public ArrayList addPerson(ArrayList<Talkable> zoo){
        System.out.println("\nWhat's your age?");
        Scanner sc = new Scanner(System.in);
        int personAge = 0;
        String personName = "";
        try{
            personAge = sc.nextInt();
            System.out.println("\nSo what's your name?");
            Scanner sc2 = new Scanner(System.in);
            personName = sc2.nextLine();
            zoo.add(new Student(personAge, personName));
        }
        catch(Exception e){
            System.out.println("\n---------------------------------\n");
            System.out.println("You must enter a number ya goof!");
            System.out.println("\n---------------------------------");
            addCat(zoo);
        }
        
        
        return zoo;
    }
    
}
