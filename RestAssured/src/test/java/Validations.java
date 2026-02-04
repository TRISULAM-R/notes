import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class Validations
{
    String repo = null;
    String owner = null;
    @Test
    public void createRepo()
    {
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        JSONObject j = new JSONObject();
        j.put("name","Hello world"+randomNum);


        Response res = given().auth().oauth2("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").contentType(ContentType.JSON).body(j)
                .when().post("https://api.github.com/user/repos");
        repo = res.jsonPath().getString("name");
        owner = res.jsonPath().getString("owner.login");
        res.then().log().all();
    }

    @Test(dependsOnMethods = "createRepo")
    public void getRepo()
    {

        Response res = given().auth().oauth2("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").contentType(ContentType.JSON)
                .when().get("https://api.github.com/repos/"+owner+"/"+repo);
        res.then().log().all();
    }

    @Test(dependsOnMethods = "createRepo")
    public void updateRepo()
    {
        JSONObject j = new JSONObject();
        j.put("private", true);


        Response res = given().auth().oauth2("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").contentType(ContentType.JSON).body(j)
                .when().patch("https://api.github.com/repos/"+owner+"/"+repo);
        res.then().statusCode(200);
//        res.then().statusLine();
//        res.then().header("","");
        res.then().contentType(ContentType.JSON);
        res.then().time(Matchers.lessThan(4000l));
        res.then().time(Matchers.both(Matchers.lessThan(4000l)).and(Matchers.greaterThan(1000l)));
        res.then().body("owner.login",Matchers.equalTo(owner));
        res.then().body("name",Matchers.equalTo(repo));
        res.then().log().all();
    }

    @Test(dependsOnMethods = "createRepo")
    public void deleteRepo()
    {

        Response res = given().auth().oauth2("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").contentType(ContentType.JSON)
                .when().delete("https://api.github.com/repos/"+owner+"/"+repo);
        res.then().statusCode(204).log().all();
    }
}
