package com.commercetools.ml.client;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMissingDataAttributesPost extends ApiMethod<ByProjectKeyMissingDataAttributesPost, com.commercetools.ml.models.common.TaskToken> {

    
    private String projectKey;
    
    private com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest;

    public ByProjectKeyMissingDataAttributesPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest missingAttributesSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.missingAttributesSearchRequest = missingAttributesSearchRequest;
    }

    public ByProjectKeyMissingDataAttributesPost(ByProjectKeyMissingDataAttributesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.missingAttributesSearchRequest = t.missingAttributesSearchRequest;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/attributes", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(missingAttributesSearchRequest);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.ml.models.common.TaskToken.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }


    
    @Override
    protected ByProjectKeyMissingDataAttributesPost copy()
    {
        return new ByProjectKeyMissingDataAttributesPost(this);
    }
}
