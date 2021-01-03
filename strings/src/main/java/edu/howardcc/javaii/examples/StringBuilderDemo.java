package edu.howardcc.javaii.examples;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        System.out.printf("stringBuilder.length(): %d\n" +
                        "stringBuilder.capacity(): %d\n",
                        stringBuilder.length(),
                        stringBuilder.capacity());

        stringBuilder.append("A B C D E F G ");
        stringBuilder.append("H I J K ");
        stringBuilder.append("L M N O P ");
        stringBuilder.append("Q R S T U V");
        stringBuilder.append("W X Y and Z");
        stringBuilder.append("Now I know my A B C's ");
        stringBuilder.append("Next time won't you sing with me?");

        String songString = stringBuilder.toString();
        System.out.println(songString);

        System.out.printf("stringBuilder.length(): %d\n" +
                        "stringBuilder.capacity(): %d\n",
                        stringBuilder.length(),
                        stringBuilder.capacity());

    }
}
