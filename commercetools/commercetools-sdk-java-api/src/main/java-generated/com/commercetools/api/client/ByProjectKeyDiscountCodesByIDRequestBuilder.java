
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountCodesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyDiscountCodesByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyDiscountCodesByIDGet get() {
        return new ByProjectKeyDiscountCodesByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyDiscountCodesByIDPost post(
            com.commercetools.api.models.discount_code.DiscountCodeUpdate discountCodeUpdate) {
        return new ByProjectKeyDiscountCodesByIDPost(apiHttpClient, projectKey, ID, discountCodeUpdate);
    }

    public ByProjectKeyDiscountCodesByIDPost post(
            UnaryOperator<com.commercetools.api.models.discount_code.DiscountCodeUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_code.DiscountCodeUpdateBuilder.of()).build());
    }

    public ByProjectKeyDiscountCodesByIDDelete delete() {
        return new ByProjectKeyDiscountCodesByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyDiscountCodesByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
