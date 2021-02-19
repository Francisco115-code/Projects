//**************************************************************************
// File Name: PlayerandEnemy  
// Authors: Francisco Guzman, Angela Wells, Tim Myszenki 
// 
// Purpose: To create a player and enemy class that declares their stats and 
// objects. There will also be combat encounters and loops included 
// in the class. The main game of Knight Adventures and all classes 
// will run through this class. 
//***************************************************************************
//**************************************************************************
package TextBasedGame;
import java.util.Random;
import java.util.Scanner;
        
public class PlayerandEnemy {  
    
    
    public static void main (String [] args) {
        //System Objects 
        Scanner scan = new Scanner(System.in); 
        Random rand = new Random(); 
        
        // Variables for combat roles
        int dam1 = 10;
        int dam2 = 10;
        
        // Player is a  Knight (different colors), here are their stats. 
        int playerhp = 105; // Player Health
        int playerdam = 30; // Player Attack Damage
        int playerdef = 12; // Player Armor Defense 
        
        // There are several enemies that will be randomly generated,
        // here are their stats. 
        int enemyhp = 80;  // Enemy Health
        int enemydam = 20; // Enemy Attack Damage
        int enemydef = 8; // Enemy Armor Defense 
        
        // Boss Variables for Combat (differs from regular enemies)
        int bosshp1 = 110; 
        int bosshp2 = 115; 
        int bosshp3 = 120; 
        int bossdam = 25; 
        int bossdef = 12; 
        
        // This is a string array to randomly generate the enemies in the game. 
        String[] enemies = {"Skeleton", "Goblin", "Elve", "Dark Knight",
            "Wizard"}; 
       // Enemies randomly generated for each level of the game 
       // (Except for Boss Levels 5, 10, 20 which are not randomly generated). 
        String enemy1 = enemies[rand.nextInt(enemies.length)]; 
        String enemy2 = enemies[rand.nextInt(enemies.length)]; 
        String enemy3 = enemies[rand.nextInt(enemies.length)];
        String enemy4 = enemies[rand.nextInt(enemies.length)];
        String enemy5 = enemies[rand.nextInt(enemies.length)];
        String enemy6 = enemies[rand.nextInt(enemies.length)]; 
        String enemy7 = enemies[rand.nextInt(enemies.length)];
        String enemy8 = enemies[rand.nextInt(enemies.length)];
        String enemy9 = enemies[rand.nextInt(enemies.length)];
        String enemy10 = enemies[rand.nextInt(enemies.length)];
        String enemy11 = enemies[rand.nextInt(enemies.length)];
        String enemy12 = enemies[rand.nextInt(enemies.length)];
        String enemy13 = enemies[rand.nextInt(enemies.length)];
        String enemy14 = enemies[rand.nextInt(enemies.length)];
        String enemy15 = enemies[rand.nextInt(enemies.length)];
        String enemy16 = enemies[rand.nextInt(enemies.length)];
        String enemy17 = enemies[rand.nextInt(enemies.length)]; 
        
        // This is a string declaration for each color type of knight player. 
        String character1 = "Red Knight"; 
        String character2 = "Golden Knight"; 
        String character3 = "Silver Knight"; 
        String combatPrompt1; // For Prompting the User to attack their enemy.
        
        // This is string declaration for each of the Bosses. 
        String Boss1 = "The Giant Skeleton";
        String Boss2 = "The Enchanted Wizard";
        String Boss3 = "The Legendary Knight";
        
        // This is the start code for the game, the game will return to this 
        // section of code once finished. 
        boolean running = true; 
                
        GAME:
        while (running) {
        
        System.out.print("  _  __        _         _      _        _        _"
                 + "                     _                          \n" +
                " | |/ / _ __  (_)  __ _ | |__  | |_     / \\    __| |__   __ "
                 + "___  _ __  | |"
                 + "_  _   _  _ __  ___  ___ \n" +
                " | ' / | '_ \\ | | / _` || '_ \\ | __|   / _ \\  / _` |\\ \\ "
                 + "/ // _ \\| '_ \\"
                 + " | __|| | | || '__|/ _ \\/ __|\n" +
                " | . \\ | | | || || (_| || | | || |_   / ___ \\| (_| | \\ V /"
                 + "|  __/| | | || "
                 + "|_ | |_| || |  |  __/\\__ \\\n" +
                " |_|\\_\\|_| |_||_| \\__, ||_| |_| \\__| /_/   \\_\\\\__,_|  "
                 + "\\_/  \\___||_| "
                 + "|_| \\__| \\__,_||_|   \\___||___/\n" +
                "                  |___/                                "
                 + "                                            \n");
        System.out.print("***************************************************");
        System.out.println("*************************************************");
        System.out.print("Welcome to Knight Adventures! " + " \n" 
        + "Which knight do you choose? " + "\n" 
        + "Select either " + character1 + " (type r), " + character2 
        + " (type g), "+ "or " + character3 + "(type s): ");
        String chooseCharacter = scan.next();
        System.out.println("");
        System.out.println("*************************************************");
        
        switch (chooseCharacter) 
        {    
            case "r": 
                System.out.println("Red Knight chosen! "); 
                break; 
            case "g": 
                System.out.println("Golden Knight chosen! "); 
                break;
            case "s": 
                System.out.println("Silver Knight chosen! "); 
                break; 
            default: 
                System.out.println("A knight will be randomly picked for you!"); 
                break;    
               
        }
        System.out.println("Knight selected! Let's start our adventure! ");
        System.out.println("");   
        
        
        // Enemy Encounter Scenario that will be randomly generated.
        // Note: Combat Loops are in place only for Level 1 and the 
        // three boss encounters (Levels 5, 10, and 20).
        System.out.println("Level 1: The Forest");
        System.out.println("Player a " + enemy1 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: "); 
        String enemyScenario1 = scan.next(); 
        switch (enemyScenario1)
        {
            case "Fight": //Includes one enemy combat loop scenario for sample. 
                while ((playerhp > 0) && (enemyhp > 0)){     
            enemydam = (int) (Math.random() * 22 + 1);
            playerdam = (int) (Math.random() * 17 + 1);
            dam1 = playerdam - enemydef;
            
            if (dam1 > 0) {
            enemyhp = enemyhp - dam1; 
            System.out.println("Player Health = " + playerhp + 
                    " Enemy Health = " + enemyhp);
            System.out.print("Type a for Attack to engage the enemy: "); 
            combatPrompt1 = scan.next();
            System.out.println("You hit the " + enemy1 + " for " + dam1 + 
                    " damage!"); 
            System.out.println("Enemy Health = " + enemyhp);
            }
            else {
            System.out.println("You missed! Prepare for " 
                    + enemy1 + "'s counterattack!"); 
            System.out.print("Type b for block: ");
            combatPrompt1 = scan.next(); 
            
            }
            
            dam2 = enemydam - playerdef; 
            
            if (dam2 > 0) {
            playerhp = playerhp - dam2;
            System.out.println("The " + enemy1 + " hit you for " + dam2 + 
                    " damage!"); 
            System.out.println("Player Health = " + playerhp);
            }
            else {
            System.out.println("They missed!");
            }
        }      
        if (enemyhp <= 0)
            System.out.println("A victory fit for a knight. You have defeated"
                    + " the " + enemy1 + ", continue on with your adventure.");
        else
            System.out.println("Unfortunantly after a hard fought battle "
                + "you were defeated by the " + enemy1 + 
                " better luck on your next adventure!");
        System.out.println("Player Health = " + playerhp);
        playerhp = 105;
        System.out.println("Player health has been reset to " + playerhp);
                break; 
                
            case "Run": 
                System.out.println("You have avoided the " + enemy1
                        + " for now, beware. ");
                System.out.println("Level 1 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break;
        } 
        
        System.out.println("");
        System.out.println("Level Two: The Desert");
        System.out.println("Player a " + enemy2 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        
        String enemyScenario2 = scan.next(); 
        switch (enemyScenario2)
        {
            case "Fight":   
                System.out.println("Attack the " + enemy2 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with "
                        + "your Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy2 
                        + " has been defeated! ");
                System.out.println("Level 2 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy2
                        + " for now, beware. ");
                System.out.println("Level 2 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break;
        } 
        
        System.out.println("");
        System.out.println("Level 3: The Snowland");
        System.out.println("Player a " + enemy3 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario3 = scan.next(); 
        switch (enemyScenario3)
        {
            case "Fight": 
                System.out.println("Attack the " + enemy3 + " now."); 
                System.out.print(""); 
                System.out.print("Type LB to shoot the enemy with your "
                        + "Long Bow now: ");
                combatPrompt1 = scan.next();
                System.out.println("Shoot the enemy with your Long Bow, "
                        + "the " + enemy3 
                        + " has been defeated! ");
                System.out.println("Level 3 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy3
                        + " for now, beware. ");
                System.out.println("Level 3 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break;
        } 
        System.out.println(""); 
        System.out.println("Level 4: The Cave");
        System.out.println("Player a " + enemy4 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario4 = scan.next(); 
        switch (enemyScenario4)
        {
            case "Fight": 
                System.out.println("Attack the " + enemy4 + " now."); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.print(""); 
                System.out.println("Hit the enemy with your "
                        + "Sword, the " + enemy4 
                        + " has been defeated! ");
                System.out.println("Level 4 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy4
                        + " for now, beware. ");
                System.out.println("Level 4 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break;
        }
        
        // First Boss Encounter Scenario 
        System.out.println("");
        System.out.println("Player, Level 5: The Plains is almost conquered," 
                + " but " + Boss1 +  " has appeared. "
                        + "What do you want to do? " + "\n" 
                        + "Type either Fight, Observe or Retreat: ");
        
        String bossScenario1 = scan.next();
        switch (bossScenario1) 
        {
            case "Fight": 
                  while ((playerhp > 0) && (bosshp1 > 0)){     
            bossdam = (int) (Math.random() * 20 + 1);
            playerdam = (int) (Math.random() * 19 + 1);
            dam1 = playerdam - bossdef;
            
            if (dam1 > 0) {
            bosshp1 = bosshp1 - dam1; 
            System.out.println("Player Health = " + playerhp + 
                    " Boss Health = " + bosshp1);
            System.out.print("Type a for Attack to engage the enemy: "); 
            combatPrompt1 = scan.next();
            System.out.println("You hit the " + Boss1 + " for " + dam1 + 
                    " damage!"); 
            System.out.println("Boss Health = " + bosshp1);
            }
            else {
            System.out.println("You missed! Prepare for " 
                    + Boss1 + "'s counterattack!"); 
            System.out.print("Type b for block: ");
            combatPrompt1 = scan.next(); 
            
            }
            
            dam2 = bossdam - playerdef; 
            
            if (dam2 > 0) {
            playerhp = playerhp - dam2;
            System.out.println(Boss1 + " hit you for " + dam2 + 
                    " damage!"); 
            System.out.println("Player Health = " + playerhp);
            }
            else {
            System.out.println("They missed!");
            }
        }   
        if (bosshp1 <= 0)
            System.out.println("A victory fit for a knight. You have defeated"
            + " the " + Boss1 + ", continue on with your adventure. "
            + "Level 5 completed!");
        else
            System.out.println("Unfortunantly, after a hard fought battle "
                + "you were defeated by the " + Boss1 + 
                " better luck on your next adventure!" + "\n" 
                + " Level 5 failed! "); 
        System.out.println("Player Health = " + playerhp);
            playerhp = 105;
            System.out.println("Player health has been reset to " + playerhp);          
                break; 
            case "Observe": 
                System.out.println("Look, there is a weakpoint in " + Boss1 
                        + "'s ribcage. Attack here! The boss has "
                        + "been struck!" + "\n" + "Level 5 completed.");
                break; 
            case "Retreat": 
                System.out.print("Oh no! " + Boss1 + " is going after you. "
                        + "\n" + "You are going to be defeated soon! "
                        + "Go to Level 6: The Lake. "); 
                break; 
            default: 
                System.out.print("You did not enter your choice of strategy to "
                        + "defeat this boss, please type either Fight, "
                        + "Observe or Retreat. ");
                break;
                
        } 
        System.out.println(""); 
        System.out.println("Level 6: The Lake");
        System.out.println("Player a " + enemy5 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario5 = scan.next(); 
        switch(enemyScenario5) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy5 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy5 
                        + " has been defeated! ");
                System.out.println("Level 6 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy5
                        + " for now, beware. ");
                System.out.println("Level 6 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        }
        System.out.println("");
        System.out.println("Level 7: The Beach");
        System.out.println("Player a " + enemy6 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario6 = scan.next(); 
        switch(enemyScenario6) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy6 + " now."); 
                System.out.print(""); 
                System.out.print("Type z to zap the enemy with your "
                        + "Staff now: ");
                combatPrompt1 = scan.next(); 
                System.out.println("Zap the enemy with "
                        + "your Staff, the " + enemy6 
                        + " has been defeated!");
                System.out.println("Level 7 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy6
                        + " for now, beware. ");
                System.out.println("Level 7 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        }
        System.out.println("");
        System.out.println("Level 8: The Island");
        System.out.println("Player a " + enemy7 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario7 = scan.next(); 
        switch(enemyScenario7) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy7 + " now."); 
                System.out.print(""); 
                System.out.print("Type LB to shoot the enemy with your "
                        + "Long Bow now: ");
                combatPrompt1 = scan.next();
                System.out.println("Shoot the enemy with your Long Bow, "
                        + "the " + enemy7 
                        + " has been defeated! ");
                System.out.println("Level 8 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy7
                        + " for now, beware. ");
                System.out.println("Level 8 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        }
        System.out.println(""); 
        System.out.println("Level 9: The Canyon"); 
        System.out.println("Player a " + enemy8 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario8 = scan.next(); 
        switch(enemyScenario8) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy8 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy8 
                        + " has been defeated! ");
                System.out.println("Level 9 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy8
                        + " for now, beware. ");
                System.out.println("Level 9 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        }
        // Second Boss Encounter Scenario
        System.out.println("");
        System.out.println("Player, Level 10: The Mountain Land is "
                + "almost conquered, but " 
                    + Boss2 + " has appeared. What do you want to do? " + "\n" 
                        + "Type either Fight, Observe or Retreat: "); 
        String bossScenario2 = scan.next(); 
        switch (bossScenario2) 
        {
            case "Fight": 
                  while ((playerhp > 0) && (bosshp2 > 0)){     
            bossdam = (int) (Math.random() * 20 + 1);
            playerdam = (int) (Math.random() * 19 + 1);
            dam1 = playerdam - bossdef;
            
            if (dam1 > 0) {
            bosshp2 = bosshp2 - dam1; 
            System.out.println("Player Health = " + playerhp + 
                    " Boss Health = " + bosshp2);
            System.out.print("Type a for Attack to engage the enemy: "); 
            combatPrompt1 = scan.next();
            System.out.println("You hit the " + Boss2 + " for " + dam1 + 
                    " damage!"); 
            System.out.println("Boss Health = " + bosshp2);
            }
            else {
            System.out.println("You missed! Prepare for " 
                    + Boss2 + "'s counterattack!"); 
            System.out.print("Type b for block: ");
            combatPrompt1 = scan.next(); 
            
            }
            
            dam2 = bossdam - playerdef; 
            
            if (dam2 > 0) {
            playerhp = playerhp - dam2;
            System.out.println(Boss2 + " hit you for " + dam2 + 
                    " damage!"); 
            System.out.println("Player Health = " + playerhp);
            }
            else {
            System.out.println("They missed!");
            }
        }   
        if (bosshp2 <= 0)
            System.out.println("A victory fit for a knight. You have defeated"
                    + " the " + Boss2 + ", continue on with your adventure. "
                    + "Level 10 completed! "); 
        else
            System.out.println("Unfortunantly after a hard fought battle "
                + "you were defeated by the " + Boss2 + 
                " better luck on your next adventure!" + "/n" 
                + "Level 10 failed! ");
        System.out.println("Player Health = " + playerhp);
        playerhp = 105;
            System.out.println("Player health has been reset to " + playerhp); 
               break; 
            case "Observe": 
               System.out.println("Look, there is a weakpoint in " + Boss2 + 
                       " 's magic armor. " + "\n" + "You should attack here "
                               + "with your Sword! ");
               System.out.println(Boss2 + " has been defeated !"); 
               System.out.println("Level 10 completed."); 
               break; 
            case "Retreat": 
                System.out.println(Boss2 + " says: 'You will be devoured by "
                        + "my magic!' "); 
                System.out.println("Run and go to Level 11: The Hills! ");
                break; 
            default: 
                System.out.println("You did not enter your choice of strategy "
                        + "to defeat this boss, please type either Fight, "
                        + "Observe, or Retreat."); 
                break;            
        }  
        System.out.println(""); 
        System.out.println("Level 11: The Hills "); 
        System.out.println("Player a " + enemy9 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario9 = scan.next(); 
        switch(enemyScenario9) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy9 + " now."); 
                System.out.print(""); 
                System.out.print("Type z to zap the enemy with your "
                        + "Staff now: ");
                combatPrompt1 = scan.next();
                System.out.println("Zap the enemy with "
                        + "your Staff, the " + enemy9
                        + " has been defeated! ");
                System.out.println("Level 11 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy9
                        + " for now, beware. ");
                System.out.println("Level 11 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println(""); 
        System.out.println("Level 12: The Swamp"); 
        System.out.println("Player a " + enemy10 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario10 = scan.next(); 
        switch(enemyScenario10) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy10 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy10
                        + " has been defeated! ");
                System.out.println("Level 12 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy10
                        + " for now, beware. ");
                System.out.println("Level 12 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println("");
        System.out.println("Level 13: The Misty Land"); 
        System.out.println("Player a " + enemy11 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario11 = scan.next(); 
        switch(enemyScenario11) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy11 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy11
                        + " has been defeated! ");
                System.out.println("Level 13 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy11
                        + " for now, beware. ");
                System.out.println("Level 13 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println("");
        System.out.println("Level 14: The Village");  
        System.out.println("Player a " + enemy12 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario12 = scan.next(); 
        switch(enemyScenario12) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy12 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy12
                        + " has been defeated! ");
                System.out.println("Level 14 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy12
                        + " for now, beware. ");
                System.out.println("Level 14 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println(""); 
        System.out.println("Level 15: The Farm"); 
        System.out.println("Player a " + enemy13 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario13 = scan.next(); 
        switch(enemyScenario13) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy13 + " now."); 
                System.out.print(""); 
                System.out.print("Type LB to shoot the enemy with your "
                        + "Long Bow now: ");
                combatPrompt1 = scan.next();
                System.out.println("Shoot the enemy with"
                        + " your Long Bow, the " + enemy13
                        + " has been defeated! ");
                System.out.println("Level 15 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy13
                        + " for now, beware. ");
                System.out.println("Level 15 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println(""); 
        System.out.println("Level 16: The Giant River"); 
        System.out.println("Player a " + enemy14 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario14 = scan.next(); 
        switch(enemyScenario14) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy14 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy14
                        + " has been defeated! ");
                System.out.println("Level 16 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy14
                        + " for now, beware. ");
                System.out.println("Level 16 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println(""); 
        System.out.println("Level 17: The Marsh Land"); 
        System.out.println("Player a " + enemy15 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario15 = scan.next(); 
        switch(enemyScenario15) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy15 + " now."); 
                System.out.print(""); 
                System.out.print("Type z to zap the enemy with your "
                        + "Staff now: ");
                combatPrompt1 = scan.next();
                System.out.println("Zap the enemy with "
                        + "your Staff, the " + enemy15
                        + " has been defeated! ");
                System.out.println("Level 17 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy15
                        + " for now, beware. ");
                System.out.println("Level 17 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println(""); 
        System.out.println("Level 18: The Gloomy Trail"); 
        System.out.println("Player a " + enemy16 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario16 = scan.next(); 
        switch(enemyScenario16) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy16 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy16
                        + " has been defeated! ");
                System.out.println("Level 18 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy16
                        + " for now, beware. ");
                System.out.println("Level 18 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        System.out.println(""); 
        System.out.println("Level 19: The Royal Castle"); 
        System.out.println("Player a " + enemy17 + " has appeared,"
                + " what do you want to do? Please Type either Fight or Run: ");
        String enemyScenario17 = scan.next(); 
        switch(enemyScenario17) 
        {
           case "Fight": 
                System.out.println("Attack the " + enemy17 + " now."); 
                System.out.print(""); 
                System.out.print("Type s to attack the enemy with your "
                        + "Sword now: ");
                combatPrompt1 = scan.next();
                System.out.println("Hit the enemy with "
                        + "your Sword, the " + enemy17
                        + " has been defeated! ");
                System.out.println("Level 19 completed. "); 
                break; 
            case "Run": 
                System.out.println("You have avoided the " + enemy17
                        + " for now, beware. ");
                System.out.println("Level 19 completed. "); 
                break;  
                
            default: 
                System.out.println(" Please type Fight or Run, "
                        + "in order to continue: ");
                break; 
        } 
        //Third and Final Boss Fight Scenario 
        System.out.println(""); 
        System.out.println("Player, Level 20: The Death Dungeon "
                + "is almost conquered, but " + Boss3 
                + " has appeared." + "\n" + "This is the final boss! " 
                + "What do you want to do? " + "\n" 
                + "Type either Fight, Observe or Retreat: "); 
        
        String bossScenario3 = scan.next(); 
        switch (bossScenario3) 
        { 
            case "Fight": 
                while ((playerhp > 0) && (bosshp3 > 0)){     
            bossdam = (int) (Math.random() * 20 + 1);
            playerdam = (int) (Math.random() * 19 + 1);
            dam1 = playerdam - bossdef;
            
            if (dam1 > 0) {
            bosshp3 = bosshp3 - dam1; 
            System.out.println("Player Health = " + playerhp + 
                    " Boss Health = " + bosshp3);
            System.out.print("Type a for Attack to engage the enemy: "); 
            combatPrompt1 = scan.next();
            System.out.println("You hit the " + Boss3 + " for " + dam1 + 
                    " damage!"); 
            System.out.println("Boss Health = " + bosshp3);
            }
            else {
            System.out.println("You missed! Prepare for " 
                    + Boss3 + "'s counterattack!"); 
            System.out.print("Type b for block: ");
            combatPrompt1 = scan.next(); 
            
            }
            
            dam2 = bossdam - playerdef; 
            
            if (dam2 > 0) {
            playerhp = playerhp - dam2;
            System.out.println(Boss3 + " hit you for " + dam2 + 
                    " damage!"); 
            System.out.println("Player Health = " + playerhp);
            }
            else {
            System.out.println("They missed!");
            }
        }   
        if (bosshp3 <= 0)
            System.out.print("A victory fit for a knight. You have defeated "
                   + Boss3 + ", you are a amazing knight! "
                  + "Level 20 completed!" + "\n" 
                  + "Player Health = " + playerhp + "\n" + 
                    "****************************************"
                  + "****************************************" + "\n" 
                  + "Game Finished, thanks for playing! Game will start over "
                  + "from first level." + "\n" 
                  + "*****************************************" 
                  + "\n" + "*****************************************");
        else
            System.out.print("Unfortunantly, after a hard fought battle "
                + "you were defeated by " + Boss3 + 
                " better luck on your next adventure! Level 20 failed!" + "\n" 
                  + "Player Health = " + playerhp + "\n" 
                  + "****************************************"
                  + "****************************************" + "\n" 
                  + "Game Finished, thanks for playing! Game will start over "
                  + "from first level." + "\n" 
                  + "*****************************************" 
           + "\n" + "*****************************************"); 
                break;  
            case "Observe": 
                System.out.println("Look, when " + Boss3 
                        + " swings his sword back to his body, "
                        + "he is vulnerable to your Long Bow Attack." + "\n" 
                        + " Attack here when the time is right! "); 
                System.out.println("Your Long Bow has struck" + Boss3 + ".");
                System.out.println("Victory! You have defeated " + Boss3 + ".");
                System.out.println("Level 20 completed!"); 
                System.out.println("");
                System.out.println("*****************************************");
                System.out.println("*****************************************");
                System.out.println("Game Finished, thanks for playing! " +
                "Game will start over from first level. ");        
                System.out.println("*****************************************");
                System.out.println("*****************************************");
                
                break; 
            case "Retreat": 
                System.out.print("Player, it has been said of old legend, "
                        + "that you cannot escape the power of " + Boss3 + "." 
                        + "You must fight him with all of the strength "
                        + "you have left in your Knight Powers! "); 
                System.out.println("Use your Special Magic Sword and Staff "
                        + "combo attack to defeat him! "); 
                System.out.println(Boss3 + " has been paralyzed "
                        + "by your final blow! "
                        + "Shoot him with your Long Bow to finish him off. ");
                System.out.println("Victory! You have defeated " + Boss3 + ".");
                System.out.println("Level 20 completed!"); 
                System.out.println("");
                System.out.println("*****************************************");
                System.out.println("*****************************************");
                System.out.println("Game Finished, thanks for playing! " +
                "Game will start over from first level. ");        
                System.out.println("*****************************************");
                System.out.println("*****************************************");
                break;  
            default: 
                System.out.println("You did not choose your choice of "
                        + "strategey to beat the final boss, please type either"
                        + " Fight, Observe, or Retreat to continue.");
                break; 
        } // End of Text Based Game 
    } 
        
  }
    
} 


