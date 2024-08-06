
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Gets the current or staged representation of a Product Tailoring by its Product key in the specified Store.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .products()
 *            .withProductKey("{productKey}")
 *            .productTailoring()
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet extends
        TypeApiMethod<ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet, com.commercetools.api.models.product_tailoring.ProductTailoring>
        implements
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String productKey;

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String productKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productKey = productKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet(
            ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.productKey = t.productKey;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/products/key=%s/product-tailoring",
            encodePathParam(this.projectKey), encodePathParam(this.storeKey), encodePathParam(this.productKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_tailoring.ProductTailoring.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_tailoring.ProductTailoring.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getProductKey() {
        return this.productKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public void setProductKey(final String productKey) {
        this.productKey = productKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet withExpand(
            final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet addExpand(
            final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet withExpand(
            final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet addExpand(
            final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet that = (ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(productKey, that.productKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(productKey).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet(this);
    }
}
