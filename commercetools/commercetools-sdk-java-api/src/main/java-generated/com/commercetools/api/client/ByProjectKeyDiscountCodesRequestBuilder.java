
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountCodesRequestBuilder implements ByProjectKeyDiscountCodesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyDiscountCodesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyDiscountCodesGet get() {
        return new ByProjectKeyDiscountCodesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyDiscountCodesHead head() {
        return new ByProjectKeyDiscountCodesHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyDiscountCodesPost post(
            com.commercetools.api.models.discount_code.DiscountCodeDraft discountCodeDraft) {
        return new ByProjectKeyDiscountCodesPost(apiHttpClient, projectKey, discountCodeDraft);
    }

    public ByProjectKeyDiscountCodesPostString post(final String discountCodeDraft) {
        return new ByProjectKeyDiscountCodesPostString(apiHttpClient, projectKey, discountCodeDraft);
    }

    public ByProjectKeyDiscountCodesPost post(
            UnaryOperator<com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_code.DiscountCodeDraftBuilder.of()).build());
    }

    public ByProjectKeyDiscountCodesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyDiscountCodesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyDiscountCodesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyDiscountCodesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

}
