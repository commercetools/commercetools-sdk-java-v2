package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
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
*  <p>Creates a customer. If an anonymous cart is passed in,
*  then the cart is assigned to the created customer and the version number of the Cart will increase.
*  If the ID of an anonymous session is given, all carts and orders will be assigned to the created customer.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersPost extends ApiMethod<ByProjectKeyCustomersPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.customer.CustomerDraft customerDraft;

    public ByProjectKeyCustomersPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.customer.CustomerDraft customerDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerDraft = customerDraft;
    }

    public ByProjectKeyCustomersPost(ByProjectKeyCustomersPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerDraft = t.customerDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(customerDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer.CustomerSignInResult>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.customer.CustomerSignInResult.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyCustomersPost withExpand(final String expand){
        return new ByProjectKeyCustomersPost(this).addQueryParam("expand", expand);
    }
}
