package AMOA.server;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import AMOA.webservices.ProductsManagerImpl;


public class ServicePublisher {

	private static Logger logger = LoggerFactory.getLogger(ServicePublisher.class);
	
	public static void main(String[] args) {
		
		logger.info("Starting server");
		
		
		Endpoint.publish("http://localhost:8080/webservices/ProductsManager", new ProductsManagerImpl());
		
		logger.info("Server started");
	}
}
