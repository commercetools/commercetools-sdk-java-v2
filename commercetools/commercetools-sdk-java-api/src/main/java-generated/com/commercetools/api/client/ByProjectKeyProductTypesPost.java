package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

import java.time.Duration;
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


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Create ProductType</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyProductTypesPost extends ApiMethod<ByProjectKeyProductTypesPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft;

    public ByProjectKeyProductTypesPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productTypeDraft = productTypeDraft;
    }

    public ByProjectKeyProductTypesPost(ByProjectKeyProductTypesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productTypeDraft = t.productTypeDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(apiHttpClient().getSerializerService().toJsonByteArray(productTypeDraft));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.product_type.ProductType> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.product_type.ProductType> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_type.ProductType>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.product_type.ProductType.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyProductTypesPost withExpand(final String expand){
        return new ByProjectKeyProductTypesPost(this).addQueryParam("expand", expand);
    }
}
