
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Creates import request for creating new products or updating existing ones.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost extends
        BodyApiMethod<ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.ProductImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_productsTrait<ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost> {

    private String projectKey;
    private String importSinkKey;

    private com.commercetools.importapi.models.importrequests.ProductImportRequest productImportRequest;

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost(final ApiHttpClient apiHttpClient, String projectKey,
            String importSinkKey,
            com.commercetools.importapi.models.importrequests.ProductImportRequest productImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.productImportRequest = productImportRequest;
    }

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost(
            ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.productImportRequest = t.productImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/importSinkKey=%s", this.projectKey, this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productImportRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public com.commercetools.importapi.models.importrequests.ProductImportRequest getBody() {
        return productImportRequest;
    }

    public ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost withBody(
            com.commercetools.importapi.models.importrequests.ProductImportRequest productImportRequest) {
        ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost t = copy();
        t.productImportRequest = productImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost that = (ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .append(productImportRequest, that.productImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importSinkKey)
                .append(productImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost copy() {
        return new ByProjectKeyProductsImportSinkKeyByImportSinkKeyPost(this);
    }
}
