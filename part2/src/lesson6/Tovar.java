package lesson6;

import java.util.Random;

class Tovar {
        private String[] order = {"Ручка", "Шоколад", "Хлеб", "Молоко", "Пиво", "Сок", "Мороженое", "Рыба", "Чипсы",
                "Кефир", "Печенье", "Вино", "Сыр", "Карандаш", "Салфетки", "Мыло"};
        private Random random = new Random();
        private int z = random.nextInt(16);
        String ObjectName = order[z];
}