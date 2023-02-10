package gen.oxy;

public class HelloWorld {

    public static void main(String[] args) {
        String helloWorldString = "мир";

        if (helloWorldString != null
                && helloWorldString.length() == 3) {
            System.out.println("Строка из 3х символов: "+ helloWorldString);
        }
        else {
            System.out.println("Не сработало, потому что длина слова: "+ helloWorldString + " " + helloWorldString.length());
        }



        boolean flag = true;
        byte aByte; // 16bit diaposone -(2^7) / 2^7-1
        short aShort; // 32
        int aInt; // 64 //must have
        long aLong; // 128
        float aFloat; //32 bit
        double aDouble; // 64 bit число с плавающей точкой, не целые значения (0.0)
        char aChar = 'h'; //записать только 1 символ можно

        //Операторы математический + - / * %
        //Операторы условий <>, <=, >=, ==, !=, !()
        //Операторы логические && - и, || - или
        int aa = 10;
        int bb = 15;



    }
}
