
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productDiscounts()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductDiscountsPostString extends
        StringBodyApiMethod<ByProjectKeyProductDiscountsPostString, com.commercetools.api.models.product_discount.ProductDiscount>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductDiscountsPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyProductDiscountsPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsPostString> {

    private String projectKey;

    private String productDiscountDraft;

    public ByProjectKeyProductDiscountsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String productDiscountDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productDiscountDraft = productDiscountDraft;
    }

    public ByProjectKeyProductDiscountsPostString(ByProjectKeyProductDiscountsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productDiscountDraft = t.productDiscountDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-discounts", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            productDiscountDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.product_discount.ProductDiscount.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product_discount.ProductDiscount.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyProductDiscountsPostString
     */
    public <TValue> ByProjectKeyProductDiscountsPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyProductDiscountsPostString
     */
    public <TValue> ByProjectKeyProductDiscountsPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductDiscountsPostString
     */
    public ByProjectKeyProductDiscountsPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductDiscountsPostString
     */
    public ByProjectKeyProductDiscountsPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductDiscountsPostString
     */
    public ByProjectKeyProductDiscountsPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductDiscountsPostString
     */
    public ByProjectKeyProductDiscountsPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyProductDiscountsPostString
     */
    public <TValue> ByProjectKeyProductDiscountsPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyProductDiscountsPostString
     */
    public <TValue> ByProjectKeyProductDiscountsPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return productDiscountDraft;
    }

    public ByProjectKeyProductDiscountsPostString withBody(String productDiscountDraft) {
        ByProjectKeyProductDiscountsPostString t = copy();
        t.productDiscountDraft = productDiscountDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductDiscountsPostString that = (ByProjectKeyProductDiscountsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productDiscountDraft, that.productDiscountDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productDiscountDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyProductDiscountsPostString copy() {
        return new ByProjectKeyProductDiscountsPostString(this);
    }
}
