import java.util.*;
import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Random num = new Random();
        Scanner scan = new Scanner (System.in);
        Pokedex myDex = new Pokedex();
        char KeepGoing = 'Y';
        do{
            Pokemon p = spawn();
            double CatchProbability = 0;
            CatchProbability = 1 - (1 - (p.getBaseCatchRate()/ throwBall()));
            int random = num.nextInt( 1 );

            if (random < CatchProbability){
                System.out.println(p + "Caught!\nContinue Catching Pokemon? (Y or N)");
                myDex.addToDex(p);
                KeepGoing = scan.next().charAt(0);
                scan.nextLine();
            } else if (CatchProbability < random){
                random = (int)(Math.random()*2);
                System.out.println("Oops, "+ p + " jumped out, try again!");
                while (CatchProbability < random){
                    CatchProbability = 0;
                    CatchProbability = 1 - (1 - p.getBaseCatchRate()/throwBall());
                }
                System.out.println(p + "Caught!\nContinue Catching Pokemon? (Y or N)");
                myDex.addToDex(p);
                KeepGoing = scan.next().charAt(0);
                scan.nextLine();
            }
        }while (KeepGoing == 'Y');
        System.out.print(myDex);
    }
    public static Pokemon spawn(){
        int level = (int)(Math.random()*21);
        //21 because counting starts with 0
        Pokemon p = new Pokemon(level,0);
        int chance = (int)(Math.random()*3);
        switch (chance){
            case 1:
                p = new Bulbasaur(level);
                System.out.println("You encountered a level " + level + " Bulbasaur");
                break;
            case 2:
                p = new Charmander (level);
                System.out.println("You encountered a level " + level + " Charmander");
                break;
            default:
                p = new Caterpie (level);
                System.out.println("You encountered a level " + level + " Caterpie");
                break;
        }
        return p;
    }

    public static float throwBall(){
        Scanner scan = new Scanner (System.in);
        float multipliers = 0;
        float ballMultiplier = 0;
        float berryMultiplier = 0;
        float curveMultiplier = 0;

        System.out.println("What type of ball do you wish to use? (Poke, Great, Ultra)");
        String choice = scan.nextLine();
        switch(choice) {
            case "Poke":
                ballMultiplier = 1.0f;
                break;
            case "Great":
                ballMultiplier = 1.5f;
                break;
            case "Ultra":
                ballMultiplier = 2.0f;
                break;
            default:
                break;
        }

        System.out.println("What berry do you wish to use? (None, Razz, SilverPinap, GoldenRazz)");
        String choice2 = scan.nextLine();
        switch(choice2) {
            case "None":
                berryMultiplier = 1.0f;
                break;
            case "Razz":
                berryMultiplier = 1.5f;
                break;
            case "SilverPinap":
                berryMultiplier = 1.8f;
                break;
            case "GoldenRazz":
                berryMultiplier = 2.5f;
            default:
                berryMultiplier = 0;
                break;
        }

        System.out.println("Is this a curveball? (Yes or No)");
        String choice3 = scan.nextLine();
        if (choice3 == "Yes"){
            curveMultiplier = 1.7f;
        }else if (choice3 == "No"){
            curveMultiplier = 1.0f;
        }
        multipliers = berryMultiplier * ballMultiplier * curveMultiplier;

        return multipliers;
    }


}