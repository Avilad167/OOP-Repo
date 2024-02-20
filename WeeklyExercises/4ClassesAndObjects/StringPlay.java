public class StringPlay {
    public static void main(String[] args){
        String college = new String("Leeds Beckett University");
        String town = new String(" Plymouth, UK");
        int stringLength;
        String change1, change2, change3;
         stringLength = college.length();
        System.out.println(college +  "contains" +  stringLength  + "characters.");
        change1 = college.toUpperCase();
        change2 = change1.toLowerCase();
        change3 = change1 + change2;
        System.out.println("The Final string is: " + change3);
    }
}
