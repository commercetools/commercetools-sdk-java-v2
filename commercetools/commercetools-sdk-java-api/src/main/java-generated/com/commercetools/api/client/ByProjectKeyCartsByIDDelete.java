package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;

import java.io.InputStream;
import java.io.IOException;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import javax.annotation.Nullable;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Delete Cart by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartsByIDDelete extends ApiMethod<ByProjectKeyCartsByIDDelete, com.commercetools.api.models.cart.Cart> implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyCartsByIDDelete>, com.commercetools.api.client.VersionedTrait<ByProjectKeyCartsByIDDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyCartsByIDDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartsByIDDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsByIDDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCartsByIDDelete> {

    
    private String projectKey;
    private String ID;
    

    public ByProjectKeyCartsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCartsByIDDelete(ByProjectKeyCartsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }
    
    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyCartsByIDDelete withDataErasure(final boolean dataErasure){
        return copy().withQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyCartsByIDDelete addDataErasure(final boolean dataErasure){
        return copy().addQueryParam("dataErasure", dataErasure);
    }
    
    public ByProjectKeyCartsByIDDelete withVersion(final long version){
        return copy().withQueryParam("version", version);
    }
    
    public ByProjectKeyCartsByIDDelete addVersion(final long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyCartsByIDDelete withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyCartsByIDDelete addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyCartsByIDDelete copy()
    {
        return new ByProjectKeyCartsByIDDelete(this);
    }
}
