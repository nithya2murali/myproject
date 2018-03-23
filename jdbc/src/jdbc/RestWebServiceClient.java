package jdbc;

import java.net.URI;   

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * @author Dinesh Rajput
 *
 */
public class RestWebServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RestWebServiceClient client = new RestWebServiceClient();
	//	client.sayHoney();
	//	client.sayAlien();
		//client.sayHello2();
//		client.getMessage("Welcoaliensme");
client.getXMLEmployees();
//		client.getXMLEmployee(11111);
//		client.getJSONEmployees();
	//	client.getJSONEmployee(11111);
	}
	
	private void sayAlien() {
		try {
	           Client client = Client.create();
	           ClientRequest.Builder cr=new  ClientRequest.Builder();
	           URI uri= new URI("http://localhost:8080/RESTWebApp/doj/newaliens/hialien");
	           ClientRequest clientRequest = cr.build(uri, "GET");
	           
	           ClientResponse response= client.handle(clientRequest);
	           
	           // WebResource webResource = client.resource("http://localhost:8181/RESTWebApp/doj/webservice/hello");
	           // ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
	            if (response.getStatus() != 200) {
	                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
	            }
	 
	            String output = response.getEntity(String.class);
	            System.out.println("\n============getResponse============");
	            System.out.println(output);
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	private void sayHello2() {
		try {
           Client client = Client.create();
           ClientRequest.Builder cr=new  ClientRequest.Builder();
           URI uri= new URI("http://localhost:8080/RESTWebApp/doj/webservice/hello");
           ClientRequest clientRequest = cr.build(uri, "GET");
           
           ClientResponse response= client.handle(clientRequest);
           
           // WebResource webResource = client.resource("http://localhost:8181/RESTWebApp/doj/webservice/hello");
           // ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getResponse============");
            System.out.println(output);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	private void sayHoney() {
		try {
           Client client = Client.create();
           ClientRequest.Builder cr=new  ClientRequest.Builder();
           URI uri= new URI("http://localhost:8080/RESTWebApp/doj/webservice/honey");
           ClientRequest clientRequest = cr.build(uri, "GET");
           
           ClientResponse response= client.handle(clientRequest);
           
           // WebResource webResource = client.resource("http://localhost:8181/RESTWebApp/doj/webservice/hello");
           // ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getResponse============");
            System.out.println(output);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	private void sayHello() {
		try {
            Client client = Client.create();
            WebResource webResource = client.resource("http://localhost:8080/sdnext/doj/webservice/hello");
            ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getResponse============");
            System.out.println(output);
   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	private void getMessage(String msg) {
		try {
            Client client = Client.create();
            WebResource webResource = client.resource("http://localhost:8080/RESTWebApp/doj/webservice/message/"+msg);
            ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getCResponse============");
            System.out.println(output);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	private void getXMLEmployees() {
		try {
			Client client = Client.create();
	           ClientRequest.Builder cr=new  ClientRequest.Builder();
	           URI uri= new URI("http://localhost:8080/RESTWebApp/doj/newaliens/hialien");
	           ClientRequest clientRequest = cr.build(uri, "GET");
	           ClientResponse response= client.handle(clientRequest);
	           
	         //  ClientResponse response= client.handle(clientRequest);
          //  Client client = Client.create();
           // WebResource webResource = client.resource("http://localhost:8080/RESTWebApp/doj/newaliens/hialien");
         //   ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getCResponse============");
            System.out.println(output);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	private void getXMLEmployee(int empid) {
		try {
            Client client = Client.create();
            WebResource webResource = client.resource("http://localhost:8080/RESTWebApp/doj/webservice/employee/"+empid);
            ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);
            
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getCResponse============");
            System.out.println(output);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	private void getJSONEmployees() {
		try {
            Client client = Client.create();
            WebResource webResource = client.resource("http://localhost:8181/RESTWebApp/doj/webservice/json/employees/");
            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getCResponse============");
            System.out.println(output);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	private void getJSONEmployee(int empid) {
		try {
            Client client = Client.create();
            WebResource webResource = client.resource("http://localhost:8080/RESTWebApp/doj/webservice/json/employee/"+empid);
            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
            if (response.getStatus() != 204) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }
 
            String output = response.getEntity(String.class);
            System.out.println("\n============getCResponse============");
            System.out.println(output);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
