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
public class ByProjectKeyMissingDataImagesStatusByTaskIdGet extends ApiMethod<ByProjectKeyMissingDataImagesStatusByTaskIdGet> {

    
    private String projectKey;
    private String taskId;
    

    public ByProjectKeyMissingDataImagesStatusByTaskIdGet(final ApiHttpClient apiHttpClient, String projectKey, String taskId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.taskId = taskId;
    }

    public ByProjectKeyMissingDataImagesStatusByTaskIdGet(ByProjectKeyMissingDataImagesStatusByTaskIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.taskId = t.taskId;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/images/status/%s", this.projectKey, this.taskId);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingImagesTaskStatus> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingImagesTaskStatus> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.missing_data.MissingImagesTaskStatus>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.ml.models.missing_data.MissingImagesTaskStatus.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getTaskId() {return this.taskId;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setTaskId(final String taskId) { this.taskId = taskId; }

}
