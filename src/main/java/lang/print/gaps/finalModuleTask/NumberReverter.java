package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
//        System.out.println("number = " + number);
        int n = (number % 10) *100;
        number = number / 10;
//        System.out.println("n = " + n + " number = " + number);
        n = n + (number % 10) * 10;
        number = number / 10;
//        System.out.println("n = " + n + " number = " + number);
        n = n + number;
//        System.out.println("n = " + n + " number = " + number);

        System.out.println(n);
    }
}
