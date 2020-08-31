package com.commercetools.api.client;

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
*  <p>Query product-discounts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductDiscountsGet extends ApiMethod<ByProjectKeyProductDiscountsGet> {

    
    private String projectKey;
    

    public ByProjectKeyProductDiscountsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductDiscountsGet(ByProjectKeyProductDiscountsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscountPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscountPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.product_discount.ProductDiscountPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }
    
    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyProductDiscountsGet withExpand(final String expand){
        return new ByProjectKeyProductDiscountsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyProductDiscountsGet withSort(final String sort){
        return new ByProjectKeyProductDiscountsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyProductDiscountsGet withLimit(final Integer limit){
        return new ByProjectKeyProductDiscountsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyProductDiscountsGet withOffset(final Integer offset){
        return new ByProjectKeyProductDiscountsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyProductDiscountsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyProductDiscountsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyProductDiscountsGet withWhere(final String where){
        return new ByProjectKeyProductDiscountsGet(this).addQueryParam("where", where);
    }
}
