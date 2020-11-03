package com.commercetools.ml.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

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
public class ByProjectKeyMissingDataPricesPost extends ApiMethod<ByProjectKeyMissingDataPricesPost> {

    
    private String projectKey;
    
    private com.commercetools.ml.models.missing_data.MissingPricesSearchRequest missingPricesSearchRequest;

    public ByProjectKeyMissingDataPricesPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.ml.models.missing_data.MissingPricesSearchRequest missingPricesSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.missingPricesSearchRequest = missingPricesSearchRequest;
    }

    public ByProjectKeyMissingDataPricesPost(ByProjectKeyMissingDataPricesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.missingPricesSearchRequest = t.missingPricesSearchRequest;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/prices", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.POST);
        httpRequest.setHeaders(getHeaders());
        try{httpRequest.setBody(apiHttpClient().getSerializerService().toJsonByteArray(missingPricesSearchRequest));}catch(Exception e){e.printStackTrace();}
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.ml.models.common.TaskToken.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

}
