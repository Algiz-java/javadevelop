package lesson6;

class SellerName {
    private String[] name = {"Елена", "Оксана", "Валентина", "Ирина", "Наталья", "Ксения"};
    private String[] lastName = {"Иванова", "Петрова", "Николаева", "Сергеева", "Семенова", "Козлова"};

    String getName(int i) {
        return name[i];
    }

    String getLastName(int i) {
        return lastName[i];
    }
}
