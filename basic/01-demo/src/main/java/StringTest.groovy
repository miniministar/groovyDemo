/**
 * @date ：Created in 2021/6/29 11:31
 */
class StringTest {
    static void main(String[] args) {
        String a = '单引号内的字符串';
        String b = "双引号内的字符串";
        String c = """三引号内的字符串
    这个可以换行
    
    。
""";
        println(a);
        println(b);
        println(c);

        String d = "hello world";
        println(d[4])
        println(d[-1])
        println(d[1..2])
        println(d[4..2])

    }
}
