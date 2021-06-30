/**
 * @date ：Created in 2021/6/29 11:10
 */
class DataTypeTest {
    static void main(String[] args) {
        int x = 5;
        long y = 100L;
        float a = 10.1f;
        double b = 10.56e40;
        BigInteger bi = 30g;
        BigDecimal bd = 3.5g;
        println(x);
        println(y);
        println(a);
        println(b);
        println(bi);
        println(bd);

        def list1 = [];
        list1.add("a");
        list1.add("b");
        def list2 = [100, 101, 102]
        list2[1] = ['c', 'd']
        println(list1)
        println(list2)

        def map1 = ['name':'张三', age: 10];
        println(map1)

        Date date = new Date();
        println(date)
        println(date.toString())
    }
}
