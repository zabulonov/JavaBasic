public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean containsJava = str.contains("Java");
        boolean startsWithILike = str.startsWith("I like");
        boolean endsWithExclamations = str.endsWith("!!!");

        if (containsJava && startsWithILike && endsWithExclamations) {
            String upperStr = str.toUpperCase();
            System.out.println(upperStr);
        }

        String replacedStr = str.replace('a', 'o');
        String substringJovo = replacedStr.substring(replacedStr.indexOf("Jovo"), replacedStr.indexOf("Jovo") + 4);
        System.out.println(substringJovo);
    }
}
