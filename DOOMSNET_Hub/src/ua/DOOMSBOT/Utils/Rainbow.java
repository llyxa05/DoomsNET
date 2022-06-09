package ua.DOOMSBOT.Utils;

public class Rainbow
{
    private static final String RESET = "\u001b[0m";
    private static final String COLOR_BLACK = "\u001b[30m";
    private static final String COLOR_RED = "\u001b[31m";
    private static final String COLOR_GREEN = "\u001b[32m";
    private static final String COLOR_YELLOW = "\u001b[33m";
    private static final String COLOR_BLUE = "\u001b[34m";
    private static final String COLOR_PURPLE = "\u001b[35m";
    private static final String COLOR_CYAN = "\u001b[36m";
    private static final String COLOR_WHITE = "\u001b[37m";
    private static final String BOLD = "\u001b[1m";
    private static final String DIM = "\u001b[2m";
    private static final String ITALIC = "\u001b[3m";
    private static final String UNDERLINE = "\u001b[4m";
    private static final String BLINK = "\u001b[5m";
    private static final String LIGHTEN = "\u001b[6m";
    private static final String INVERTED = "\u001b[7m";
    private static final String HIDDEN = "\u001b[8m";
    
    public static String bold(final String string) {
        return "\u001b[1m" + string + "\u001b[0m";
    }
    
    public static String dim(final String string) {
        return "\u001b[2m" + string + "\u001b[0m";
    }
    
    public static String italic(final String string) {
        return "\u001b[3m" + string + "\u001b[0m";
    }
    
    public static String underline(final String string) {
        return "\u001b[4m" + string + "\u001b[0m";
    }
    
    public static String blink(final String string) {
        return "\u001b[5m" + string + "\u001b[0m";
    }
    
    public static String lighten(final String string) {
        return "\u001b[6m" + string + "\u001b[0m";
    }
    
    public static String inverted(final String string) {
        return "\u001b[7m" + string + "\u001b[0m";
    }
    
    public static String hidden(final String string) {
        return "\u001b[8m" + string + "\u001b[0m";
    }
    
    public static String black(final String string) {
        return "\u001b[30m" + string + "\u001b[0m";
    }
    
    public static String red(final String string) {
        return "\u001b[31m" + string + "\u001b[0m";
    }
    
    public static String green(final String string) {
        return "\u001b[32m" + string + "\u001b[0m";
    }
    
    public static String yellow(final String string) {
        return "\u001b[33m" + string + "\u001b[0m";
    }
    
    public static String blue(final String string) {
        return "\u001b[34m" + string + "\u001b[0m";
    }
    
    public static String purple(final String string) {
        return "\u001b[35m" + string + "\u001b[0m";
    }
    
    public static String cyan(final String string) {
        return "\u001b[36m" + string + "\u001b[0m";
    }
    
    public static String white(final String string) {
        return "\u001b[37m" + string + "\u001b[0m";
    }
    
    public static String rainbow(final String string) {
        String res = "";
        final String[] rainbow_Colors = { "\u001b[31m", "\u001b[33m", "\u001b[32m", "\u001b[36m", "\u001b[34m", "\u001b[35m" };
        final char[] cont = string.toCharArray();
        for (int i = 0; i < string.length(); ++i) {
            final int color = i % rainbow_Colors.length;
            res = String.valueOf(res) + rainbow_Colors[color] + cont[i];
        }
        return res;
    }
}