
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyProductsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductsByIDGet get() {
        return new ByProjectKeyProductsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDHead head() {
        return new ByProjectKeyProductsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDPost post(com.commercetools.api.models.product.ProductUpdate productUpdate) {
        return new ByProjectKeyProductsByIDPost(apiHttpClient, projectKey, ID, productUpdate);
    }

    public ByProjectKeyProductsByIDPost post(
            UnaryOperator<com.commercetools.api.models.product.ProductUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product.ProductUpdateBuilder.of()).build());
    }

    public ByProjectKeyProductsByIDDelete delete() {
        return new ByProjectKeyProductsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyProductsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

    public ByProjectKeyProductsByIDImagesRequestBuilder images() {
        return new ByProjectKeyProductsByIDImagesRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDProductSelectionsRequestBuilder productSelections() {
        return new ByProjectKeyProductsByIDProductSelectionsRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
