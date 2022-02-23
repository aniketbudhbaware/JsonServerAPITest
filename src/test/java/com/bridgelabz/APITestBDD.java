package com.bridgelabz;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class APITestBDD {
	private static final JSONObject jsonObject = null;
	@Test
    public void getTest() {
        RestAssured.given()
                .when().get(" http://localhost:3000/posts")
                .then().assertThat().statusCode(200);

}
	 @Test
	    public void postTest() {

	        JSONObject jsonObject = new JSONObject();
	        jsonObject.put("id", 20);
	        jsonObject.put("title", "Trading");
	        jsonObject.put("author", "sanket");
	        RestAssured.given()
	                .header("Content-Type", "application/json")
	                .body(jsonObject.toJSONString())
	                .when()
	                .post("http://localhost:3000/posts")
	                .then()
	                .statusCode(201);
	    }
	 @Test
	    public void postTest1() {

	        JSONObject jsonObject = new JSONObject();
	        jsonObject.put("id", 21);
	        jsonObject.put("title", "Title value");
	        jsonObject.put("author", "Jack");
	        RestAssured.given()
	                .header("Content-Type", "application/json")
	                .body(jsonObject.toJSONString())
	                .when()
	                .post("http://localhost:3000/posts")
	                .then()
	                .statusCode(201);
	    }
	 @Test
	    public void putTest() {

	        JSONObject jsonObject = new JSONObject();
	        jsonObject.put("id", 16);
	        jsonObject.put("title", "Title ");
	        jsonObject.put("author", "sparrow");
	        RestAssured.given()
	                .header("Content-Type", "application/json")
	                .body(jsonObject.toJSONString())
	                .when()
	                .post("http://localhost:3000/posts")
	                .then()
	                .statusCode(201);
	    }
	 @Test
	    public void deleteTest() {
		 JSONObject jsonObject = new JSONObject();
	      
	       
	        RestAssured.given()
	                .header("Content-Type", "application/json")
	                .body(jsonObject.toJSONString())
	                .when()
	                .delete("http://localhost:3000/posts/11")
	                .then()
	                .statusCode(200);
	 }

	    
		
}
