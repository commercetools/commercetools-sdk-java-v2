
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductDiscountsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductDiscountsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductDiscountsGet get() {
        return new ByProjectKeyProductDiscountsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductDiscountsPost post(
            com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft) {
        return new ByProjectKeyProductDiscountsPost(apiHttpClient, projectKey, productDiscountDraft);
    }

    public ByProjectKeyProductDiscountsPost post(
            UnaryOperator<com.commercetools.api.models.product_discount.ProductDiscountDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_discount.ProductDiscountDraftBuilder.of()).build());
    }

    public ByProjectKeyProductDiscountsMatchingRequestBuilder matching() {
        return new ByProjectKeyProductDiscountsMatchingRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductDiscountsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductDiscountsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductDiscountsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductDiscountsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_discount.ProductDiscount> productDiscount,
            java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions) {
        return withId(productDiscount.getId())
                .post(builder -> com.commercetools.api.models.product_discount.ProductDiscountUpdate.builder()
                        .version(productDiscount.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyProductDiscountsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_discount.ProductDiscount> productDiscount,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction, com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder>> op) {
        return withId(productDiscount.getId()).post(
            builder -> com.commercetools.api.models.product_discount.ProductDiscountUpdate.builder()
                    .version(productDiscount.getVersion())
                    .actions(op.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction, com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder, ByProjectKeyProductDiscountsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_discount.ProductDiscount> productDiscount) {
        return builder -> withId(productDiscount.getId()).post(
            b -> com.commercetools.api.models.product_discount.ProductDiscountUpdate.builder()
                    .version(productDiscount.getVersion())
                    .actions(builder.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.product_discount.ProductDiscountUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyProductDiscountsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.product_discount.ProductDiscount> productDiscount) {
        return withId(productDiscount.getId()).delete().withVersion(productDiscount.getVersion());
    }

    public ByProjectKeyProductDiscountsPost create(
            com.commercetools.api.models.product_discount.ProductDiscountDraft productDiscountDraft) {
        return post(productDiscountDraft);
    }

    public ByProjectKeyProductDiscountsPost create(
            UnaryOperator<com.commercetools.api.models.product_discount.ProductDiscountDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_discount.ProductDiscountDraftBuilder.of()).build());
    }

}
