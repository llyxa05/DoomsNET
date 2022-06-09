package ua.DOOMSBOT.commands.Misc;

import net.dv8tion.jda.api.hooks.*;
import net.dv8tion.jda.api.events.message.*;
import java.awt.*;
import net.dv8tion.jda.api.*;
import java.util.*;
import net.dv8tion.jda.api.entities.*;

public class BotHelper extends ListenerAdapter
{
    @Override
    public void onMessageReceived(final MessageReceivedEvent event) {
        final Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.BLACK, Color.MAGENTA, Color.ORANGE, Color.YELLOW };
        final Message msg = event.getMessage();
        final Guild guild = event.getGuild();
        final MessageChannel channel = event.getChannel();
        final EmbedBuilder eb = new EmbedBuilder();
        final Random random = new Random();
        final int index = random.nextInt(colors.length);
        if (msg.getContentRaw().equals("*help")) {
        	if(msg.getChannel() != null) {
                eb.setTitle("Help Commands");
                eb.addField("Main Commands", "*hrip <url> -> HttpFlood attack \n *badp <ip:port> -> BadPackets attack \n *bjoin <ip:port> -> BotJoiner attack (1.12.2)", true);
                eb.addField("Misc Commands", "*rs -> check response of zombies \n *upd -> update proxy.txt \n *stat -> zombies MEM statistic \n *rzombie -> reload zombiservers", true);
                eb.setColor(colors[index]);
                channel.sendMessageEmbeds(eb.build(), new MessageEmbed[0]).queue();
        	}
    	}
    }
}
