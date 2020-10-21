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
*  <p>Create a Token for verifying the Customer's Email</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersEmailTokenPost extends ApiMethod<ByProjectKeyCustomersEmailTokenPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken;

    public ByProjectKeyCustomersEmailTokenPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerCreateEmailToken = customerCreateEmailToken;
    }

    public ByProjectKeyCustomersEmailTokenPost(ByProjectKeyCustomersEmailTokenPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerCreateEmailToken = t.customerCreateEmailToken;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/email-token", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(VrapJsonUtils.toJsonByteArray(customerCreateEmailToken));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerToken>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> Utils.convertResponse(response,com.commercetools.api.models.customer.CustomerToken.class));
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

}
