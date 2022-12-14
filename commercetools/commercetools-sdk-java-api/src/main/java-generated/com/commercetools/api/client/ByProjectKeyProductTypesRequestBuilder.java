
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTypesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductTypesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductTypesGet get() {
        return new ByProjectKeyProductTypesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductTypesHead head() {
        return new ByProjectKeyProductTypesHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductTypesPost post(
            com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft) {
        return new ByProjectKeyProductTypesPost(apiHttpClient, projectKey, productTypeDraft);
    }

    public ByProjectKeyProductTypesPost post(
            UnaryOperator<com.commercetools.api.models.product_type.ProductTypeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_type.ProductTypeDraftBuilder.of()).build());
    }

    public ByProjectKeyProductTypesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductTypesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductTypesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_type.ProductType> productType,
            java.util.List<com.commercetools.api.models.product_type.ProductTypeUpdateAction> actions) {
        return withId(productType.getId())
                .post(builder -> com.commercetools.api.models.product_type.ProductTypeUpdate.builder()
                        .version(productType.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyProductTypesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_type.ProductType> productType,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.product_type.ProductTypeUpdateAction, com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder>> op) {
        return withId(productType.getId()).post(builder -> com.commercetools.api.models.product_type.ProductTypeUpdate
                .builder()
                .version(productType.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.product_type.ProductTypeUpdateAction, com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder, ByProjectKeyProductTypesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_type.ProductType> productType) {
        return builder -> withId(productType.getId())
                .post(b -> com.commercetools.api.models.product_type.ProductTypeUpdate.builder()
                        .version(productType.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.product_type.ProductTypeUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyProductTypesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_type.ProductType> productType) {
        return withId(productType.getId()).delete().withVersion(productType.getVersion());
    }

    public ByProjectKeyProductTypesPost create(
            com.commercetools.api.models.product_type.ProductTypeDraft productTypeDraft) {
        return post(productTypeDraft);
    }

    public ByProjectKeyProductTypesPost create(
            UnaryOperator<com.commercetools.api.models.product_type.ProductTypeDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_type.ProductTypeDraftBuilder.of()).build());
    }

}
