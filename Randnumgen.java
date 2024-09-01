package RPS2;

import java.util.Random;

public class Randnumgen{

    public String randNumGen(){
            //generate random number for computerChoice
        Random rand = new Random();
    
        //create random number between 0-2 
        int rand_int1 = rand.nextInt(2);

        //convert int 0 to the string rock
        if(rand_int1 == 0){
            //return string value
            return "rock";
        }
        else if (rand_int1 == 1)
        {
            return "paper";
        }
        else{
            return "scissors";
        }
    }
        
}

