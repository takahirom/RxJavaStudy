package part1;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by takam on 2015/04/23.
 */
public class OperatorHelloWorld {
    public static void main(String[] args){
        Observable.just("Hello, world!")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + " -Dan";
                    }
                })
                .subscribe(s -> System.out.println(s));
    }
}
