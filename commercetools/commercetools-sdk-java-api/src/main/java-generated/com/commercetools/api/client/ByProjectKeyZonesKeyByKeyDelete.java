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
*  <p>Delete Zone by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyZonesKeyByKeyDelete extends ApiMethod<ByProjectKeyZonesKeyByKeyDelete, com.commercetools.api.models.zone.Zone> implements com.commercetools.api.client.VersionedTrait<ByProjectKeyZonesKeyByKeyDelete>, com.commercetools.api.client.ConflictingTrait<ByProjectKeyZonesKeyByKeyDelete>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyZonesKeyByKeyDelete>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyZonesKeyByKeyDelete>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyZonesKeyByKeyDelete> {

    
    private String projectKey;
    private String key;
    

    public ByProjectKeyZonesKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyZonesKeyByKeyDelete(ByProjectKeyZonesKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/zones/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.zone.Zone> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    @Override
    public ApiHttpResponse<com.commercetools.api.models.zone.Zone> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.zone.Zone>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.zone.Zone.class);
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

    public ByProjectKeyZonesKeyByKeyDelete withVersion(final Long version){
        return copy().addQueryParam("version", version);
    }
    
    public ByProjectKeyZonesKeyByKeyDelete withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyZonesKeyByKeyDelete copy()
    {
        return new ByProjectKeyZonesKeyByKeyDelete(this);
    }
}
