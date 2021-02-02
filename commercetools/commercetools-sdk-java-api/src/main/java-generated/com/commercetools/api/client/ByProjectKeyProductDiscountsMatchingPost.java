
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductDiscountsMatchingPost extends
        ApiMethod<ByProjectKeyProductDiscountsMatchingPost, com.commercetools.api.models.product_discount.ProductDiscount>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductDiscountsMatchingPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyProductDiscountsMatchingPost> {

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
            Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product_discount.ProductDiscount>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.product_discount.ProductDiscount.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    protected ByProjectKeyProductDiscountsMatchingPost copy() {
        return new ByProjectKeyProductDiscountsMatchingPost(this);
    }
}
