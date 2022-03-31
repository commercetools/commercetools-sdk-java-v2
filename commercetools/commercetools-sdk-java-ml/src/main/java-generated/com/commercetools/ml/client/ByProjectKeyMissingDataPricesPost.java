
package com.commercetools.ml.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMissingDataPricesPost extends
        BodyApiMethod<ByProjectKeyMissingDataPricesPost, com.commercetools.ml.models.common.TaskToken, com.commercetools.ml.models.missing_data.MissingPricesSearchRequest> {

    private String projectKey;

    private com.commercetools.ml.models.missing_data.MissingPricesSearchRequest missingPricesSearchRequest;

    public ByProjectKeyMissingDataPricesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.ml.models.missing_data.MissingPricesSearchRequest missingPricesSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.missingPricesSearchRequest = missingPricesSearchRequest;
    }

    public ByProjectKeyMissingDataPricesPost(ByProjectKeyMissingDataPricesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.missingPricesSearchRequest = t.missingPricesSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/prices", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(missingPricesSearchRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.ml.models.common.TaskToken.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.ml.models.common.TaskToken.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesSearchRequest getBody() {
        return missingPricesSearchRequest;
    }

    public ByProjectKeyMissingDataPricesPost withBody(
            com.commercetools.ml.models.missing_data.MissingPricesSearchRequest missingPricesSearchRequest) {
        ByProjectKeyMissingDataPricesPost t = copy();
        t.missingPricesSearchRequest = missingPricesSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMissingDataPricesPost that = (ByProjectKeyMissingDataPricesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(missingPricesSearchRequest, that.missingPricesSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(missingPricesSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyMissingDataPricesPost copy() {
        return new ByProjectKeyMissingDataPricesPost(this);
    }
}
