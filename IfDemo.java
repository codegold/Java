class IfDemo{

public static void main(String[]args){
    int a, b, c;
    a = 2; b = 3;

    if  (a < b) System.out.println("a lower than b.");
    if (a == b) System.out.println("You'll don't ever see this!");

    System.out.println();

    c = a - b; // c contains -1

    System.out.println("C contains -1");
    if(c >= 0) System.out.println("C is positive.");
    if(c < 0) System.out.println("C - is negative. ");

    System.out.println();

    c = (b - a);
    System.out.println("C contains now " + c);
}

        }


