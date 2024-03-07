
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Updates the current or staged representation of a Product Tailoring by its Product ID in the specified Store.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .products()
 *            .withProductId("{productID}")
 *            .productTailoring()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString, com.commercetools.api.models.product_tailoring.ProductTailoring>
        implements
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String productID;

    private String productTailoringUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString(
            final ApiHttpClient apiHttpClient, String projectKey, String storeKey, String productID,
            String productTailoringUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productID = productID;
        this.productTailoringUpdate = productTailoringUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString(
            ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.productID = t.productID;
        this.productTailoringUpdate = t.productTailoringUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/products/%s/product-tailoring", this.projectKey,
            this.storeKey, this.productID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            productTailoringUpdate.getBytes(StandardCharsets.UTF_8));

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

    public String getProductID() {
        return this.productID;
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

    public void setProductID(final String productID) {
        this.productID = productID;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString withExpand(
            final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString addExpand(
            final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString withExpand(
            final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString addExpand(
            final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return productTailoringUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString withBody(
            String productTailoringUpdate) {
        ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString t = copy();
        t.productTailoringUpdate = productTailoringUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString that = (ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(productID, that.productID)
                .append(productTailoringUpdate, that.productTailoringUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(productID)
                .append(productTailoringUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString(this);
    }
}
