package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

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


/**
*  <p>Deletes the customer given by the resource key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete extends ApiMethod<ByProjectKeyCustomersImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete> {

    
    private String projectKey;
    private String importSinkKey;
    private String resourceKey;
    

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey, String resourceKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.resourceKey = resourceKey;
    }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete(ByProjectKeyCustomersImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.resourceKey = t.resourceKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/importSinkKey=%s/resourceKey=%s", this.projectKey, this.importSinkKey, this.resourceKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.DELETE);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationStatus> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationStatus>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.importapi.models.importoperations.ImportOperationStatus.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}
    public String getResourceKey() {return this.resourceKey;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportSinkKey(final String importSinkKey) { this.importSinkKey = importSinkKey; }
    
    public void setResourceKey(final String resourceKey) { this.resourceKey = resourceKey; }

}
