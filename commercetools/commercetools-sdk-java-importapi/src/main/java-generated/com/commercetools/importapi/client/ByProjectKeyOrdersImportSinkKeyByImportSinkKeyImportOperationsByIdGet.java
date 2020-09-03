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
*  <p>Retrieves the import operation with the given id.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdGet extends ApiMethod<ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdGet> {

    
    private String projectKey;
    private String importSinkKey;
    private String id;
    

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdGet(final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdGet(ByProjectKeyOrdersImportSinkKeyByImportSinkKeyImportOperationsByIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.id = t.id;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/importSinkKey=%s/import-operations/%s", this.projectKey, this.importSinkKey, this.id);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setRelativeUrl(httpRequestPath); 
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.importapi.models.importoperations.ImportOperation.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}
    public String getImportSinkKey() {return this.importSinkKey;}
    public String getId() {return this.id;}


    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }
    
    public void setImportSinkKey(final String importSinkKey) { this.importSinkKey = importSinkKey; }
    
    public void setId(final String id) { this.id = id; }

}
