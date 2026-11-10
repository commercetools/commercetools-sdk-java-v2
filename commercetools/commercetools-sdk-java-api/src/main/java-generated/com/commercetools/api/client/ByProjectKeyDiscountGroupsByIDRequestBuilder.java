
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyDiscountGroupsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyDiscountGroupsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyDiscountGroupsByIDGet get() {
        return new ByProjectKeyDiscountGroupsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyDiscountGroupsByIDHead head() {
        return new ByProjectKeyDiscountGroupsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyDiscountGroupsByIDPost post(
            com.commercetools.api.models.discount_group.DiscountGroupUpdate discountGroupUpdate) {
        return new ByProjectKeyDiscountGroupsByIDPost(apiHttpClient, projectKey, ID, discountGroupUpdate);
    }

    public ByProjectKeyDiscountGroupsByIDPostString post(final String discountGroupUpdate) {
        return new ByProjectKeyDiscountGroupsByIDPostString(apiHttpClient, projectKey, ID, discountGroupUpdate);
    }

    public ByProjectKeyDiscountGroupsByIDPost post(
            UnaryOperator<com.commercetools.api.models.discount_group.DiscountGroupUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.discount_group.DiscountGroupUpdateBuilder.of()).build());
    }

    public ByProjectKeyDiscountGroupsByIDDelete delete() {
        return new ByProjectKeyDiscountGroupsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyDiscountGroupsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
