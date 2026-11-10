
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountGroupsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyDiscountGroupsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyDiscountGroupsKeyByKeyGet get() {
        return new ByProjectKeyDiscountGroupsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyDiscountGroupsKeyByKeyHead head() {
        return new ByProjectKeyDiscountGroupsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyDiscountGroupsKeyByKeyPost post(
            com.commercetools.api.models.discount_group.DiscountGroupUpdate discountGroupUpdate) {
        return new ByProjectKeyDiscountGroupsKeyByKeyPost(apiHttpClient, projectKey, key, discountGroupUpdate);
    }

    public ByProjectKeyDiscountGroupsKeyByKeyPostString post(final String discountGroupUpdate) {
        return new ByProjectKeyDiscountGroupsKeyByKeyPostString(apiHttpClient, projectKey, key, discountGroupUpdate);
    }

    public ByProjectKeyDiscountGroupsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.discount_group.DiscountGroupUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_group.DiscountGroupUpdateBuilder.of()).build());
    }

    public ByProjectKeyDiscountGroupsKeyByKeyDelete delete() {
        return new ByProjectKeyDiscountGroupsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyDiscountGroupsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
