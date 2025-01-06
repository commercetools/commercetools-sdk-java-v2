
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>If the indexing is in progress or the feature is inactive, an ObjectNotFound error is returned. If inactive, you can reactivate it.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_search.ProductPagedSearchResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .products()
 *            .search()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsSearchPostString extends
        StringBodyApiMethod<ByProjectKeyProductsSearchPostString, com.commercetools.api.models.product_search.ProductPagedSearchResponse>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsSearchPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.product_search.ProductPagedSearchResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.product_search.ProductPagedSearchResponse>() {
        };
    }

    private String projectKey;

    private String productSearchRequest;

    public ByProjectKeyProductsSearchPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String productSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productSearchRequest = productSearchRequest;
    }

    public ByProjectKeyProductsSearchPostString(ByProjectKeyProductsSearchPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productSearchRequest = t.productSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/products/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            productSearchRequest.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_search.ProductPagedSearchResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.product_search.ProductPagedSearchResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_search.ProductPagedSearchResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_search.ProductPagedSearchResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return productSearchRequest;
    }

    public ByProjectKeyProductsSearchPostString withBody(String productSearchRequest) {
        ByProjectKeyProductsSearchPostString t = copy();
        t.productSearchRequest = productSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductsSearchPostString that = (ByProjectKeyProductsSearchPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productSearchRequest, that.productSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsSearchPostString copy() {
        return new ByProjectKeyProductsSearchPostString(this);
    }
}
