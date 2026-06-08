
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productDiscounts()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductDiscountsPost extends
        TypeBodyApiMethod<ByProjectKeyProductDiscountsPost, com.commercetools.api.models.product_discount.ProductDiscount, com.commercetools.api.models.product_discount.ProductDiscountDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductDiscountsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyProductDiscountsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsPost> {

    @Override
    public TypeReference<com.commercetools.api.models.product_discount.ProductDiscount> resultType() {
        return new TypeReference<com.commercetools.api.models.product_discount.ProductDiscount>() {
        };
    }

    private String projectKey;

    private com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft;

    public ByProjectKeyProductDiscountsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productDiscountDraft = productDiscountDraft;
    }

    public ByProjectKeyProductDiscountsPost(ByProjectKeyProductDiscountsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productDiscountDraft = t.productDiscountDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-discounts", encodePathParam(this.projectKey));
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productDiscountDraft)));

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
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductDiscountsPost
     */
    public <TValue> ByProjectKeyProductDiscountsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductDiscountsPost
     */
    public <TValue> ByProjectKeyProductDiscountsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyProductDiscountsPost
     */
    public ByProjectKeyProductDiscountsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyProductDiscountsPost
     */
    public ByProjectKeyProductDiscountsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyProductDiscountsPost
     */
    public ByProjectKeyProductDiscountsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyProductDiscountsPost
     */
    public ByProjectKeyProductDiscountsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyProductDiscountsPost
     */
    public <TValue> ByProjectKeyProductDiscountsPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyProductDiscountsPost
     */
    public <TValue> ByProjectKeyProductDiscountsPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_discount.ProductDiscountDraft getBody() {
        return productDiscountDraft;
    }

    public ByProjectKeyProductDiscountsPost withBody(
            com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft) {
        ByProjectKeyProductDiscountsPost t = copy();
        t.productDiscountDraft = productDiscountDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductDiscountsPost that = (ByProjectKeyProductDiscountsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productDiscountDraft, that.productDiscountDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productDiscountDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyProductDiscountsPost copy() {
        return new ByProjectKeyProductDiscountsPost(this);
    }
}
