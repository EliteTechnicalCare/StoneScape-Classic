package stonekingdom;

import core.Misc;

public class Dialog {
	@SuppressWarnings("all")
	
	private Client c;
	
	public Dialog(Client client) {
		this.c = client;
	}
	
	public void processDialog(){
		c.sendMessage("Talk ID "+c.talkID);
		if(c.talkID != -1) {
			c.talkID++;
			sendDialog(c.npcTalkName);
		} else {
			c.npcTalkName = "MISSINGNPC";
			c.npcTalkID = -1;
			c.closeAllWindows();
		}
	}
	
	public void sendDialog(String name) { //Hakki Engineering Exclusive NPC Dialog system
		switch(name) {
		case "STARTER":
			switch(c.talkID) {
			case 0:
				itemChat("Note from the developer:",
						"I created StoneScape back in 2005 and had lost my",
						"original source until recently. Using years of",
						"Java experince, I fixed up the source and made what I",
						"believe is the most fun RSPS. Thank you for playing!", 1044, 150);
				break;
			case 1:
				NPC("Well well a newcommer I see?", "Well you must join one of the four clans", "Les you be targeted!", 2253, "StoneScape Guide");
				break;
			case 2:
				NPC("The Ahads are deeply religious and believe in One God",
						"The Al-Shair clan are sorcerers and worship many gods", 
						"The Jahadoons are feirce wariors who live by the sword",
						"The Trading Federation are rich but peaceful people",
						2253, "StoneScape Guide");
				break;
			case 3:
				NPC("The Ahads will grant you sancitiy and defence experince",
						"The Al-Shair will grant you sorcery and herbology experince", 
						"The Jahadoons will grant you strength and attack experince",
						"The Trading Federation will grant you exp in four resource skills",
						2253, "StoneScape Guide");
				break;
			case 4:
				option("Choose your clan!", "The Ahads", "The Al-Shair clan", "The Jahadoons", "The Trading Federation");
				break;
			case 5:
				switch(c.chatOption){
				case 1:
					Config.Starter (c, "Ahad");
					break;
				case 2:
					Config.Starter (c, "Al-Sahir");
					break;
				case 3:
					Config.Starter (c, "Jahadoon");
					break;
					
				case 4:
					Config.Starter (c, "Trading Federation");
					break;
				}
				c.talkID = -1;
				break;
			}
			break;
		}
		//processDialog(); //Either ends, moves forward, or processes options
	}
	
	public void startInfo(String text, String text1, String text2, String text3, String title) {
		c.setLine(title, 6180);
		c.setLine(text, 6181);
		c.setLine(text1, 6182);
		c.setLine(text2, 6183);
		c.setLine(text3, 6184);
		c.sendFrame164(6179);
	}

	public void itemChat(String header, String one, int item, int zoom) {
		c.sendFrame246(4883, zoom, item);
		c.setLine(header, 4884);
		c.setLine(one, 4885);
		c.sendFrame164(4882);
	}

	public void itemChat(String header, String one, String two, int item, int zoom) {
		c.sendFrame246(4888, zoom, item);
		c.setLine(header, 4889);
		c.setLine(one, 4890);
		c.setLine(two, 4891);
		c.sendFrame164(4887);
	}

	public void itemChat(String header, String one, String two, String three, int item, int zoom) {
		c.sendFrame246(4894, zoom, item);
		c.setLine(header, 4895);
		c.setLine(one, 4896);
		c.setLine(two, 4897);
		c.setLine(three, 4898);
		c.sendFrame164(4893);
	}

	public void itemChat(String header, String one, String two, String three, String four, int item, int zoom) {
		c.sendFrame246(4901, zoom, item);
		c.setLine(header, 4902);
		c.setLine(one, 4903);
		c.setLine(two, 4904);
		c.setLine(three, 4905);
		c.setLine(four, 4906);
		c.sendFrame164(4900);
	}
	
	/*
	 * Options
	 */
	
	public void option(String title, String s) {
		c.setLine(title, 2470);
	 	c.setLine(s, 2471);
		c.setLine("Click here to continue", 2473);
		c.sendFrame164(13758);
	}	
	
	public void option(String title,String s, String s1) {
		c.setLine(title, 2460);
		c.setLine(s, 2461);
		c.setLine(s1, 2462);
		c.sendFrame164(2459);
	}
	
	public void option( String title,String s, String s1, String s2) {
		c.setLine(title, 2470);
		c.setLine(s, 2471);
		c.setLine(s1, 2472);
		c.setLine(s2, 2473);
		c.sendFrame164(2469);
	}
	
	public void option( String title,String s, String s1, String s2, String s3) {
		c.setLine(title, 2481);
		c.setLine(s, 2482);
		c.setLine(s1, 2483);
		c.setLine(s2, 2484);
		c.setLine(s3, 2485);
		c.sendFrame164(2480);
	}
	
	public void option( String title,String s, String s1, String s2, String s3, String s4) {
		c.setLine(title, 2493);
		c.setLine(s, 2494);
		c.setLine(s1, 2495);
		c.setLine(s2, 2496);
		c.setLine(s3, 2497);
		c.setLine(s4, 2498);
		c.sendFrame164(2492);
	}

	/*
	 * Statements
	 */
	
	@SuppressWarnings("unused")
	private void statement(String s) {
		c.setLine(s, 357);
		c.setLine("Click here to continue", 358);
		c.sendFrame164(356);
	}
	@SuppressWarnings("unused")
	private void statement(String s, String s1) {
		c.setLine(s, 360);
		c.setLine(s1, 361);
		c.setLine("Click here to continue", 362);
		c.sendFrame164(359);
	}
	
	@SuppressWarnings("unused")
	private void statement(String s, String s1, String s2) {
		c.setLine(s, 364);
		c.setLine(s1, 365);
		c.setLine(s2, 366);
		c.setLine("Click here to continue", 367);
		c.sendFrame164(363);
	}
	@SuppressWarnings("unused")
	private void statement(String s, String s1, String s2, String s3) {
		c.setLine(s, 369);
		c.setLine(s1, 370);
		c.setLine(s2, 371);
		c.setLine(s3, 372);
		c.setLine("Click here to continue", 373);
		c.sendFrame164(368);
	}
	@SuppressWarnings("unused")
	private void statement(String s, String s1, String s2, String s3, String s4) {
		c.setLine(s, 375);
		c.setLine(s1, 376);
		c.setLine(s2, 377);
		c.setLine(s3, 378);
		c.setLine(s4, 379);
		c.setLine("Click here to continue", 380);
		c.sendFrame164(374);
	}
	
	/*
	 * Npc Chatting
	 */
	@SuppressWarnings("all")	
	private void NPC(String s, int ChatNpc, String name) {
		c.setHeadAnim(4883, 591);
		c.setLine(name, 4884);
		c.setLine(s, 4885);
		c.setHead(ChatNpc, 4883);
		c.sendFrame164(4882);
	}
	@SuppressWarnings("all")
	private void NPC(String s, String s1, int ChatNpc, String name) {
		c.setHeadAnim(4888, 591);
		c.setLine(name, 4889);
		c.setLine(s, 4890);
		c.setLine(s1, 4891);
		c.setHead(ChatNpc, 4888);
		c.sendFrame164(4887);
	}
	@SuppressWarnings("all")
	private void NPC(String s, String s1, String s2, int ChatNpc, String name) {
		c.setHeadAnim(4894, 591);
		c.setLine(name, 4895);
		c.setLine(s, 4896);
		c.setLine(s1, 4897);
		c.setLine(s2, 4898);
		c.setHead(ChatNpc, 4894);
		c.sendFrame164(4893);
	}
	@SuppressWarnings("all")
	private void NPC(String s, String s1, String s2, String s3, int ChatNpc, String name) {
		c.setHeadAnim(4901, 591);
		c.setLine(name, 4902);
		c.setLine(s, 4903);
		c.setLine(s1, 4904);
		c.setLine(s2, 4905);
		c.setLine(s3, 4906);
		c.setHead(ChatNpc, 4901);
		c.sendFrame164(4900);
	}
	
	/*
	 * Player Chating Back
	 */
	@SuppressWarnings("all")
	private void player(String s) {
		c.setHeadAnim(969, 591);
		c.setLine(Misc.capitalize(c.playerName), 970);
		c.setLine(s, 971);
		c.sendFrame185(969);
		c.sendFrame164(968);
	}
	@SuppressWarnings("all")
	private void player(String s, String s1) {
		c.setHeadAnim(974, 591);
		c.setLine(Misc.capitalize(c.playerName), 975);
		c.setLine(s, 976);
		c.setLine(s1, 977);
		c.sendFrame185(974);
		c.sendFrame164(973);
	}
	@SuppressWarnings("all")
	private void player(String s, String s1, String s2) {
		c.setHeadAnim(980, 591);
		c.setLine(Misc.capitalize(c.playerName), 981);
		c.setLine(s, 982);
		c.setLine(s1, 983);
		c.setLine(s2, 984);
		c.sendFrame185(980);
		c.sendFrame164(979);
	}
	@SuppressWarnings("unused")
	private void player(String s, String s1, String s2, String s3) {
		c.setHeadAnim(987, 591);
		c.setLine(Misc.capitalize(c.playerName), 988);
		c.setLine(s, 989);
		c.setLine(s1, 990);
		c.setLine(s2, 991);
		c.setLine(s3, 992);
		c.sendFrame185(987);
		c.sendFrame164(986);
	}
}
