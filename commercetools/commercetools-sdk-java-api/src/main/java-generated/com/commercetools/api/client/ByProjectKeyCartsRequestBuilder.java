
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCartsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCartsGet get() {
        return new ByProjectKeyCartsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartsPost post(com.commercetools.api.models.cart.CartDraft cartDraft) {
        return new ByProjectKeyCartsPost(apiHttpClient, projectKey, cartDraft);
    }

    public ByProjectKeyCartsPost post(UnaryOperator<com.commercetools.api.models.cart.CartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.CartDraftBuilder.of()).build());
    }

    public ByProjectKeyCartsReplicateRequestBuilder replicate() {
        return new ByProjectKeyCartsReplicateRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdRequestBuilder withCustomerId(String customerId) {
        return new ByProjectKeyCartsCustomerIdByCustomerIdRequestBuilder(apiHttpClient, projectKey, customerId);
    }

    public ByProjectKeyCartsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCartsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCartsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCartsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCartsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart,
            java.util.List<com.commercetools.api.models.cart.CartUpdateAction> actions) {
        return withId(cart.getId()).post(builder -> com.commercetools.api.models.cart.CartUpdate.builder()
                .version(cart.getVersion())
                .actions(actions));
    }

    public ByProjectKeyCartsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.cart.CartUpdateAction, com.commercetools.api.models.cart.CartUpdateActionBuilder>> op) {
        return withId(cart.getId()).post(builder -> com.commercetools.api.models.cart.CartUpdate.builder()
                .version(cart.getVersion())
                .actions(op.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.cart.CartUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.cart.CartUpdateAction, com.commercetools.api.models.cart.CartUpdateActionBuilder, ByProjectKeyCartsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart) {
        return builder -> withId(cart.getId()).post(b -> com.commercetools.api.models.cart.CartUpdate.builder()
                .version(cart.getVersion())
                .actions(builder.apply(
                    UpdateActionBuilder.of(com.commercetools.api.models.cart.CartUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyCartsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.cart.Cart> cart) {
        return withId(cart.getId()).delete().withVersion(cart.getVersion());
    }

    public ByProjectKeyCartsPost create(com.commercetools.api.models.cart.CartDraft cartDraft) {
        return post(cartDraft);
    }

    public ByProjectKeyCartsPost create(UnaryOperator<com.commercetools.api.models.cart.CartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.CartDraftBuilder.of()).build());
    }

}
