package MyFirstJavaPackage;

public class DataTypeAndVariables {

    public void JavaDataType() {
        // যে কোন ভ্যরিয়েবল শুরু করার আগে ভ্যারিয়েবলের ডাটা টাইপ বলে দিতে হবে।
        String AnyString = "any string, যে কোন অক্ষর"; // ? Bytes . যে কোন অক্ষর বর্ণ লিখা যায়।
        char AnyCharacter = 456; // 2 Bytes . যে কোন অক্ষর বা নাম্বার, যেমন ৪৫৬
        int AnyNumber = 450; // 4 Bytes . যে কোন নাম্বার, যেমন 5680
        long AnyLongNumber = 958978556; // 8 Bytes . অনেক বড় নাম্বার, যার জন্য ৮ বাইট যায়গা নিবে।
        float FloatNumber = 506; // 4 Bytes . দশমিক যুক্ত নাম্বার, যেমন 11.50
        double FloatLongNumber = 56.50456987; // 8 Bytes . বড় দশমিক যুক্ত নামার
        boolean TrueOrFalse = true; // 1 Bytes . সত্য মিথ্যা, যেমনঃ true false

        System.out.print("String = " + AnyString + "\n char = " + AnyCharacter + " \n int = " + AnyNumber + "\n long = "
                + AnyLongNumber + " \n float = " + FloatNumber + "\n double = " + FloatLongNumber + "\n boolean = "
                + TrueOrFalse);
    }

}
