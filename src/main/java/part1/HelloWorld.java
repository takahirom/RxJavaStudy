package part1;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPoolManager;
import rx.Observable;
import rx.Subscriber;

import java.util.concurrent.*;

/**
 * Created by takam on 2015/04/19.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Observable<String> myObservable = Observable.create(
                new Observable.OnSubscribe<String>() {
                    @Override
                    public void call(Subscriber<? super String> sub) {
                        sub.onNext("Hello, world!");
                        sub.onCompleted();
                    }
                }
        );

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) { System.out.println(s); }

            @Override
            public void onCompleted() { }

            @Override
            public void onError(Throwable e) { }
        };

        myObservable.subscribe(mySubscriber);
    }
}
