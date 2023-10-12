
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>This endpoint can be used to simulate which Product Discounts would be applied if a specified Product Variant had a specified Price. Given Product and Product Variant IDs and a Price, this endpoint will return the ProductDiscount that would have been applied to that Price.</p>
 *  <p>If a Product Discount could not be found that could be applied to the Price of a Product Variant, a NoMatchingProductDiscountFound error is returned.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .productDiscounts()
 *            .matching()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductDiscountsMatchingPostString extends
        StringBodyApiMethod<ByProjectKeyProductDiscountsMatchingPostString, com.commercetools.api.models.product_discount.ProductDiscount>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsMatchingPostString> {

    public TypeReference<com.commercetools.api.models.product_discount.ProductDiscount> resultType() {
        return new TypeReference<com.commercetools.api.models.product_discount.ProductDiscount>() {
        };
    }

    private String projectKey;

    private String productDiscountMatchQuery;

    public ByProjectKeyProductDiscountsMatchingPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String productDiscountMatchQuery) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.productDiscountMatchQuery = productDiscountMatchQuery;
    }

    public ByProjectKeyProductDiscountsMatchingPostString(ByProjectKeyProductDiscountsMatchingPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.productDiscountMatchQuery = t.productDiscountMatchQuery;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/product-discounts/matching", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            productDiscountMatchQuery.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return productDiscountMatchQuery;
    }

    public ByProjectKeyProductDiscountsMatchingPostString withBody(String productDiscountMatchQuery) {
        ByProjectKeyProductDiscountsMatchingPostString t = copy();
        t.productDiscountMatchQuery = productDiscountMatchQuery;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductDiscountsMatchingPostString that = (ByProjectKeyProductDiscountsMatchingPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(productDiscountMatchQuery, that.productDiscountMatchQuery)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(productDiscountMatchQuery).toHashCode();
    }

    @Override
    protected ByProjectKeyProductDiscountsMatchingPostString copy() {
        return new ByProjectKeyProductDiscountsMatchingPostString(this);
    }
}
