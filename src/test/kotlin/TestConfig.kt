import io.restassured.RestAssured
import org.junit.BeforeClass


open class TestConfig {
    @BeforeClass
    fun setup() {
        //RestAssured.proxy("localhost", 8888)
        RestAssured.baseURI = "http://localhost"
        RestAssured.basePath = "/tasks/"
        RestAssured.port = 8081
    }
}