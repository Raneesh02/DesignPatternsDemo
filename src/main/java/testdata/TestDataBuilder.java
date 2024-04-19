package testdata;

import testdata.apiActions.Comment;
import testdata.apiActions.Post;
import testdata.apiActions.User;

import static io.restassured.RestAssured.given;

public class TestDataBuilder {
    User user;
    Post post;
    Comment comment;

public TestDataBuilder withUser(String name, String username, String email, String address){

    return this;
}

public TestDataBuilder withAnyUser(){

    return this;
}

public TestDataBuilder withAnyPost(){
    Post post = new Post();
    return this;
}

public TestDataBuilder withAnyComment(){

    return this;
}

public TestDataBuilder withPost(String title, String body, int userId){

    return this;
}

public TestDataBuilder withComment(String name, String email, String body, int postId){

    return this;
}

public Object[] build(){
    System.out.println("Post created"+post.createPost());
    return new Object[]{user, post, comment};
}

}
