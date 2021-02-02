
package com.commercetools.importapi.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Retrieves the import operation with the given id.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet extends
        ApiMethod<ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet, com.commercetools.importapi.models.importoperations.ImportOperation>
        implements
        com.commercetools.importapi.client.Secured_by_view_productsTrait<ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet> {

    private String projectKey;
    private String importSinkKey;
    private String id;

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(
            final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey, String id) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.id = id;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(
            ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.id = t.id;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types/importSinkKey=%s/import-operations/%s",
            this.projectKey, this.importSinkKey, this.id);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperation>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.importapi.models.importoperations.ImportOperation.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public String getId() {
        return this.id;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    protected ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet copy() {
        return new ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyImportOperationsByIdGet(this);
    }
}
