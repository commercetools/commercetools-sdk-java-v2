
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductSelectionsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyProductSelectionsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductSelectionsKeyByKeyGet get() {
        return new ByProjectKeyProductSelectionsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductSelectionsKeyByKeyHead head() {
        return new ByProjectKeyProductSelectionsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductSelectionsKeyByKeyPost post(
            com.commercetools.api.models.product_selection.ProductSelectionUpdate productSelectionUpdate) {
        return new ByProjectKeyProductSelectionsKeyByKeyPost(apiHttpClient, projectKey, key, productSelectionUpdate);
    }

    public ByProjectKeyProductSelectionsKeyByKeyPostString post(final String productSelectionUpdate) {
        return new ByProjectKeyProductSelectionsKeyByKeyPostString(apiHttpClient, projectKey, key,
            productSelectionUpdate);
    }

    public ByProjectKeyProductSelectionsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.product_selection.ProductSelectionUpdateBuilder> op) {
        return post(
            op.apply(com.commercetools.api.models.product_selection.ProductSelectionUpdateBuilder.of()).build());
    }

    public ByProjectKeyProductSelectionsKeyByKeyDelete delete() {
        return new ByProjectKeyProductSelectionsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyProductSelectionsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

    public ByProjectKeyProductSelectionsKeyByKeyProductsRequestBuilder products() {
        return new ByProjectKeyProductSelectionsKeyByKeyProductsRequestBuilder(apiHttpClient, projectKey, key);
    }

}
