package com.commercetools.importapi.client;

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

/**
*  <p>Retrieves an import summary for the given import sink.</p>
*  <p>The import summary is calculated on demand.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet extends ApiMethod<ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet> {

    
    private String projectKey;
    private String importSinkKey;
    

    public ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet(ByProjectKeyImportSummariesImportSinkKeyByImportSinkKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/import-summaries/importSinkKey=%s", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importsummaries.ImportSummary> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.importapi.models.importsummaries.ImportSummary> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importsummaries.ImportSummary>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.importapi.models.importsummaries.ImportSummary.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportSinkKey(final String importSinkKey) { this.importSinkKey = importSinkKey; }

}
