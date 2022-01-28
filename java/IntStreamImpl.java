import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class IntStreamImpl {
    public static void main(String[] args) {
        IntStream.range(1,20).forEach(System.out::print);//1-19 ignore 20.
        IntStream.range(1,20).skip(10).forEach(System.out::print);// value from 1-10 are ignore as well as 20.
        System.out.println(IntStream.range(1,20).sum());//190
        IntStream.concat(IntStream.range(1,20).skip(10),IntStream.range(1,20).filter(i->i%2==0)).forEach(System.out::print);//11121314151617181924681012141618
        IntStream stream = IntStream.generate(() -> (int) (Math.random() * 1000)) .limit(5);
        stream.forEach(System.out::println);//will generate random 3 digit numbers
        PrimitiveIterator.OfInt answer=IntStream.of(1,2, 6,7,8,9,5,10).iterator();
        while(answer.hasNext()){
            System.out.print(answer.nextInt()+" ");//1 2 6 7 8 9 5 10
        }
    }
}

