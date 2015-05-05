package stonekingdom;

import core.Misc;

/**
 * @author Stone- Copyright 2014
 * @version 1.00
 * @100% - This file was 100% created by Stone-
 * Processess commands
 */
public class Commands {
    public static void playerCommand(Client c, String cmd){
        switch(c.playerRights){
            case 3: //Admin
            	if(cmd.startsWith("drop")) {
            		ItemHandler.addItem(1050, c.absX, c.absY, c.heightLevel, 1, c.playerId, true);
            		c.createGroundItem(1050, c.absX, c.absY, 1);
            	}
            	
            	if (cmd.startsWith("pickup"))
            	{
            		try
            		{
            			int newItemID = Integer.parseInt(cmd.substring(7,11));
            			int newItemAmount = Integer.parseInt(cmd.substring(12));

            			if (newItemID <= 6540 && newItemID >= 0)
            				c.addItem(newItemID, newItemAmount);
            			else
            				c.sendMessage("No such item");
            		}
            		catch(Exception e) { c.sendMessage("Wrong Syntax! Use as ::pickup 0995 10"); }
            	}
            	if (cmd.equalsIgnoreCase("test")){
            		c.sendFrame126("www.ardirsps.com/forum", 12000);
            	}
            	
            case 2: //Moderator
            	if (cmd.startsWith("tele")) {
    				String[] arg = cmd.split(" ");
    				if (arg.length > 3)
    					c.teleport(Integer.parseInt(arg[1]), Integer.parseInt(arg[2]), Integer.parseInt(arg[3]));
    				else if (arg.length == 3)
    					c.teleport(Integer.parseInt(arg[1]), Integer.parseInt(arg[2]), c.heightLevel);
    			}
            case 1: //Full time member

            case 0: //New Member
            	if (cmd.startsWith("pass")) {
                    if(cmd.length() > 5) {
                        c.playerPass = cmd.substring(5);
                        c.sendMessage("Your new password is \"" + cmd.substring(5) + "\"");
                    } else {
                        c.sendMessage("You cannot have a blank password!");
                    }
                }
            	
            	if (cmd.equalsIgnoreCase("glitchdoesntexist")){
            		c.teleport(2512, 3860, 0);
            	}
            	
            	if (cmd.startsWith("bank")) {
    				c.openUpBank();
    			}
            	
            	if (cmd.equalsIgnoreCase("mypos")){
                	c.sendMessage("You are standing on X="+c.absX+" Y="+c.absY+" H="+c.heightLevel);
            	}
                
            	if(cmd.equalsIgnoreCase("played")){
            		c.sendMessage("Total time played: " + c.Days + " days, " + c.Hours + " hours, " + c.Minutes + " minutes");
            		c.sendMessage("You have logged in: "+ c.timeLoggedinandOut +" times");
            	}
            	
                Misc.println_debug(c.playerName+": ran command: "+cmd);
                break;
        }
    }

}
