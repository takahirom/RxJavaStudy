package part1;

import rx.Observable;

/**
 * Created by takam on 2015/04/19.
 */
public class TransformationHelloWorld {
    public static void main(String[] args) {
        Observable.just("Hello, world! -Dan")
                .subscribe((s)-> System.out.println(s));
        Observable.just("Hello, world!")
                .subscribe((s) -> System.out.println(s + " -Dan"));
    }
}
