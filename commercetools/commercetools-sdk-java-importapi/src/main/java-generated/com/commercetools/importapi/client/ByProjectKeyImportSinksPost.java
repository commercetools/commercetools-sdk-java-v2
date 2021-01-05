package com.commercetools.importapi.client;

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
*  <p>Creates a new import sink.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyImportSinksPost extends ApiMethod<ByProjectKeyImportSinksPost, com.commercetools.importapi.models.importsinks.ImportSink> implements com.commercetools.importapi.client.Secured_by_manage_import_sinksTrait<ByProjectKeyImportSinksPost> {

    
    private String projectKey;
    
    private com.commercetools.importapi.models.importsinks.ImportSinkDraft importSinkDraft;

    public ByProjectKeyImportSinksPost(final ApiHttpClient apiHttpClient, String projectKey, com.commercetools.importapi.models.importsinks.ImportSinkDraft importSinkDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkDraft = importSinkDraft;
    }

    public ByProjectKeyImportSinksPost(ByProjectKeyImportSinksPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkDraft = t.importSinkDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-sinks", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
        final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(importSinkDraft);
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
    } catch(Exception e) {
        e.printStackTrace();
    }
    
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsinks.ImportSink>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.importapi.models.importsinks.ImportSink.class);
    }

    public String getProjectKey() {return this.projectKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    
    @Override
    protected ByProjectKeyImportSinksPost copy()
    {
        return new ByProjectKeyImportSinksPost(this);
    }
}
