
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
public class ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost extends
        BodyApiMethod<ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.OrderPatchImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_ordersTrait<ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost> {

    private String projectKey;
    private String importSinkKey;

    private com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest;

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey,
            com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.orderPatchImportRequest = orderPatchImportRequest;
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost(
            ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.orderPatchImportRequest = t.orderPatchImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/order-patches/importSinkKey=%s", this.projectKey,
            this.importSinkKey);
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

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public com.commercetools.importapi.models.importrequests.OrderPatchImportRequest getBody() {
        return orderPatchImportRequest;
    }

    public ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost withBody(
            com.commercetools.importapi.models.importrequests.OrderPatchImportRequest orderPatchImportRequest) {
        ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost t = copy();
        t.orderPatchImportRequest = orderPatchImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost that = (ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .append(orderPatchImportRequest, that.orderPatchImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importSinkKey)
                .append(orderPatchImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost copy() {
        return new ByProjectKeyOrderPatchesImportSinkKeyByImportSinkKeyPost(this);
    }
}
