import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.anyOf;

public class SakaGlobal
{
    @Test
    public void evaluateBan()
    {
        Response response =given().auth().oauth2("").contentType(ContentType.JSON)
                .when().get();

                response.then().log().all();
                response.then().time(Matchers.lessThan(2000L));
                response.then().body("customers.id[1]",Matchers.equalTo("234234r"));
                response.then().log().all();
                response.then().time(anyOf(lessThan(2000L),greaterThan(1000L)));
                response.then().assertThat().statusCode(200).body("status",equalTo(""))
                        .body("data.id",notNullValue())
                        .body("data.name",containsString("adf"));
        ValidatableResponse then = response.then();
        Response response1 = then.extract().response();
    }
}