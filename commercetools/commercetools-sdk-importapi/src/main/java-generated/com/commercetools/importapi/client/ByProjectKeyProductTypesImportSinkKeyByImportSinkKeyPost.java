package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


/**
*  <p>Creates a new import request for product types</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost {


    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private Map<String, String> additionalQueryParams = new HashMap<>();
    private final ApiHttpClient apiHttpClient;

    private String projectKey;
    private String importSinkKey;

    private com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest;

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey, com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest){
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.productTypeImportRequest = productTypeImportRequest;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>();

        params.add(additionalQueryParams.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&")));
        params.removeIf(String::isEmpty);
        String httpRequestPath = String.format("/%s/product-types/importSinkKey=%s", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath);
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(headers);
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(productTypeImportRequest));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> execute(){
        return apiHttpClient.execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.importapi.models.importrequests.ImportResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}


    public void setProjectKey(final String projectKey) {this.projectKey = projectKey;}

    public void setImportSinkKey(final String importSinkKey) {this.importSinkKey = importSinkKey;}


    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return this;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return this;
    }

    public String getHeaderValue(final String key) {
        return this.headers.getHeaderValue(key);
    }

    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost addAdditionalQueryParam(final String additionalQueryParamKey, final String additionalQueryParamValue) {
        this.additionalQueryParams.put(additionalQueryParamKey, additionalQueryParamValue);
        return this;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost setAdditionalQueryParams(final Map<String, String> additionalQueryParams) {
        this.additionalQueryParams = additionalQueryParams;
        return this;
    }

    public Map<String, String> getAdditionalQueryParams() {
        return this.additionalQueryParams;
    }

    private String urlEncode(final String s){
        try{
             return URLEncoder.encode(s, "UTF-8");
         }catch (UnsupportedEncodingException e) {
             //this will never happen
             return null;
         }
    }

}
