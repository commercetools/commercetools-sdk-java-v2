
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTailoringByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyProductTailoringByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductTailoringByIDGet get() {
        return new ByProjectKeyProductTailoringByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductTailoringByIDPost post(
            com.commercetools.api.models.cart.ProductTailoringUpdate productTailoringUpdate) {
        return new ByProjectKeyProductTailoringByIDPost(apiHttpClient, projectKey, ID, productTailoringUpdate);
    }

    public ByProjectKeyProductTailoringByIDPostString post(final String productTailoringUpdate) {
        return new ByProjectKeyProductTailoringByIDPostString(apiHttpClient, projectKey, ID, productTailoringUpdate);
    }

    public ByProjectKeyProductTailoringByIDPost post(
            UnaryOperator<com.commercetools.api.models.cart.ProductTailoringUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.ProductTailoringUpdateBuilder.of()).build());
    }

    public ByProjectKeyProductTailoringByIDDelete delete() {
        return new ByProjectKeyProductTailoringByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyProductTailoringByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
