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
import com.commercetools.importapi.models.common.ProcessingState;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Retrieves all customer import operations of an import sink key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet extends ApiMethod<ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet> {

    
    private String projectKey;
    private String importSinkKey;
    

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/importSinkKey=%s/import-operations", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse.class);
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<String> getResourceKey() {
        return this.getQueryParam("resourceKey");
    }
    
    public List<String> getState() {
        return this.getQueryParam("state");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportSinkKey(final String importSinkKey) { this.importSinkKey = importSinkKey; }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final Double limit){
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final Double offset){
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final String sort){
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(final String resourceKey){
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("resourceKey", resourceKey);
    }
    
    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet withState(final ProcessingState state){
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(this).addQueryParam("state", state);
    }
    
    @Override
    protected ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet copy()
    {
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyImportOperationsGet(this);
    }
}
