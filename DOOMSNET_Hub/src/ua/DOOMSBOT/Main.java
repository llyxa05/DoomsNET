package ua.DOOMSBOT;

import java.io.*;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import ua.DOOMSBOT.Utils.*;
import ua.DOOMSBOT.commands.Misc.*;

public class Main {
	
	public static String Token;

	public static void main(final String[] args) throws Exception {
		try {
			final File token = new File("token.txt");
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(token));
            String strings = "";
            while ((strings = bufferedReader.readLine()) != null) {
                Main.Token = strings;
            }
            System.out.println("Token installed!");
		}catch(IOException e){
			System.out.println("Token not found!");
		}
		final JDA jda = JDABuilder.createDefault(Token)
				.setActivity(Activity.playing("Bounce 2000"))
				.setStatus(OnlineStatus.IDLE)
				.build();
		
		jda.addEventListener(new BotHelper());
		System.out.println(Rainbow.green("Loaded BotHelper"));
		
		
		System.out.println(Rainbow.green("HUB Online!"));
	}
}
