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
*  <p>Delete MyCart by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeCartsKeyByKeyDelete extends ApiMethod<ByProjectKeyMeCartsKeyByKeyDelete, com.commercetools.api.models.me.MyCart> implements com.commercetools.api.client.VersionedTrait<ByProjectKeyMeCartsKeyByKeyDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeCartsKeyByKeyDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeCartsKeyByKeyDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsKeyByKeyDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeCartsKeyByKeyDelete> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeyMeCartsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeCartsKeyByKeyDelete(ByProjectKeyMeCartsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/carts/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyCart> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyCart>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.me.MyCart.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyMeCartsKeyByKeyDelete withVersion(final long version){
        return copy().withQueryParam("version", version);
    }
    
    public ByProjectKeyMeCartsKeyByKeyDelete addVersion(final long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyMeCartsKeyByKeyDelete withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyMeCartsKeyByKeyDelete addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyMeCartsKeyByKeyDelete copy()
    {
        return new ByProjectKeyMeCartsKeyByKeyDelete(this);
    }
}
