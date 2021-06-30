package groovy

import com.exercise.groovy.HelloService

class HelloServiceImp implements HelloService {
    String name;

    @Override
    String sayHello() {
        return "hello $name. welcome to resource in groovy";
    }
}
