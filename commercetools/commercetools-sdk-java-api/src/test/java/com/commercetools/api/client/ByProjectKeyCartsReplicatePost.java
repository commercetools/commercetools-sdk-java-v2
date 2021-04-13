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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartsReplicatePost extends ApiMethod<ByProjectKeyCartsReplicatePost, com.commercetools.api.models.cart.Cart> implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsReplicatePost>, com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCartsReplicatePost> {

    
    private String projectKey;
    
    private com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft;

    public ByProjectKeyCartsReplicatePost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.replicaCartDraft = replicaCartDraft;
    }

    public ByProjectKeyCartsReplicatePost(ByProjectKeyCartsReplicatePost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.replicaCartDraft = t.replicaCartDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/carts/replicate", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(replicaCartDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    

    @Override
    protected ByProjectKeyCartsReplicatePost copy()
    {
        return new ByProjectKeyCartsReplicatePost(this);
    }
}
