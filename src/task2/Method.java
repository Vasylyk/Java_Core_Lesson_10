package task2;

public class Method {
    private String text = "Wikipedia is a multilingual online encyclopedia " +
            "created and maintained as an open collaboration project by a community of volunteer " +
            "editors using a wiki-based editing system. It is the largest and most popular general" +
            " reference work on the World Wide Web, and is one of the most popular websites ranked" +
            " by Alexa as of October 2019. It features exclusively free content and no commercial ads," +
            " and is owned and supported by the Wikimedia Foundation, a non-profit organization funded" +
            " primarily through donations.";
    private String  a="-";
    private StringBuffer finalText = new StringBuffer();

    void replace(){
        String textLetters[]=text.split("");
        for (int i = 0; i <textLetters.length ; i++) {
            if (textLetters[i].equalsIgnoreCase("a")||textLetters[i].equalsIgnoreCase("e")
                    ||textLetters[i].equalsIgnoreCase("i")||textLetters[i].equalsIgnoreCase("o")
                    ||textLetters[i].equalsIgnoreCase("u")||textLetters[i].equalsIgnoreCase("y")
                    ||textLetters[i].equalsIgnoreCase("a")){
                finalText.append(a);
            } else {
                finalText.append(textLetters[i]);
            }
        }
        System.out.println(text);
        System.out.println(finalText);
    }
}
