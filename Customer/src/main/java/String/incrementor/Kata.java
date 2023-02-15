package String.incrementor;

public class Kata {

    public String incrementString(String str) {
        int number = 0;
        String clean = null;
        if (str.replaceAll("\\D+", "").equals("")) {
            number = 0;
            clean = str;
        } else {
            number = Integer.parseInt(str.replaceAll("\\D+", ""));
            clean = str.substring(0, str.indexOf(String.valueOf(number)));
        }
        System.out.println(number );

        return clean.concat(String.valueOf(number + 1));
    }
}
