package maskify;

public class Maskify {

    public String maskify(String str) {

        if(str.length()<=4) return str;

        String mask = "";
        for (int i=0; i < str.length()-4; i++) {
            mask += "#";
        }
        mask += str.substring(str.length()-4);
        return mask;
    }

    public String maskifyTwo(String str) {

        if(str.length()<=4) return str;

        return "#".repeat(str.length() - 4) +
                str.substring(str.length() - 4);
    }
}
