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
*  <p>Delete Channel by ID</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyChannelsByIDDelete extends ApiMethod<ByProjectKeyChannelsByIDDelete, com.commercetools.api.models.channel.Channel> implements com.commercetools.api.client.VersionedTrait<ByProjectKeyChannelsByIDDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyChannelsByIDDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyChannelsByIDDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyChannelsByIDDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyChannelsByIDDelete> {

    
    private String projectKey;
    private String ID;
    

    public ByProjectKeyChannelsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyChannelsByIDDelete(ByProjectKeyChannelsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/channels/%s", this.projectKey, this.ID);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.channel.Channel> executeBlocking(final ApiHttpClient client, Duration timeout){
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.channel.Channel>> execute(final ApiHttpClient client){
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.channel.Channel.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getID() {return this.ID;}

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }
    
    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setID(final String ID) { this.ID = ID; }

    public ByProjectKeyChannelsByIDDelete withVersion(final long version){
        return copy().withQueryParam("version", version);
    }
    
    public ByProjectKeyChannelsByIDDelete addVersion(final long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyChannelsByIDDelete withExpand(final String expand){
        return copy().withQueryParam("expand", expand);
    }
    
    public ByProjectKeyChannelsByIDDelete addExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }

    

    @Override
    protected ByProjectKeyChannelsByIDDelete copy()
    {
        return new ByProjectKeyChannelsByIDDelete(this);
    }
}
