package mediatorS;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {
	
	private List<User> users;
	private SingletonBot bot;

	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}
	

	@Override
	public void sendMessage(String message, User user) {
		for (User chatUser : this.users) {
			if (user != chatUser) {
				chatUser.receive(message);
			}	
		}
		if (bot != null) {
	            boolean CatMessage = bot.expurgation(message, user, this);
	            if (CatMessage) {
	                sendMessage(user.getName() + " was banned, because she used word <<cat>> which is forbidden in this chat ", null);
	                return;
	            }
	            
	        }

	        if (message.equals("addBot")) {
	            addBot();
	        }
	
		}

	@Override
	public void removeUser(String message, User user) {
		this.users.remove(user);
		user.Warring(null);	
	}
	
	private void addBot() {
		bot = SingletonBot.getInstance();
	}
	

}
