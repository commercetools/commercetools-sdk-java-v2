package client.middlewares;

import client.*;
import json.CommercetoolsJsonUtils;
import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HttpMiddleware implements Middleware {
    
    private static final OkHttpClient client = new OkHttpClient();
    private final String apiBaseUrl;
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private final String clientId;
    private final String clientSecret;
    private final String scope;
    private final String accessTokenEndpoint;
    private final String authorizationBaseUrl;
    
    private String accessToken;
    
    public HttpMiddleware(String apiBaseUrl, String clientId, String clientSecret, String scope, String accessTokenEndpoint, String authorizationBaseUrl) {
        this.apiBaseUrl = removeTrailingSlash(apiBaseUrl);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.accessTokenEndpoint = accessTokenEndpoint;
        this.authorizationBaseUrl = authorizationBaseUrl;
    }

    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
        if(arg.getError() !=null){
            return arg.getNext().next(arg);
        }
        try{
            ApiHttpResponse response = execute(arg.getRequest());
            MiddlewareArg newArg = MiddlewareArg.from(arg.getRequest(), response, arg.getError(), arg.getNext());
            return arg.getNext().next(newArg);
        }catch (IOException exception){

            MiddlewareArg errorMiddlewareArg = MiddlewareArg.from(arg.getRequest(), arg.getResponse(), exception, arg.getNext());
            return arg.getNext().next(arg);
        }
    }

    private ApiHttpResponse execute(final ApiHttpRequest apiHttpRequest) throws IOException {
        
        String accessToken = getAccessToken();
        
        Request.Builder httpRequestBuilder = new Request.Builder()
                .url(apiBaseUrl + apiHttpRequest.getPath());

        //set headers
        for(Map.Entry<String, String> entry : apiHttpRequest.getHeaders().getHeaders().entrySet()){
            httpRequestBuilder = httpRequestBuilder.header(entry.getKey(), entry.getValue());
        }
        httpRequestBuilder.header("Authorization", " Bearer " + accessToken);
        
        //set method and body
        switch (apiHttpRequest.getMethod()){
            case GET:
                httpRequestBuilder = httpRequestBuilder.get();
                break;
            case DELETE:
                httpRequestBuilder = httpRequestBuilder.delete();
                break;
            case POST:
                httpRequestBuilder = httpRequestBuilder.post(RequestBody.create(apiHttpRequest.getBody(), JSON));
                break;
            case PUT:
                httpRequestBuilder = httpRequestBuilder.put(RequestBody.create(apiHttpRequest.getBody(), JSON));
                break;
            default:
                throw new RuntimeException("Non supported HTTP Method : " + apiHttpRequest.getMethod().toString());
        }

        Request httpRequest = httpRequestBuilder.build();
        Response response = executeRequest(httpRequest);
        
        String responseString = response.body() == null ? "" : response.body().string();
        ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders();
        for(Map.Entry<String, List<String>> entry : response.headers().toMultimap().entrySet()){
            apiHttpHeaders.addHeader(entry.getKey(), entry.getValue().get(0));
        }
        return new ApiHttpResponse(response.code(), apiHttpHeaders, responseString);
    }

    private Response executeRequest(Request httpRequest){
        
        try{
            Response response = client.newCall(httpRequest).execute();
            if(response.code() == 401 && response.body().string().contains("invalid_token")) {
                invalidateToken();
                httpRequest = new Request.Builder(httpRequest)
                        .header("Authorization", " Bearer " + getAccessToken())
                        .build();
                response = client.newCall(httpRequest).execute();
                if(response.code() == 401){
                    throw new RuntimeException("Token not valid, msg: " + response.body().string());
                }
            }
            return response;
        }catch (IOException e){
            throw new RuntimeException("Could not execute http request, msg: " + e.getMessage());
        }
    }
    
    private synchronized String getAccessToken() {
        if(accessToken == null){
            try{
                accessToken = obtainAccessToken();
                return accessToken;
            }catch (IOException exception){
                throw new RuntimeException("Failed to obtain access token, msg: " + exception.getMessage());
            }
        }else{
            return accessToken;
        }
    }
    
    private synchronized void invalidateToken() {
        accessToken = null;
    }
    
    private String obtainAccessToken() throws IOException {

        String clientId = System.getenv("CTP_CLIENT_ID");
        String clientSecret = System.getenv("CTP_CLIENT_SECRET");
        
        String auth = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));

        RequestBody formBody = new FormBody.Builder()
                .add("grant_type", "client_credentials")
                .build();

        Request request = new Request.Builder()
                .url(accessTokenEndpoint)
                .header("Authorization", "Basic " + auth)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .post(formBody).build();

        Response response = client.newCall(request).execute();
        String responseString = response.body().string();
        
        
        AuthenticationToken authenticationToken = CommercetoolsJsonUtils.fromJsonString(responseString, AuthenticationToken.class);
        return authenticationToken.getAccessToken();
    }

    private String removeTrailingSlash(String url){
        if(url.charAt(url.length()-1)=='/'){
            return url.substring(0,url.length()-1 );
        }
        return url;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getScope() {
        return scope;
    }

    public String getAccessTokenEndpoint() {
        return accessTokenEndpoint;
    }

    public String getAuthorizationBaseUrl() {
        return authorizationBaseUrl;
    }
}
