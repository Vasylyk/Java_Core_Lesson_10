package task3;

public class Counter {
    private String text = "Wikipedia is a multilingual online encyclopedia " +
            "created and maintained as an open collaboration project by a community of volunteer " +
            "editors using a wiki-based editing system. It is the largest and most popular general" +
            " reference work on the World Wide Web, and is one of the most popular websites ranked" +
            " by Alexa as of October 2019. It features exclusively free content and no commercial ads," +
            " and is owned and supported by the Wikimedia Foundation, a non-profit organization funded" +
            " primarily through donations.";
    private int counter;

    void counter(){
        String words[]=text.split(" ");
        for (int i = 0; i <words.length ; i++) {
            if (words[i].length()>=3){
                counter++;
            }
        }
        System.out.println(text);
        System.out.println("Number of words in text:");
        System.out.println(counter);
    }
}
