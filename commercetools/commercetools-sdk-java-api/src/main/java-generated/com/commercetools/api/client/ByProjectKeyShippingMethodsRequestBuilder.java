
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyShippingMethodsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyShippingMethodsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyShippingMethodsGet get() {
        return new ByProjectKeyShippingMethodsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsPost post(
            com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft) {
        return new ByProjectKeyShippingMethodsPost(apiHttpClient, projectKey, shippingMethodDraft);
    }

    public ByProjectKeyShippingMethodsPost post(
            UnaryOperator<com.commercetools.api.models.shipping_method.ShippingMethodDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shipping_method.ShippingMethodDraftBuilder.of()).build());
    }

    public ByProjectKeyShippingMethodsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyShippingMethodsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyShippingMethodsMatchingCartRequestBuilder matchingCart() {
        return new ByProjectKeyShippingMethodsMatchingCartRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsMatchingCartLocationRequestBuilder matchingCartLocation() {
        return new ByProjectKeyShippingMethodsMatchingCartLocationRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsMatchingOrdereditRequestBuilder matchingOrderedit() {
        return new ByProjectKeyShippingMethodsMatchingOrdereditRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsMatchingLocationRequestBuilder matchingLocation() {
        return new ByProjectKeyShippingMethodsMatchingLocationRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyShippingMethodsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyShippingMethodsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyShippingMethodsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shipping_method.ShippingMethod> shippingMethod,
            java.util.List<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction> actions) {
        return withId(shippingMethod.getId())
                .post(builder -> com.commercetools.api.models.shipping_method.ShippingMethodUpdate.builder()
                        .version(shippingMethod.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyShippingMethodsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shipping_method.ShippingMethod> shippingMethod,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction, com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder>> op) {
        return withId(shippingMethod.getId()).post(
            builder -> com.commercetools.api.models.shipping_method.ShippingMethodUpdate.builder()
                    .version(shippingMethod.getVersion())
                    .actions(op.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction, com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder, ByProjectKeyShippingMethodsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shipping_method.ShippingMethod> shippingMethod) {
        return builder -> withId(shippingMethod.getId()).post(
            b -> com.commercetools.api.models.shipping_method.ShippingMethodUpdate.builder()
                    .version(shippingMethod.getVersion())
                    .actions(builder.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.shipping_method.ShippingMethodUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyShippingMethodsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.shipping_method.ShippingMethod> shippingMethod) {
        return withId(shippingMethod.getId()).delete().withVersion(shippingMethod.getVersion());
    }

    public ByProjectKeyShippingMethodsPost create(
            com.commercetools.api.models.shipping_method.ShippingMethodDraft shippingMethodDraft) {
        return post(shippingMethodDraft);
    }

    public ByProjectKeyShippingMethodsPost create(
            UnaryOperator<com.commercetools.api.models.shipping_method.ShippingMethodDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shipping_method.ShippingMethodDraftBuilder.of()).build());
    }

}
