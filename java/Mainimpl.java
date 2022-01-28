import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mainimpl {
    public static int compareByName(Person a , Person b){
        return a.getName().compareTo(b.getName());
    }
    public static int comapreByAge(Person a ,Person b){return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(21 , "Ali"));
        list.add(new Person(22 , "Ali ybbas"));
        list.add(new Person(23 , "sli Rehman"));
        Collections.sort(list , Mainimpl::compareByName);
        System.out.println(list.get(1).getName());
        list.stream().map(x->x.getName()).forEach(System.out::println);
        System.out.println(list.stream().filter(s-> s.getName().startsWith("s")).count());
        List<String> xyz = new ArrayList<>();
        List<String> abc = new ArrayList<>();
        abc.add("ali ");
        abc.add("Happy ");
        abc.add("zoro ");
        abc.add("sam ");
        abc.stream().filter(s-> s.startsWith("s"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        abc.stream().sorted()
                .forEach(System.out::print);//Happy,ali,sam,zero
        System.out.println();
        abc.stream().sorted().collect(Collectors.toList());//ali,Happy,zoro,sam
       xyz=abc.stream().sorted().collect(Collectors.toList());//and extra list is required to store the sorted data
       xyz.forEach(System.out::print);

       List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list1.add(i);
        }
      int even= list1.stream().filter(value -> value%2==0).reduce(0,(a,b)-> a+b);
        System.out.println(even);//20 as it will reduce the output to single value ...intially a = 0 , then b will be added to a.
        System.out.println(abc.stream().reduce((s,b)->s+"*"+b));// Example for reduce method adding all the string into one string. Output: Optional[ali *Happy *zoro *sam ]



//Here creating a parallel stream
        Stream<Integer> stream = list1.parallelStream();
         stream.filter(i -> i%2 == 0).forEach(System.out::print);//6428 because the the stream is running parellel.
        System.out.println();

        Stream<Integer> stream1 = list1.stream();
        stream1.filter(i -> i%2 == 0).forEach(System.out::print);//2468 because the stream is sequential.






    }
}
