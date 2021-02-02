
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Create CartDiscount</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCartDiscountsPost
        extends ApiMethod<ByProjectKeyCartDiscountsPost, com.commercetools.api.models.cart_discount.CartDiscount>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCartDiscountsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartDiscountsPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyCartDiscountsPost> {

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
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/cart-discounts", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(cartDiscountDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(),
            com.commercetools.api.models.cart_discount.CartDiscount.class);
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

    public ByProjectKeyCartDiscountsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyCartDiscountsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyCartDiscountsPost copy() {
        return new ByProjectKeyCartDiscountsPost(this);
    }
}
