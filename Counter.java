package ua.lviv.iot;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Counter {
    private static final String PATTERN_REGEXP = "[^aeiouAIEUO\\W]";
    private static final String EXCLAMATORY = "[^!?]+!";

    public int amountConsonant(String txt) {
        int amount = 0;
        Pattern p = Pattern.compile(PATTERN_REGEXP);
        Matcher m = p.matcher(txt);
        while (m.find()){
            amount++;
        }
        System.out.println("amount of consonants:"+amount);
        return amount;

    }
    public String searchExclamatory(String txt) {
        txt = "." + txt;
        txt = txt.replaceAll("\\.", "?");
        Pattern pattern = Pattern.compile(EXCLAMATORY);
        Matcher matcher = pattern.matcher(txt);
        List<String> questionSentence = new ArrayList<>();
        while (matcher.find())
        {
            questionSentence.add(matcher.group());
        }
        return questionSentence.toString();

    }
}
