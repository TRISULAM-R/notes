import static io.restassured.RestAssured.*;


import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import pojoUtility.ProjectPOJO;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Project
{
    @Test
    public void addProject()
    {
        Map j =new HashMap<>();
        j.put("createdBy","testing-guy");
        j.put("projectName","test-T-01");
        j.put("status","Created");
        j.put("teamSize",0);
        given().body(j).contentType(ContentType.JSON)
                .when().post("http://49.249.28.218:8091/addProject")
                .then()
                .log().all();
    }

    @Test
    public void addProjectUsingJsonObject()
    {
        JSONObject j =new JSONObject();
        j.put("createdBy","testing-guy");
        j.put("projectName","test-T-02");
        j.put("status","Created");
        j.put("teamSize",0);
        //if we are using json simple JSONObject we have to use jackson-binder dependency because it has to be searialized
        // else we have to conver the json object into String. ex: j.toJsonString()
        given().body(j).contentType(ContentType.JSON)
                .when().post("http://49.249.28.218:8091/addProject")
                .then()
                .log().all();
    }

    @Test
    public void addProjectUsingJsonFile()
    {
        File file= new File("./src/test/resources/JsonTemplates/addProjectReques.json");
        given().body(file).contentType(ContentType.JSON)
                .when().post("http://49.249.28.218:8091/addProject")
                .then()
                .log().all();
    }

    @Test
    public void addProjectUsingPojoClass()
    {

        Random random = new Random();
        int randomNum = random.nextInt(10000);
        ProjectPOJO pojo= new ProjectPOJO("testing-guy","testing-guy-"+randomNum,"Created",0);
        given().body(pojo).contentType(ContentType.JSON)
                .when().post("http://49.249.28.218:8091/addProject")
                .then()
                .log().all();
    }
}
