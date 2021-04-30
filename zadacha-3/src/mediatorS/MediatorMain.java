package mediatorS;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Mitko");
		User user2 = new ChatUser(chat, "Desislava");
		User user3 = new ChatUser(chat, "Antoniq");
		
		user1.send("Hi, friend!");
		user2.send("addBot");
		user3.send("cat");
		user3.send("Sorry!");

	}

}
