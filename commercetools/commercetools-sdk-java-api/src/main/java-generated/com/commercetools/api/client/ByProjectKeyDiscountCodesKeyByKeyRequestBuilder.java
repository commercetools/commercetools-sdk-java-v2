
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountCodesKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyDiscountCodesKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyDiscountCodesKeyByKeyGet get() {
        return new ByProjectKeyDiscountCodesKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyDiscountCodesKeyByKeyHead head() {
        return new ByProjectKeyDiscountCodesKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyDiscountCodesKeyByKeyPost post(
            com.commercetools.api.models.discount_code.DiscountCodeUpdate discountCodeUpdate) {
        return new ByProjectKeyDiscountCodesKeyByKeyPost(apiHttpClient, projectKey, key, discountCodeUpdate);
    }

    public ByProjectKeyDiscountCodesKeyByKeyPostString post(final String discountCodeUpdate) {
        return new ByProjectKeyDiscountCodesKeyByKeyPostString(apiHttpClient, projectKey, key, discountCodeUpdate);
    }

    public ByProjectKeyDiscountCodesKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.discount_code.DiscountCodeUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_code.DiscountCodeUpdateBuilder.of()).build());
    }

    public ByProjectKeyDiscountCodesKeyByKeyDelete delete() {
        return new ByProjectKeyDiscountCodesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyDiscountCodesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
