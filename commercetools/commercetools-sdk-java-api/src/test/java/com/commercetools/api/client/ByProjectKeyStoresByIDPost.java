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
*  <p>Update Store by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyStoresByIDPost extends ApiMethod<ByProjectKeyStoresByIDPost, com.commercetools.api.models.store.Store> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyStoresByIDPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyStoresByIDPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyStoresByIDPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyStoresByIDPost> {

    
    private String projectKey;
    private String ID;
    
    private com.commercetools.api.models.common.Update update;

    public ByProjectKeyStoresByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID, com.commercetools.api.models.common.Update update) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.update = update;
    }

    public ByProjectKeyStoresByIDPost(ByProjectKeyStoresByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.update = t.update;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/stores/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(update);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.store.Store> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.store.Store>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.store.Store.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyStoresByIDPost withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyStoresByIDPost addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyStoresByIDPost copy()
    {
        return new ByProjectKeyStoresByIDPost(this);
    }
}
