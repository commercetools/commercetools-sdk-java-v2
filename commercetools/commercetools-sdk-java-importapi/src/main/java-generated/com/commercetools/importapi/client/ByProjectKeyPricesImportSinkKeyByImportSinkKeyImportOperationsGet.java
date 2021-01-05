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
*  <p>Retrieves all price import operations of an import sink key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet extends ApiMethod<ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet, com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> implements com.commercetools.importapi.client.Secured_by_view_productsTrait<ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet> {

    
    private String projectKey;
    private String importSinkKey;
    

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
    }

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet(ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/prices/importSinkKey=%s/import-operations", this.projectKey, this.importSinkKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    @Override
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

    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet withLimit(final Double limit){
        return copy().addQueryParam("limit", limit);
    }
    
    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet withOffset(final Double offset){
        return copy().addQueryParam("offset", offset);
    }
    
    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet withSort(final String sort){
        return copy().addQueryParam("sort", sort);
    }
    
    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet withResourceKey(final String resourceKey){
        return copy().addQueryParam("resourceKey", resourceKey);
    }
    
    public ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet withState(final ProcessingState state){
        return copy().addQueryParam("state", state);
    }
    
    @Override
    protected ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet copy()
    {
        return new ByProjectKeyPricesImportSinkKeyByImportSinkKeyImportOperationsGet(this);
    }
}
