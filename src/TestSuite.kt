import java.util.*

/**
 * Created by josunghwan on 15. 7. 21..
 */
class TestSuite() {
    var tests = ArrayList<TestCase>()

    fun run(result: TestResult){
        for (test in this.tests) {
            test.run(result)
        }
    }

    fun add(test: TestCase){
        tests.add(test)
    }
}