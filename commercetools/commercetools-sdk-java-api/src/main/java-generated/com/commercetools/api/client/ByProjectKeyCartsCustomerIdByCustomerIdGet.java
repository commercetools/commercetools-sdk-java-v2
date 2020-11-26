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
*  <p>Retrieves the active cart of the customer that has been modified most recently.
*  It does not consider carts with CartOrigin Merchant. If no active cart exists, a 404 Not Found error is returned.</p>
*  <p>The cart may not contain up-to-date prices, discounts etc. If you want to ensure they're up-to-date,
*  send an Update request with the Recalculate update action instead.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartsCustomerIdByCustomerIdGet extends ApiMethod<ByProjectKeyCartsCustomerIdByCustomerIdGet> {

    
    private String projectKey;
    private String customerId;
    

    public ByProjectKeyCartsCustomerIdByCustomerIdGet(final ApiHttpClient apiHttpClient, String projectKey, String customerId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerId = customerId;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdGet(ByProjectKeyCartsCustomerIdByCustomerIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerId = t.customerId;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts/customer-id=%s", this.projectKey, this.customerId);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getCustomerId() {return this.customerId;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setCustomerId(final String customerId) { this.customerId = customerId; }

    public ByProjectKeyCartsCustomerIdByCustomerIdGet withExpand(final String expand){
        return new ByProjectKeyCartsCustomerIdByCustomerIdGet(this).addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyCartsCustomerIdByCustomerIdGet copy()
    {
        return new ByProjectKeyCartsCustomerIdByCustomerIdGet(this);
    }
}
