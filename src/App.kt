/**
 * Created by josunghwan on 15. 7. 20..
 */

fun main(args: Array<String>) {

    var suite = TestSuite()
    suite.add(TestCaseTest("testTemplateMethod"))
    suite.add(TestCaseTest("testResult"))
    suite.add(TestCaseTest("testFailedResultFormatting"))
    suite.add(TestCaseTest("testSuite"))
    var result = TestResult()
    suite.run(result)
    println(result.summary())
}