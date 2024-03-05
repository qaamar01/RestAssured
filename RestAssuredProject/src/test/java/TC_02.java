import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

@Test
public class TC_02 {
    public void Test_01() {
	     
    	Map <String,Object> map = new HashMap<String , Object> ();
    	map.put("subStatusTypeId", "0");
    	map.put("page","0");
    	map.put("pageSize","25");
    	
    	  System.out.println(map);
    }
    	
 //	  JSONObject request = new JSONObject(map);
         System.out.println(request);

   //    given().
           
    //      body(request.toJSONString()).
    //		header("locale","en").
   //  	header("authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDE1MzYsImVtYWlsIjoiZW1haWxAZW1haWwuY29tIiwicGhvbmVOdW1iZXIiOiI1MDg2MzMwOTMiLCJwaG9uZU51bWJlckNvdW50cnlDb2RlIjoiKzk2NiIsInJvbGVJZCI6NDQsImFzV2FzYWx0QnVzaW5lc3NNYW5hZ2VyIjpmYWxzZSwiaWF0IjoxNjkwMzY5NzMxLCJleHAiOjE2OTU1NTM3MzEsImlzcyI6Indhc2FsdCJ9.UM5bZ2Izhfu3Q-2_7DuklYLdnUd90aDNEWfhA5_kfGE").
   //	    header ("Content-Type","application/json").
	//    when ().
		post("https://preprod-api.wasalt.com/gateway/v5/post-property/get-user-properties").
   //		then ().
  //  	statusCode(200).
     	body("data.properties[0].slug", equalTo ("cb36d512-fea2-4c50-a0b3-8b51944986a2")).
// 	    body("data.properties[0].slug", hasItems("cb36d512-fea2-4c50-a0b3-8b51944986a")).
  //   	log().all();
		

