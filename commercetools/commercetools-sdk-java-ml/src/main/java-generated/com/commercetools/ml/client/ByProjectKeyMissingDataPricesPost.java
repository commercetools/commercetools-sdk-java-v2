
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

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
public class ByProjectKeyMissingDataPricesPost
        extends ApiMethod<ByProjectKeyMissingDataPricesPost, com.commercetools.ml.models.common.TaskToken> {

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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/missing-data/prices", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(missingPricesSearchRequest);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.ml.models.common.TaskToken.class).toCompletableFuture(), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.ml.models.common.TaskToken.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
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