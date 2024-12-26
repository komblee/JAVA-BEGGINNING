
public class Main {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        int add1 = add(17, 9);
        int sub1 = sub(17, 9);
        int add2 = add(14, 9);
        int sub2 = sub(14, 9);
        int[] addresults = {add1, add2,};
        int[] subresults = {sub1, sub2,};
        System.out.println("addresults :");
        for (int result : addresults) {
            if (result % 2 == 0) {
                System.out.println("even" + result);
            } else {
                System.out.println("odd" + result);

            }
        }
        System.out.println("subresults :");
        for (int result : subresults) {
            if (result % 2 == 0) {
                System.out.println("even" + result);
            }else{
                System.out.println("odd" + result);


            }
        }
        int i = 0;
        while (i < addresults.length) {
            if (addresults[i] % 2 == 0) {
                System.out.print("even " + addresults[i]);

            } else {
                System.out.println(" odd " + addresults[i]);
            }
            i++;
        }
    }
}