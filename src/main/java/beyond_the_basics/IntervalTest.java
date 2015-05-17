package beyond_the_basics;

import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * Created by takam on 2015/05/17.
 */
public class IntervalTest {
    public static void main(String[] args) {
        Observable
                .interval(100, TimeUnit.MILLISECONDS)
                .doOnNext(l -> System.out.println("next:" + l))
                .takeUntil(Observable.timer(1, TimeUnit.SECONDS))
                .subscribeOn(Schedulers.io())
                .subscribe(s ->
                                System.out.println(s),
                        e ->
                                e.printStackTrace()
                        ,
                        () -> System.out.println("completed")
                );
        Observable
                .interval(100, TimeUnit.MILLISECONDS)
                .doOnNext(l -> System.out.println("next:" + l))
                .lift(new OperatorSubscribeUtil takeUntil(Observable.timer(1, TimeUnit.SECONDS))
                        .subscribeOn(Schedulers.io())
                        .subscribe(s ->
                                        System.out.println(s),
                                e ->
                                        e.printStackTrace()
                                ,
                                () -> System.out.println("completed")
                        );
        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
