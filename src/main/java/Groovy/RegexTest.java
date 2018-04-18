package Groovy;
import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexpTest {
    private final String REGEXP_DATE = "(\\d+/)(\\d+/)(\\d+)";

    public void regularDate() {
        String page = getHtmlPage();
        Pattern pattern = Pattern.compile(REGEXP_DATE, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(page);
        if(matcher.find()){
            String date = matcher.group();
            System.out.print(String.format("Page contains date = %s", date));
        }


    }

    private String getHtmlPage(){
        return "sadasdasdasd<td>13/04/2018</td>sdasdasdasd";
    }
}
