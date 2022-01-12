
package com.commercetools.api.client;

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
public class ByProjectKeyOrdersSearchPost
        extends ApiMethod<ByProjectKeyOrdersSearchPost, com.commercetools.api.models.order.OrderPagedSearchResponse>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersSearchPost> {

    private String projectKey;

    private com.commercetools.api.models.order.OrderSearchRequest orderSearchRequest;

    public ByProjectKeyOrdersSearchPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.order.OrderSearchRequest orderSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderSearchRequest = orderSearchRequest;
    }

    public ByProjectKeyOrdersSearchPost(ByProjectKeyOrdersSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderSearchRequest = t.orderSearchRequest;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(orderSearchRequest);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.OrderPagedSearchResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.order.OrderPagedSearchResponse.class)
                .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.OrderPagedSearchResponse>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(), com.commercetools.api.models.order.OrderPagedSearchResponse.class)
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

        ByProjectKeyOrdersSearchPost that = (ByProjectKeyOrdersSearchPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(orderSearchRequest, that.orderSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(orderSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersSearchPost copy() {
        return new ByProjectKeyOrdersSearchPost(this);
    }
}
