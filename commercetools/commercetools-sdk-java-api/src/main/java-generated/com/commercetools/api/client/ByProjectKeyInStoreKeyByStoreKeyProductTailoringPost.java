
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
 *  <p>Creates a ProductTailoring in the Store specified by <code>storeKey</code>. When using this endpoint the ProductTailoring's <code>store</code> field is always set to the Store specified in the path parameter.</p>
 *  <p>Generates the ProductTailoringCreated Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_tailoring.ProductTailoring>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .productTailoring()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost, com.commercetools.api.models.product_tailoring.ProductTailoring, com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost> {

    @Override
    public TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring> resultType() {
        return new TypeReference<com.commercetools.api.models.product_tailoring.ProductTailoring>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraft productTailoringInStoreDraft;

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey,
            com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraft productTailoringInStoreDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productTailoringInStoreDraft = productTailoringInStoreDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost(
            ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.productTailoringInStoreDraft = t.productTailoringInStoreDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/product-tailoring", encodePathParam(this.projectKey),
            encodePathParam(this.storeKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(productTailoringInStoreDraft)));

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

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraft getBody() {
        return productTailoringInStoreDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost withBody(
            com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraft productTailoringInStoreDraft) {
        ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost t = copy();
        t.productTailoringInStoreDraft = productTailoringInStoreDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost that = (ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(productTailoringInStoreDraft, that.productTailoringInStoreDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(productTailoringInStoreDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost(this);
    }
}
