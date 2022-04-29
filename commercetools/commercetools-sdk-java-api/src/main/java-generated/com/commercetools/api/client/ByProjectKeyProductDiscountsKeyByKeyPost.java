
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
public class ByProjectKeyProductDiscountsKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyProductDiscountsKeyByKeyPost, com.commercetools.api.models.product_discount.ProductDiscount, com.commercetools.api.models.product_discount.ProductDiscountUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyProductDiscountsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyProductDiscountsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductDiscountsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate;

    public ByProjectKeyProductDiscountsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.productDiscountUpdate = productDiscountUpdate;
    }

    public ByProjectKeyProductDiscountsKeyByKeyPost(ByProjectKeyProductDiscountsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.productDiscountUpdate = t.productDiscountUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productDiscountUpdate)));

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

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyProductDiscountsKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyProductDiscountsKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyProductDiscountsKeyByKeyPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyProductDiscountsKeyByKeyPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.product_discount.ProductDiscountUpdate getBody() {
        return productDiscountUpdate;
    }

    public ByProjectKeyProductDiscountsKeyByKeyPost withBody(
            com.commercetools.api.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
        ByProjectKeyProductDiscountsKeyByKeyPost t = copy();
        t.productDiscountUpdate = productDiscountUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductDiscountsKeyByKeyPost that = (ByProjectKeyProductDiscountsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(key, that.key)
                .append(productDiscountUpdate, that.productDiscountUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).append(productDiscountUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyProductDiscountsKeyByKeyPost copy() {
        return new ByProjectKeyProductDiscountsKeyByKeyPost(this);
    }
}
