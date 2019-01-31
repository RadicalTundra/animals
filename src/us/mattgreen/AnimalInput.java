
package us.mattgreen;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalInput {
    
    public AnimalInput(ArrayList<Talkable> zoo){
        InputTypeVerifier input = new InputTypeVerifier();
        Prompt(zoo, input);

    }
    //promts the user to choose what they are, a cat, dog or person
    public ArrayList Prompt(ArrayList<Talkable> zoo, InputTypeVerifier input){
        System.out.println("Do you want to be a cat, a dog, or a person?");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String test = userInput.toLowerCase();
        //Makes sure user enters the right type
        if( "cat".equals(test) || "dog".equals(test) || "person".equals(test)){
           switch (test){
               case "cat": addCat(zoo, input);
                            break;
               case "dog": addDog(zoo, input);
                           break;
               case "person": addPerson(zoo, input);
                              break;
           }
        }
        else{
            System.out.println("\n---------------------------------\n");
            System.out.println("Please enter a proper type ya goof!");
            System.out.println("\n---------------------------------\n");
           Prompt(zoo, input);
           
        }
        return zoo;
    }
    //if they chose cat they go here
    public ArrayList addCat(ArrayList<Talkable> zoo, InputTypeVerifier input){
        System.out.println("\nHow many mice have you killed?");
        Scanner sc = new Scanner(System.in);
        int miceKilled = 0;
        String mice = "";
        String catName = "";
        mice = sc.nextLine();
        try{
            miceKilled = input.ratsKilledCheck(mice);
            System.out.println("\nSo what's your name little guy?");
            Scanner sc2 = new Scanner(System.in);
            catName = sc2.nextLine();
            zoo.add(new Cat(miceKilled, catName));
        }
        catch(NumberFormatException e){
            System.out.println("\n---------------------------------\n");
            System.out.println("You must enter a number ya goof!");
            System.out.println("\n---------------------------------");
            addCat(zoo, input);
        }
        
        return zoo;
    }
    //if they chose dog they go here
    public ArrayList addDog(ArrayList<Talkable> zoo, InputTypeVerifier input){
        System.out.println("\nSo, are you a friendly little guy? (true or false)");
        Scanner sc = new Scanner(System.in);
        String isGoodBoy = "";
        isGoodBoy = sc.nextLine();
        boolean goodBoy = true;
        String dogName = "";
        try{
            goodBoy = input.isGoodBoyCheck(isGoodBoy);
            System.out.println("\nSo what's your name buddy?");
            Scanner sc2 = new Scanner(System.in);
            dogName = sc2.nextLine();
            zoo.add(new Dog(goodBoy, dogName));
        }
        catch(NullPointerException e){
            System.out.println("\n---------------------------------\n");
            System.out.println("You must enter a true or false!");
            System.out.println("\n---------------------------------");
            addDog(zoo, input);
        }
        
        
        return zoo;
    }
    //If they chose person they go here
    public ArrayList addPerson(ArrayList<Talkable> zoo, InputTypeVerifier input){
        System.out.println("\nWhat's your age?");
        Scanner sc = new Scanner(System.in);
        String age = "";
        age = sc.nextLine();
        int personAge = 0;
        String personName = "";
        try{
            personAge = input.personAgeCheck(age);
            System.out.println("\nSo what's your name?");
            Scanner sc2 = new Scanner(System.in);
            personName = sc2.nextLine();
            zoo.add(new Student(personAge, personName));
        }
        catch(Exception e){
            System.out.println("\n---------------------------------\n");
            System.out.println("You must enter a number ya goof!");
            System.out.println("\n---------------------------------");
            addPerson(zoo, input);
        }
        
        
        return zoo;
    }
    
}
