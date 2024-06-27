
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_search.CustomerPagedSearchResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .search()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersSearchPost extends
        TypeBodyApiMethod<ByProjectKeyCustomersSearchPost, com.commercetools.api.models.customer_search.CustomerPagedSearchResponse, com.commercetools.api.models.customer_search.CustomerSearchRequest>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersSearchPost> {

    @Override
    public TypeReference<com.commercetools.api.models.customer_search.CustomerPagedSearchResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.customer_search.CustomerPagedSearchResponse>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.customer_search.CustomerSearchRequest customerSearchRequest;

    public ByProjectKeyCustomersSearchPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.customer_search.CustomerSearchRequest customerSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerSearchRequest = customerSearchRequest;
    }

    public ByProjectKeyCustomersSearchPost(ByProjectKeyCustomersSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerSearchRequest = t.customerSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerSearchRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer_search.CustomerPagedSearchResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.customer_search.CustomerPagedSearchResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_search.CustomerPagedSearchResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer_search.CustomerPagedSearchResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.customer_search.CustomerSearchRequest getBody() {
        return customerSearchRequest;
    }

    public ByProjectKeyCustomersSearchPost withBody(
            com.commercetools.api.models.customer_search.CustomerSearchRequest customerSearchRequest) {
        ByProjectKeyCustomersSearchPost t = copy();
        t.customerSearchRequest = customerSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomersSearchPost that = (ByProjectKeyCustomersSearchPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(customerSearchRequest, that.customerSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersSearchPost copy() {
        return new ByProjectKeyCustomersSearchPost(this);
    }
}
