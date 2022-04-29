
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
*  <p>Creates import request for creating new customers or updating existing ones.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost extends
        BodyApiMethod<ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.CustomerImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_customersTrait<ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost> {

    private String projectKey;
    private String importSinkKey;

    private com.commercetools.importapi.models.importrequests.CustomerImportRequest customerImportRequest;

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost(final ApiHttpClient apiHttpClient, String projectKey,
            String importSinkKey,
            com.commercetools.importapi.models.importrequests.CustomerImportRequest customerImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.customerImportRequest = customerImportRequest;
    }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost(
            ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.customerImportRequest = t.customerImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/customers/importSinkKey=%s", this.projectKey, this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerImportRequest)));

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

    public com.commercetools.importapi.models.importrequests.CustomerImportRequest getBody() {
        return customerImportRequest;
    }

    public ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost withBody(
            com.commercetools.importapi.models.importrequests.CustomerImportRequest customerImportRequest) {
        ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost t = copy();
        t.customerImportRequest = customerImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost that = (ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .append(customerImportRequest, that.customerImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importSinkKey)
                .append(customerImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost copy() {
        return new ByProjectKeyCustomersImportSinkKeyByImportSinkKeyPost(this);
    }
}
