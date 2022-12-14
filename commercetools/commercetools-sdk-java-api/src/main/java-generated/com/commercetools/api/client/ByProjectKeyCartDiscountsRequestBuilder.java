
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartDiscountsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCartDiscountsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartDiscountsGet get() {
        return new ByProjectKeyCartDiscountsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartDiscountsPost post(
            com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft) {
        return new ByProjectKeyCartDiscountsPost(apiHttpClient, projectKey, cartDiscountDraft);
    }

    public ByProjectKeyCartDiscountsPost post(
            UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder.of()).build());
    }

    public ByProjectKeyCartDiscountsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCartDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCartDiscountsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCartDiscountsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCartDiscountsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart_discount.CartDiscount> cartDiscount,
            java.util.List<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction> actions) {
        return withId(cartDiscount.getId())
                .post(builder -> com.commercetools.api.models.cart_discount.CartDiscountUpdate.builder()
                        .version(cartDiscount.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyCartDiscountsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart_discount.CartDiscount> cartDiscount,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction, com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder>> op) {
        return withId(cartDiscount.getId())
                .post(builder -> com.commercetools.api.models.cart_discount.CartDiscountUpdate.builder()
                        .version(cartDiscount.getVersion())
                        .actions(op.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.cart_discount.CartDiscountUpdateAction, com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder, ByProjectKeyCartDiscountsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart_discount.CartDiscount> cartDiscount) {
        return builder -> withId(cartDiscount.getId())
                .post(b -> com.commercetools.api.models.cart_discount.CartDiscountUpdate.builder()
                        .version(cartDiscount.getVersion())
                        .actions(builder.apply(UpdateActionBuilder.of(
                            com.commercetools.api.models.cart_discount.CartDiscountUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyCartDiscountsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart_discount.CartDiscount> cartDiscount) {
        return withId(cartDiscount.getId()).delete().withVersion(cartDiscount.getVersion());
    }

    public ByProjectKeyCartDiscountsPost create(
            com.commercetools.api.models.cart_discount.CartDiscountDraft cartDiscountDraft) {
        return post(cartDiscountDraft);
    }

    public ByProjectKeyCartDiscountsPost create(
            UnaryOperator<com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart_discount.CartDiscountDraftBuilder.of()).build());
    }

}
