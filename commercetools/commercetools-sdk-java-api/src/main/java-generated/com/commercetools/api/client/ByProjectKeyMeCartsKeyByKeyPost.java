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
*  <p>Update MyCart by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeCartsKeyByKeyPost extends ApiMethod<ByProjectKeyMeCartsKeyByKeyPost, com.commercetools.api.models.me.MyCart> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyMeCartsKeyByKeyPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeCartsKeyByKeyPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsKeyByKeyPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeCartsKeyByKeyPost> {

    
    private String projectKey;
    private String key;
    
    private com.commercetools.api.models.me.MyCartUpdate myCartUpdate;

    public ByProjectKeyMeCartsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key, com.commercetools.api.models.me.MyCartUpdate myCartUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.myCartUpdate = myCartUpdate;
    }

    public ByProjectKeyMeCartsKeyByKeyPost(ByProjectKeyMeCartsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.myCartUpdate = t.myCartUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/carts/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(myCartUpdate);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyMeCartsKeyByKeyPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyMeCartsKeyByKeyPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyMeCartsKeyByKeyPost copy()
    {
        return new ByProjectKeyMeCartsKeyByKeyPost(this);
    }
}
