package I_Basics;

//Private is only available in the scope of the class, ie inside the class.
//Public is available from everywhere in the project.

class PublicVsPrivate {
    private String pvtWord = "Private";
    public String pubWord = "Public";
}

public class III_PublicVsPrivate {
    public static void main(String[] args) {
        PublicVsPrivate a = new PublicVsPrivate();
        System.out.println(a.pubWord);
        //This will throw error as pvtWord is private
        //System.out.println(a.pvtWord);
    }
}
