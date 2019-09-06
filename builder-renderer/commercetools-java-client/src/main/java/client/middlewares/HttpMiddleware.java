package client.middlewares;

import client.*;
import okhttp3.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HttpMiddleware implements Middleware {


    private static final OkHttpClient client = new OkHttpClient();
    private final String apiBaseUrl;
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");


    public HttpMiddleware(String apiBaseUrl) {
        this.apiBaseUrl = removeTrailingSlash(apiBaseUrl);
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

        Request.Builder httpRequestBuilder = new Request.Builder()
                .url(apiBaseUrl + apiHttpRequest.getPath());

        //set headers
        for(Map.Entry<String, String> entry : apiHttpRequest.getHeaders().getHeaders().entrySet()){
            httpRequestBuilder = httpRequestBuilder.header(entry.getKey(), entry.getValue());
        }

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
        Response response = client.newCall(httpRequest).execute();
        String responseString = response.body() == null ? "" : response.body().string();
        ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders();
        for(Map.Entry<String, List<String>> entry : response.headers().toMultimap().entrySet()){
            apiHttpHeaders.addHeader(entry.getKey(), entry.getValue().get(0));
        }
        return new ApiHttpResponse(response.code(), apiHttpHeaders, responseString);
    }

    private String removeTrailingSlash(String url){
        if(url.charAt(url.length()-1)=='/'){
            return url.substring(0,url.length()-1 );
        }
        return url;
    }

}
