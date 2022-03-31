
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
*  <p>Creates a new import request for order patches</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost extends
        BodyApiMethod<ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.OrderPatchImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_ordersTrait<ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost> {

    private String projectKey;
    private String importContainerKey;

    private com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest;

    public ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String importContainerKey,
            com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
        this.orderPatchImportRequest = orderPatchImportRequest;
    }

    public ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost(
            ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importContainerKey = t.importContainerKey;
        this.orderPatchImportRequest = t.orderPatchImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/order-patches/import-containers/%s", this.projectKey,
            this.importContainerKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderPatchImportRequest)));

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

    public String getImportContainerKey() {
        return this.importContainerKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportContainerKey(final String importContainerKey) {
        this.importContainerKey = importContainerKey;
    }

    public com.commercetools.importapi.models.importrequests.OrderPatchImportRequest getBody() {
        return orderPatchImportRequest;
    }

    public ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost withBody(
            com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest) {
        ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost t = copy();
        t.orderPatchImportRequest = orderPatchImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost that = (ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importContainerKey, that.importContainerKey)
                .append(orderPatchImportRequest, that.orderPatchImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importContainerKey)
                .append(orderPatchImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost copy() {
        return new ByProjectKeyOrderPatchesImportContainersByImportContainerKeyPost(this);
    }
}
