
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_search.ProductPagedSearchResponse>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .products()
 *            .search()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsSearchPost extends
        TypeBodyApiMethod<ByProjectKeyProductsSearchPost, com.commercetools.api.models.product_search.ProductPagedSearchResponse, com.commercetools.api.models.product_search.ProductSearchRequest>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsSearchPost> {

    @Override
    public TypeReference<com.commercetools.api.models.product_search.ProductPagedSearchResponse> resultType() {
        return new TypeReference<com.commercetools.api.models.product_search.ProductPagedSearchResponse>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.product_search.ProductSearchRequest productSearchRequest;

    public ByProjectKeyProductsSearchPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product_search.ProductSearchRequest productSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productSearchRequest = productSearchRequest;
    }

    public ByProjectKeyProductsSearchPost(ByProjectKeyProductsSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productSearchRequest = t.productSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/products/search", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productSearchRequest)));

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

    public com.commercetools.api.models.product_search.ProductSearchRequest getBody() {
        return productSearchRequest;
    }

    public ByProjectKeyProductsSearchPost withBody(
            com.commercetools.api.models.product_search.ProductSearchRequest productSearchRequest) {
        ByProjectKeyProductsSearchPost t = copy();
        t.productSearchRequest = productSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductsSearchPost that = (ByProjectKeyProductsSearchPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productSearchRequest, that.productSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsSearchPost copy() {
        return new ByProjectKeyProductsSearchPost(this);
    }
}
