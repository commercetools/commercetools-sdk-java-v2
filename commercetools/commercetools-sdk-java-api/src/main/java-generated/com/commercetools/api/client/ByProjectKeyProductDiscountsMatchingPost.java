
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>This endpoint can be used to simulate which Product Discounts would be applied if a specified Product Variant had a specified Price.
*  Given Product and Product Variant IDs and a Price, this endpoint will return the <a href="ctp:api:type:ProductDiscount">ProductDiscount</a> that would have been applied to that Price.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDiscountsMatchingPost extends
        BodyApiMethod<ByProjectKeyProductDiscountsMatchingPost, com.commercetools.api.models.product_discount.ProductDiscount, com.commercetools.api.models.product_discount.ProductDiscountMatchQuery>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsMatchingPost> {

    private String projectKey;

    private com.commercetools.api.models.product_discount.ProductDiscountMatchQuery productDiscountMatchQuery;

    public ByProjectKeyProductDiscountsMatchingPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.product_discount.ProductDiscountMatchQuery productDiscountMatchQuery) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productDiscountMatchQuery = productDiscountMatchQuery;
    }

    public ByProjectKeyProductDiscountsMatchingPost(ByProjectKeyProductDiscountsMatchingPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productDiscountMatchQuery = t.productDiscountMatchQuery;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts/matching", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils.executing(
                () -> apiHttpClient().getSerializerService().toJsonByteArray(productDiscountMatchQuery)));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountMatchQuery getBody() {
        return productDiscountMatchQuery;
    }

    public ByProjectKeyProductDiscountsMatchingPost withBody(
            com.commercetools.api.models.product_discount.ProductDiscountMatchQuery productDiscountMatchQuery) {
        ByProjectKeyProductDiscountsMatchingPost t = copy();
        t.productDiscountMatchQuery = productDiscountMatchQuery;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductDiscountsMatchingPost that = (ByProjectKeyProductDiscountsMatchingPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productDiscountMatchQuery, that.productDiscountMatchQuery)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productDiscountMatchQuery).toHashCode();
    }

    @Override
    protected ByProjectKeyProductDiscountsMatchingPost copy() {
        return new ByProjectKeyProductDiscountsMatchingPost(this);
    }
}
