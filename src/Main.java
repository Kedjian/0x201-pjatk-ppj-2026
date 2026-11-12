void main() {
    exercise5();
}

void exercise1() {

    // I. Create a program that displays the following literals:
    //     - 124
    //     - 13.5
    //     - 16.4f
    //     - 15000001
    //     - 1_234_567_789
    //     - 'a'
    //     - true

    int a = 124;
    double b = 13.5;
    float c = 16.4f;
    float d = 1500000L;
    char e = 'a';
    boolean f = true;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
}

void exercise2() {

    // II. Create a program in which you enter the value 13 using a literal:
    //     - decimal
    //     - binary
    //     - octal
    //     - hexadecimal
    // Then print all the values to the screen and check whether they are equal to each other.

    int dec = 13;

    String binary = Integer.toBinaryString(dec);
    System.out.println("Binary number: " + binary);

    String octal = Integer.toOctalString(dec);
    System.out.println("Octal number: " + octal);

    String hexadecimal = Integer.toHexString(dec);
    System.out.println("Hexadecimal number: " + hexadecimal);
}

void exercise3() {

    // III. Create a program that calculates and displays the result of the operation:
    //     145 + 34 * 28 + 250 - 56 / 7 * 2 - 3567 % 89

    float result = 145 + 34 * 28 + 250 - (float) 56 / 7 * 2 - 3567 % 89;
    System.out.println(result);
}

void exercise4() {

    // VI. Create a program that displays the result of the operations:
    //     - 10 / 3
    //     - 10d / 3d
    //     - 10.0 / 3.0
    //     - 10 % 3

    System.out.println(10 / 3);
    System.out.println(10d / 3d);
    System.out.println(10.0 / 3.0);
    System.out.println(10 % 3);
}

void exercise5() {

    // V. Create a program that displays the result of operations performed on two character literals:
    //     - 'z' - '!'
    //     - 'a' + 'b'
    //     - '!' * 3

    int input1 = 'a';
    int input2 = '!';
    int input3 = 'b';

    int result1 = input1 - input2;
    int result2 = input1 + input3;
    int result3 = input2 * 3;

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
}

void exercise6() {

    // VI. Write a program in which you declare a variable of type int named wrt,
    //     and then assign the value 13 to it.

    int wrt;
    wrt = 13;
}

void exercise7() {

}
