import io.github.cdimascio.dotenv.Dotenv;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import java.io.IOException;

public class DokhusBot {
	public static void main(String[] args) {
		final String TOKEN;

		Dotenv dotenv = Dotenv.load();
		TOKEN = dotenv.get("DISCORD_BOT_TOKEN");

		DiscordApi api = new DiscordApiBuilder().setToken(TOKEN).login().join();

		// Ping Pong event
		api.addMessageCreateListener(event -> {
			if (event.getMessageContent().equalsIgnoreCase("!ping")) {
				event.getChannel().sendMessage("Pong!");
			}
		});
	}
}

