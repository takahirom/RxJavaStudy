package part1;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by takam on 2015/04/19.
 */
public class LambdaHelloWorld {
    public static void main(String[] args) {
        Observable.just("Hello, world!")
                .subscribe((s)-> System.out.println(s));
    }
}
