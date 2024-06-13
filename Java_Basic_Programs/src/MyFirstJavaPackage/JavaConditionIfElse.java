package MyFirstJavaPackage;

public class JavaConditionIfElse {

    public void JavaCondition() {
        
        String Gender = "Female";
        String GenderName = "Maria";
    
        if (Gender =="Female") {

            System.out.println("\nShe is a Female.");

            if (GenderName == "Maria") {
                System.out.println("Her name is Maria.");
            } else {
                System.out.println("\n She is Female but her name is not Maria.");
            }

        } else if (Gender == "") {

            System.out.println("\nPlease provide the Gender name.");

        } else {

            System.out.println("\nHe is not a Female.");

        }
    }

}
