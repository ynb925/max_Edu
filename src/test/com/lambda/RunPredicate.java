package test.com.lambda;

public class RunPredicate {
    public static void main(String[] args) {
        MyPredicate<Integer> myPredicate = x -> x >= 100;

        System.out.println(myPredicate.test(90));
        System.out.println(myPredicate.test(111));

    }
}
