/**
 * Created by josunghwan on 15. 7. 20..
 */

class TestCaseTest(override var name: String):TestCase(name){
    var test: WasRun = null as WasRun
    var result: TestResult = null as TestResult
    override fun setUp(){
        this.test = WasRun("testMethod")
        this.result = TestResult()
    }

    fun testTemplateMethod(){
        test = WasRun("testMethod")
        test.run(result)
        println("setUp testMethod tearDown " == test.log)
    }

    fun testResult(){
        test = WasRun("testMethod")
        result.testFailed()
        test.run(result)
        println("1 run, 1 failed" == result.summary())
    }

    fun testFailedResultFormatting(){
        result.testStarted()
        result.testFailed()
        println("1 run, 1 failed" == result.summary())
    }

    fun testSuite(){
        var suite = TestSuite()
        suite.add(WasRun("testMethod"))
        suite.add(WasRun("testBrokenMethod"))
        suite.run(result)
        println("2 run, 1 failed" == result.summary())
    }
}