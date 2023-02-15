package Who.likes.it;

public class LikeIt {

    public String whoLikesIt(String... names) {

        int others = names.length - 2;

        if(names.length==0) return "no one likes this";
        if(names.length==1) return names[0] + " likes this";
        if(names.length==2) return names[0] + " and " + names[1] + " like this";
        if(names.length==3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";

        return names[0] + ", " + names[1] + " and " + others + " others like this";

    }

    public String likesIt(String... names) {
        int others = names.length - 2;
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return names[0] + " likes this";
            case 2: return names[0] + " and " + names[1] + " like this";
            case 3: return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default: return names[0] + ", " + names[1] + " and " + others + " others like this";
        }
    }


}
