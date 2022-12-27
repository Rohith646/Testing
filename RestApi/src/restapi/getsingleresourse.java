package restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getsingleresourse {
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		Response response = r.request(Method.GET,"/api/unknown/2");
		/*String value = response.asString();
		System.out.print(value);*/
		response.prettyPrint();
	}
}
