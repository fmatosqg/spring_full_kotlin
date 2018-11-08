package au.com.andrea.spring.boilerplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(basePackages = arrayOf<String>("au.com.andrea.spring"))
class Application {

}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
