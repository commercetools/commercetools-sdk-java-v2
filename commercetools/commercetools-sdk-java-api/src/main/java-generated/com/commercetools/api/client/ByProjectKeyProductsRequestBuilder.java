
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductsGet get() {
        return new ByProjectKeyProductsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductsHead head() {
        return new ByProjectKeyProductsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductsPost post(com.commercetools.api.models.product.ProductDraft productDraft) {
        return new ByProjectKeyProductsPost(apiHttpClient, projectKey, productDraft);
    }

    public ByProjectKeyProductsPost post(UnaryOperator<com.commercetools.api.models.product.ProductDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product.ProductDraftBuilder.of()).build());
    }

    public ByProjectKeyProductsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product.Product> product,
            java.util.List<com.commercetools.api.models.product.ProductUpdateAction> actions) {
        return withId(product.getId()).post(builder -> com.commercetools.api.models.product.ProductUpdate.builder()
                .version(product.getVersion())
                .actions(actions));
    }

    public ByProjectKeyProductsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product.Product> product,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.product.ProductUpdateAction, com.commercetools.api.models.product.ProductUpdateActionBuilder>> op) {
        return withId(product.getId()).post(builder -> com.commercetools.api.models.product.ProductUpdate.builder()
                .version(product.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.product.ProductUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.product.ProductUpdateAction, com.commercetools.api.models.product.ProductUpdateActionBuilder, ByProjectKeyProductsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product.Product> product) {
        return builder -> withId(product.getId()).post(b -> com.commercetools.api.models.product.ProductUpdate.builder()
                .version(product.getVersion())
                .actions(builder.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.product.ProductUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyProductsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product.Product> product) {
        return withId(product.getId()).delete().withVersion(product.getVersion());
    }

    public ByProjectKeyProductsPost create(com.commercetools.api.models.product.ProductDraft productDraft) {
        return post(productDraft);
    }

    public ByProjectKeyProductsPost create(UnaryOperator<com.commercetools.api.models.product.ProductDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product.ProductDraftBuilder.of()).build());
    }

}
