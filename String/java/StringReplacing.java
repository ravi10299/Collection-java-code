package String.java;

public class StringReplacing {
    public static void main(String[] args) {
        //this is the original String initialisation
        String college = "college name is ";
        //String updated
        String OldName = "utter pradesh technical university";
        //String update
        String NewName = " Dr. APJ Abdul kalam technical university";

        // this is the replacing the old String to new String using by the REPLACES methods in java
        String NewCollegeName = OldName.replace(OldName,NewName);
        System.out.println(college + NewCollegeName);
    }
}
