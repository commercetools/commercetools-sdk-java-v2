
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductDiscountsRequestBuilder implements ByProjectKeyProductDiscountsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductDiscountsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductDiscountsGet get() {
        return new ByProjectKeyProductDiscountsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductDiscountsPost post(
            com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft) {
        return new ByProjectKeyProductDiscountsPost(apiHttpClient, projectKey, productDiscountDraft);
    }

    public ByProjectKeyProductDiscountsPostString post(final String productDiscountDraft) {
        return new ByProjectKeyProductDiscountsPostString(apiHttpClient, projectKey, productDiscountDraft);
    }

    public ByProjectKeyProductDiscountsPost post(
            UnaryOperator<com.commercetools.api.models.product_discount.ProductDiscountDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_discount.ProductDiscountDraftBuilder.of()).build());
    }

    public ByProjectKeyProductDiscountsMatchingRequestBuilder matching() {
        return new ByProjectKeyProductDiscountsMatchingRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductDiscountsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductDiscountsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductDiscountsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
