
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
*  <p>Deletes the inventory given by the resource key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete extends
        ApiMethod<ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete, com.commercetools.importapi.models.importoperations.ImportOperationStatus>
        implements
        com.commercetools.importapi.client.Secured_by_manage_productsTrait<ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete> {

    private String projectKey;
    private String importSinkKey;
    private String resourceKey;

    public ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete(
            final ApiHttpClient apiHttpClient, String projectKey, String importSinkKey, String resourceKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.resourceKey = resourceKey;
    }

    public ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete(
            ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.resourceKey = t.resourceKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/inventories/importSinkKey=%s/resourceKey=%s", this.projectKey,
            this.importSinkKey, this.resourceKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationStatus> executeBlocking(
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importoperations.ImportOperationStatus>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.importapi.models.importoperations.ImportOperationStatus.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public String getResourceKey() {
        return this.resourceKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public void setResourceKey(final String resourceKey) {
        this.resourceKey = resourceKey;
    }

    @Override
    protected ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete copy() {
        return new ByProjectKeyInventoriesImportSinkKeyByImportSinkKeyResourceKeyByResourceKeyDelete(this);
    }
}
