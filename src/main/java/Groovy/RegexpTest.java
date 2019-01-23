package Groovy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegexpTest {
     final String REGEXP_DATE = "\"([^\"]+)\"";
     final String MACRO_NAME_PATTERN = "<ac:structured-macro ac:name=";

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
        return "<p><ac:structured-macro ac:name=\"create-from-template\" ac:schema-version=\"1\" ac:macro-id=\"ed9f17c4-1aaf-46e2-9640-787149ce6828\"><ac:parameter ac:name=\"templateName\">511082499</ac:parameter><ac:parameter ac:name=\"templateId\">511082499</ac:parameter><ac:parameter ac:name=\"buttonLabel\">Offering Catalog</ac:parameter></ac:structured-macro></p><p><br /></p><ac:structured-macro ac:name=\"vote\" ac:schema-version=\"1\" ac:macro-id=\"e635f005-9e9c-4e41-b8c8-f7eea4c87564\"><ac:parameter ac:name=\"renderTitleLevel\">4</ac:parameter><ac:parameter ac:name=\"title\">Which option is better?</ac:parameter><ac:parameter ac:name=\"showComments\">true</ac:parameter><ac:plain-text-body><![CDATA[#Form 1\n" +
                "#Form 2\n" +
                "\n" +
                "]]></ac:plain-text-body></ac:structured-macro><p class=\"auto-cursor-target\"><br /></p><p><br /></p><p><ac:image ac:height=\"250\"><ri:attachment ri:filename=\"макет создания страниц.png\" /></ac:image></p><ac:structured-macro ac:name=\"page-update-notifier-macro\" ac:schema-version=\"1\" ac:macro-id=\"a4eff2ca-f21b-40f2-a07d-52a14c2ad407\"><ac:plain-text-body><![CDATA[kseniia.labyskina@netcracker.com]]></ac:plain-text-body></ac:structured-macro><p class=\"auto-cursor-target\"><br /></p>";
    }
}




//    string str = "set vrouter \"Trust-Gi\"";
//    string pattern = "set vrouter \"([^\"]+)\"";
//    Match match = Regex.Match(str, pattern);
//
//    <ac:structured-macro ac:name=\"([^\"]+)\"


//import groovy.transform.TimedInterrupt
//        import java.util.concurrent.TimeUnit
//        import com.atlassian.confluence.security.ContentPermission
//        import com.atlassian.sal.api.transaction.TransactionCallback
//
//        transactionTemplate.execute(new TransactionCallback() {
//        String outputString ="";

//@Override
//
//public Object doInTransaction() {
//        def findWord = '<ac:structured-macro ac:name=' ;
//        String spaceIds = "TEST";
//        String[] ids = spaceIds.split(",");
//        String res = "";
//        for (String id : ids){
//        Space space = spaceManager.getSpace(id);
//        List<Page> pages = pageManager.getPages(space, true);
//        for (Page page : pages) {
//        if (page.getBodyAsString().contains(findWord)) {
//        outputString = outputString+ "Space Key :: "+page.getSpaceKey()+" | Page Title :: "+page.getTitle()+" | Link to Page :: "+settingsManager.getGlobalSettings().getBaseUrl()+page.getUrlPath()+"\n";
//        //  res += page.getUrlPath() + ";";
//
//        }
//        }
//        }
//        return outputString;
//        }
//        });