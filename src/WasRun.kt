import java.lang.reflect.Method

/**
 * Created by josunghwan on 15. 7. 20..
 */

class WasRun(override var name: String) : TestCase(name) {
    var wasRun: Boolean = false
    var wasSetUp: Boolean = false
    var log: String = ""

    fun testMethod() {
        wasRun = true
        log += "testMethod "
    }

    fun testBrokenMethod(){
        throw Exception()
    }

    override fun setUp() {
        super<TestCase>.setUp()
        wasSetUp = true
        log = "setUp "
    }

    override fun tearDown(){
        log += "tearDown "
    }
}