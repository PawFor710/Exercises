package String.ends.with;

public class EndsWith {

    public boolean endsWith(String str, String ending) {

        if (str.length()<ending.length()) return false;
        return str.substring(str.length() - ending.length()).equals(ending);
    }

    public boolean endsWith2(String str, String ending) {

        return str.endsWith(ending);
    }
}
