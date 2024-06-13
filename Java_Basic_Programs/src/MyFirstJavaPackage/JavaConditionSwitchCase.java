package MyFirstJavaPackage;

public class JavaConditionSwitchCase {

    public void SwitchCaseJavaCondition() {

        
        float y = 15; // switch সুইচ কেচের মধ্যে দিয়ে দশমিক যুক্ত নাম্বার দিয়ে কন্ডিশন করা যায় না।
        double yy = 15.5; // switch সুইচ কেচের মধ্যে দশমিক যুক্ত নাম্বার দিয়ে কন্ডিশন করা যায় না। 
        
        int x = 50; // ok
        char Character = 'A'; // ok 
        switch (x) {
            
            case 10 + 4 - 5:
                System.out.println("No");
                break;

            case 50:
                System.out.println("Ok................h");
                break;

            case 60:
                System.out.println("No");
                break;

            default:
                System.out.println("Please input valid number");
        };

    }
}




// case x = 5: // এখানে x এর সাথে চ্যাক করা যাবে না, কারন x একটি পিক্সড ভ্যালু;
// System.out.println("No");
// break;

// case 4 > 50: // এখানে কোন কোনডিশ বা রেঞ্জ দেওয়া যাবে না
// System.out.println("No");
// break;

// case 3: // এক সাথে দুটো কেস দেওয়া যাবে না।
// System.out.println("No");
// break;
// case 3: // এক সাথে দুটো কেস দেওয়া যাবে না। 
// System.out.println("No");
// break;

// switch (Chartor){ // একটা সুইচ কেচের মধ্যে আরেকটা সুইচ কেস লেখা যায় না। 
//     case 'A':
//     System.out.println("ok");
// }