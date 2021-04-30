package mediatorS;

public interface MessageMediator {
	
	void addUser(User user);
	void sendMessage(String message, User user);
	void removeUser(String message, User user);

}
