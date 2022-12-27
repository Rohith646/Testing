package GerkinL;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;// to access other methods directly use *.



public class GetRs {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
  given().when().get("/api/users?page=2").then().statusCode(200).and().contentType(ContentType.JSON);
  System.out.println("done");
}
}
