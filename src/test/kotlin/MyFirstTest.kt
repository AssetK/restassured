package config


import TestConfig
import org.junit.jupiter.api.Test
import io.restassured.RestAssured.*

class MyFirstTest: TestConfig() {
    @Test
    fun myFirstTest() {
        given()
            .log().all().
            `when`().get("tasks/12").
            then().assertThat().statusCode(200)
    }
}










