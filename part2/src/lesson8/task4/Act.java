package lesson8.task4;

class Act {
    private String numb;
    private String date;
    private String[] tovar;

    void setNumb(String numb) {
        this.numb = numb;
    }

    void setDate(String date) {
        this.date = date;
    }

    void setTovar(String[] tovar) {
        this.tovar = tovar;
    }

    String getNumb() {
        return numb;
    }

    String getDate() {
        return date;
    }

    String[] getTovar() {
        return tovar;
    }
}
