
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCartDiscountsPost extends
        BodyApiMethod<ByProjectKeyCartDiscountsPost, com.commercetools.api.models.cart_discount.CartDiscount, com.commercetools.api.models.cart_discount.CartDiscountDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartDiscountsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyCartDiscountsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartDiscountsPost> {

    private String projectKey;

    private com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft;

    public ByProjectKeyCartDiscountsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.cartDiscountDraft = cartDiscountDraft;
    }

    public ByProjectKeyCartDiscountsPost(ByProjectKeyCartDiscountsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.cartDiscountDraft = t.cartDiscountDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/cart-discounts", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(cartDiscountDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.cart_discount.CartDiscount.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.cart_discount.CartDiscount.class);
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
     */
    public <TValue> ByProjectKeyCartDiscountsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyCartDiscountsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCartDiscountsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCartDiscountsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyCartDiscountsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCartDiscountsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyCartDiscountsPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyCartDiscountsPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.cart_discount.CartDiscountDraft getBody() {
        return cartDiscountDraft;
    }

    public ByProjectKeyCartDiscountsPost withBody(
            com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft) {
        ByProjectKeyCartDiscountsPost t = copy();
        t.cartDiscountDraft = cartDiscountDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCartDiscountsPost that = (ByProjectKeyCartDiscountsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(cartDiscountDraft, that.cartDiscountDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(cartDiscountDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyCartDiscountsPost copy() {
        return new ByProjectKeyCartDiscountsPost(this);
    }
}
