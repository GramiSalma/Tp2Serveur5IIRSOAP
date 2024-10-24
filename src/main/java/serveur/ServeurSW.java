package serveur;

import jakarta.xml.ws.Endpoint;
import service.ServiceStudent;

public class ServeurSW {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new ServiceStudent());
        System.out.println(url);
    }
}
