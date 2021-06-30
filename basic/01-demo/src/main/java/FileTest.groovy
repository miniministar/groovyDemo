/**
 * @date ：Created in 2021/6/29 11:50
 */
class FileTest {
    static void main(String[] args) {
        new File("D:\\test\\groovy\\example.txt").withWriter("utf-8"){
            writer -> writer.writeLine("hello world")
        }
        new File("D:/test/groovy", 'example.txt').eachLine {
            line -> println "line: $line";
        }
    }
}
