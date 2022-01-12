package helloworld

import org.junit.Assert
import org.junit.Test

class AppTest {
    @Test
    fun successfulResponse() {
        val app = App()
        val result = app.handleRequest(null, null)
        Assert.assertEquals(200, result.statusCode.toInt().toLong())
        Assert.assertEquals("application/json", result.headers["Content-Type"])
        val content = result.body
        Assert.assertNotNull(content)
        Assert.assertTrue(content.contains("\"message\""))
        Assert.assertTrue(content.contains("\"hello world\""))
        Assert.assertTrue(content.contains("\"location\""))
    }
}
