package testdata.apiActions;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class Post {
    String name,  username,  email, address;
    int userId;


    public int createPost(){
        //hit /post api to create user
        JSONObject data = new JSONObject();

        data.put("employee_name", "MapTest");
        data.put("profile_image", "test.png");
        data.put("employee_age", "30");
        data.put("employee_salary", "11111");

        Response post = given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");

        post.then().log().body();
        ResponseBody peek = post.getBody().jsonPath().get("id");



        System.out.println("created user with Details" + name+ " "+username+" "+email+" "+address);
        return 1;
    }
}
