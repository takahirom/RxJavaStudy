package part1;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by takam on 2015/04/19.
 */
public class SimpleHelloWorld {
    public static void main(String[] args) {
        Observable.just("Hello, world!")
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });
    }
}
