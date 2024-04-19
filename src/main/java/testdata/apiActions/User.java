package testdata.apiActions;

import static io.restassured.RestAssured.given;

public class User {

    String name,  username,  email, address;
    int userId;


    public int createUser(){
        //hit /users api to create user

        System.out.println("created user with Details" + name+ " "+username+" "+email+" "+address);
        return 1;
    }
}
