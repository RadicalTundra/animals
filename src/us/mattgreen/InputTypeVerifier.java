/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

/**
 *
 * @author Teddy
 */
public class InputTypeVerifier {
    
     public InputTypeVerifier(){
     
     }
    public int ratsKilledCheck(String userInput) throws NumberFormatException{
         int ratsKilled = 0;
         //check here to see if the userInput is actually an int. I don't know if this is right
       if((ratsKilled = Integer.parseInt(userInput)) == (int)ratsKilled){
           return ratsKilled;
       }
       else{
           throw new NumberFormatException(); 
       }
       
    }
    public boolean isGoodBoyCheck(String userInput) throws NullPointerException{
        boolean goodBoy = true;
        //check here to see if the userInput is actually a boolean.
        if(goodBoy = Boolean.parseBoolean(userInput)){
            return goodBoy;
        }
        else{
            throw new NullPointerException();
        }
    }
    public int personAgeCheck(String userInput) throws NumberFormatException{
        int personAge = 0;
         //check here to see if the userInput is actually an int.
       if((personAge = Integer.parseInt(userInput)) == (int)personAge){
           return personAge;
       }
       else{
           throw new NumberFormatException(); 
       }
    } 
}
