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
*  <p>Query cart-discounts</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartDiscountsGet extends ApiMethod<ByProjectKeyCartDiscountsGet> {

    
    private String projectKey;
    

    public ByProjectKeyCartDiscountsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartDiscountsGet(ByProjectKeyCartDiscountsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/cart-discounts", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscountPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscountPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.cart_discount.CartDiscountPagedQueryResponse.class);
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

    public ByProjectKeyCartDiscountsGet withExpand(final String expand){
        return new ByProjectKeyCartDiscountsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyCartDiscountsGet withSort(final String sort){
        return new ByProjectKeyCartDiscountsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyCartDiscountsGet withLimit(final Integer limit){
        return new ByProjectKeyCartDiscountsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyCartDiscountsGet withOffset(final Integer offset){
        return new ByProjectKeyCartDiscountsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyCartDiscountsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyCartDiscountsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyCartDiscountsGet withWhere(final String where){
        return new ByProjectKeyCartDiscountsGet(this).addQueryParam("where", where);
    }
}
