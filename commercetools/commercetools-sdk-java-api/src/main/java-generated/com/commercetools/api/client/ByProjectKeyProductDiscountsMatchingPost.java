
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDiscountsMatchingPost extends
        ApiMethod<ByProjectKeyProductDiscountsMatchingPost, com.commercetools.api.models.product_discount.ProductDiscount>
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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-discounts/matching", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(productDiscountMatchQuery);
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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
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
