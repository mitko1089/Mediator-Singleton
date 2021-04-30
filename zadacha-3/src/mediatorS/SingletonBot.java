package mediatorS;

public class SingletonBot {
	
	private static SingletonBot instance;

	private SingletonBot() {

	}
	
	public static SingletonBot getInstance() {
		if(instance == null) {
			instance = new SingletonBot();
		}
		
		return instance;
	}
	
	public void addBot() {
		System.out.println("Bot added!");
		
	}
	
	public boolean expurgation(String message, User user, Chat chat ) {
		if(message.equals("cat")) {
			chat.removeUser(message, user);
			System.out.println(user.getName() + " is banned from chat!");
			return true;
			
		}
		return false;
	}

}
