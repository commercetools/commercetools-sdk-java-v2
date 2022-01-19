
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDiscountsKeyByKeyPost extends
        ApiMethod<ByProjectKeyProductDiscountsKeyByKeyPost, com.commercetools.api.models.product_discount.ProductDiscount>
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productDiscountUpdate);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
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
     * set expand with the specificied value
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyProductDiscountsKeyByKeyPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
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
