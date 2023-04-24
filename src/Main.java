
public class Main {
    public static void main(String [] args) {
        System.out.println("Завдання 1: ENUM");
        for (CardRank cards : CardRank.values()) {
            System.out.println(cards +" "+cards.getNumber());
        }
        System.out.println();
        System.out.println("Завдання 2: String methods");
        sentence();
        System.out.println();
        System.out.println("Завдання 3: StringBuilder");
        builder();
    }

    enum CardRank {
        ACE (1),
        TWO (2),
        THREE (3),
        FOUR (4),
        FIVE (5),
        SIX (6),
        SEVEN (7),
        EIGHT (8),
        NINE (9),
        TEN (10),
        JACK (11),
        QUEEN (12),
        KING (13);

        private final int number;
        CardRank (int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public static void sentence() {
        String startingSentence = "I would like to have a dog";
        String sentenceCaseOk = startingSentence.toLowerCase();

        char [] chars = sentenceCaseOk.toCharArray();
        int counter = 0;

        //Порахуйте загальну кількість голосних (a, e, i, o, u) у рядку.

        for (int i = 0; i< chars.length; i++) {
            if (chars[i]=='a'|| chars[i]=='e'|| chars[i]=='i' || chars[i]=='o' ||chars[i]=='u') {
                counter++;
            }
        }
        System.out.println("Загальна кількість голосних у рядку: " + counter);

        //Розділіть рядок на масив слів за допомогою пробілу як роздільника.
        System.out.println();
        System.out.println("Масив слів:");
        String [] wordsArray = startingSentence.split(" ");
        for (String pr : wordsArray) {
            System.out.println(pr);
        }

        // Витягніть перший символ першого слова та виведіть його на консоль.
        System.out.println();
        System.out.println("Перший символ першого слова: "+startingSentence.charAt(0));

        // Замініть всі входження слова "dog" на "cat" у рядку.
        System.out.println();
        // String newSentence = startingSentence.replace("dog", "cat");
        System.out.println("Cat замість dog: "+startingSentence.replace("dog", "cat"));
    }

    public static void builder() {

        String startingSentence = "I would like to have a dog";
        String [] sentenceSplited = startingSentence.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i < sentenceSplited.length; i++) {
            stringBuilder.append(sentenceSplited[i]);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder.toString().toUpperCase());
    }
}
