package lesson11;

class Change {
    String word;
    private String[] template = {"\\sбяка", "\\sбяка\\s", "бяка\\s", "бяка.*", "\\sбяка.*"};
    int i;
    void change() {
        System.out.println(word.replaceAll(template[i], " вырезано цензурой "));
    }
}
