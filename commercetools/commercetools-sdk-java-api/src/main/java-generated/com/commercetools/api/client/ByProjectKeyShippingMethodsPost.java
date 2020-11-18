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
*  <p>Create ShippingMethod</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShippingMethodsPost extends ApiMethod<ByProjectKeyShippingMethodsPost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft;

    public ByProjectKeyShippingMethodsPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.shippingMethodDraft = shippingMethodDraft;
    }

    public ByProjectKeyShippingMethodsPost(ByProjectKeyShippingMethodsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.shippingMethodDraft = t.shippingMethodDraft;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/shipping-methods", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(shippingMethodDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shipping_method.ShippingMethod>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.shipping_method.ShippingMethod.class);
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyShippingMethodsPost withExpand(final String expand){
        return new ByProjectKeyShippingMethodsPost(this).addQueryParam("expand", expand);
    }
}
