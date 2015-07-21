import java.lang.reflect.Method

/**
 * Created by josunghwan on 15. 7. 20..
 */
open class TestCase(open var name: String) {
    open fun run(result: TestResult) {
        result.testStarted()
        setUp()
        try {
            var method: Method = this.javaClass.getMethod(name)
            method.invoke(this)
        } catch(e: Exception) {
            result.testFailed()
        }
        tearDown()
    }

    open fun setUp() {

    }

    open fun tearDown() {

    }
}