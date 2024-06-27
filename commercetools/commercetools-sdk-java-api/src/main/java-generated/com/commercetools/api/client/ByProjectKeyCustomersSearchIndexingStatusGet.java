
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customers()
 *            .searchIndexingStatus()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersSearchIndexingStatusGet extends
        TypeApiMethod<ByProjectKeyCustomersSearchIndexingStatusGet, com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomersSearchIndexingStatusGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomersSearchIndexingStatusGet> {

    @Override
    public TypeReference<com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse>() {
        };
    }

    private String projectKey;

    public ByProjectKeyCustomersSearchIndexingStatusGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersSearchIndexingStatusGet(ByProjectKeyCustomersSearchIndexingStatusGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customers/search/indexing-status", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer_search.CustomerSearchIndexingStatusResponse.class);
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

        ByProjectKeyCustomersSearchIndexingStatusGet that = (ByProjectKeyCustomersSearchIndexingStatusGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomersSearchIndexingStatusGet copy() {
        return new ByProjectKeyCustomersSearchIndexingStatusGet(this);
    }
}
