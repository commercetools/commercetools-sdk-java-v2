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
*  <p>Update Extension by key</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyExtensionsKeyByKeyPost extends ApiMethod<ByProjectKeyExtensionsKeyByKeyPost, com.commercetools.api.models.extension.Extension> implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyExtensionsKeyByKeyPost>, com.commercetools.api.client.ExpandableTrait<ByProjectKeyExtensionsKeyByKeyPost>, com.commercetools.api.client.ErrorableTrait<ByProjectKeyExtensionsKeyByKeyPost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyExtensionsKeyByKeyPost> {

    
    private String projectKey;
    private String key;
    
    private com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate;

    public ByProjectKeyExtensionsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key, com.commercetools.api.models.extension.ExtensionUpdate extensionUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.extensionUpdate = extensionUpdate;
    }

    public ByProjectKeyExtensionsKeyByKeyPost(ByProjectKeyExtensionsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.extensionUpdate = t.extensionUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/extensions/key=%s", this.projectKey, this.key);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(extensionUpdate);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.extension.Extension> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    @Override
    public ApiHttpResponse<com.commercetools.api.models.extension.Extension> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.extension.Extension>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.extension.Extension.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getKey() {return this.key;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setKey(final String key) { this.key = key; }

    public ByProjectKeyExtensionsKeyByKeyPost withExpand(final String expand){
        return copy().addQueryParam("expand", expand);
    }
    
    @Override
    protected ByProjectKeyExtensionsKeyByKeyPost copy()
    {
        return new ByProjectKeyExtensionsKeyByKeyPost(this);
    }
}
