package vis.common.utils;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import vis.country.stub.response.DetailedProfile;
import vis.country.stub.response.SummarizedProfile;

public class HTTPRequestUtil {
	
	protected static Logger logger = Logger.getLogger(HTTPRequestUtil.class.getName());

	
	public static SummarizedProfile parseGermanySummarizedProfile(String msisdn, String url) {
		// To be used in Customer Party
		SummarizedProfile profileResponse = null;
		try {
			URIBuilder builder = new URIBuilder(url);
			logger.info("URI: "+builder.build().toString());
			builder.setParameter("_loginMsisdn", msisdn);
			HttpGet request = new HttpGet(builder.build());
			logger.info("Full URI: "+request.getURI().toString());
			String json = executeHttpRequest(request);
			profileResponse = parseStringToJsonObject(json, SummarizedProfile.class);
			System.out.println("response profileResponse: " + profileResponse);
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage());
		}
		return profileResponse;

	}
	
	public static DetailedProfile parseGermanyDetailedProfile(String msisdn, String url) {
		// To be used in Usage
		DetailedProfile profileResponse = null;
		try {
			
			URIBuilder builder = new URIBuilder(url);
			builder.setParameter("_loginMsisdn", msisdn);
			HttpGet request = new HttpGet(builder.build());
			String json = executeHttpRequest(request);

			profileResponse = parseStringToJsonObject(json, DetailedProfile.class);
			System.out.println("response profileResponse: " + profileResponse);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return profileResponse;

	}

	private static String executeHttpRequest(HttpUriRequest request) {

		CloseableHttpClient httpclient = null;
		HttpResponse response;
		httpclient = HttpClientBuilder.create().build();
		try {

			response = httpclient.execute(request);
			if (response != null) {
				HttpEntity responseEntity = response.getEntity();
				if (responseEntity != null) {
					return EntityUtils.toString(responseEntity, "UTF-8");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (httpclient != null)
					httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private static <WRAPPER> WRAPPER parseStringToJsonObject(String retrievedJsonCustomer, Class<WRAPPER> distClass) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			WRAPPER clazz = distClass.newInstance();
			clazz = mapper.readValue(retrievedJsonCustomer, distClass);
			return clazz;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
