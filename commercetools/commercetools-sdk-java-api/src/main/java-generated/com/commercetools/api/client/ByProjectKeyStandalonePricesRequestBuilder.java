
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyStandalonePricesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyStandalonePricesRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStandalonePricesGet get() {
        return new ByProjectKeyStandalonePricesGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyStandalonePricesPost post(
            com.commercetools.api.models.standalone_price.StandalonePriceDraft standalonePriceDraft) {
        return new ByProjectKeyStandalonePricesPost(apiHttpClient, projectKey, standalonePriceDraft);
    }

    public ByProjectKeyStandalonePricesPost post(
            UnaryOperator<com.commercetools.api.models.standalone_price.StandalonePriceDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.standalone_price.StandalonePriceDraftBuilder.of()).build());
    }

    public ByProjectKeyStandalonePricesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStandalonePricesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyStandalonePricesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStandalonePricesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyStandalonePricesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.standalone_price.StandalonePrice> standalonePrice,
            java.util.List<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction> actions) {
        return withId(standalonePrice.getId())
                .post(builder -> com.commercetools.api.models.standalone_price.StandalonePriceUpdate.builder()
                        .version(standalonePrice.getVersion())
                        .actions(actions));
    }

    public ByProjectKeyStandalonePricesByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.standalone_price.StandalonePrice> standalonePrice,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction, com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder>> op) {
        return withId(standalonePrice.getId()).post(
            builder -> com.commercetools.api.models.standalone_price.StandalonePriceUpdate.builder()
                    .version(standalonePrice.getVersion())
                    .actions(op.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction, com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder, ByProjectKeyStandalonePricesByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.standalone_price.StandalonePrice> standalonePrice) {
        return builder -> withId(standalonePrice.getId()).post(
            b -> com.commercetools.api.models.standalone_price.StandalonePriceUpdate.builder()
                    .version(standalonePrice.getVersion())
                    .actions(builder.apply(UpdateActionBuilder.of(
                        com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyStandalonePricesByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.standalone_price.StandalonePrice> standalonePrice) {
        return withId(standalonePrice.getId()).delete().withVersion(standalonePrice.getVersion());
    }

    public ByProjectKeyStandalonePricesPost create(
            com.commercetools.api.models.standalone_price.StandalonePriceDraft standalonePriceDraft) {
        return post(standalonePriceDraft);
    }

    public ByProjectKeyStandalonePricesPost create(
            UnaryOperator<com.commercetools.api.models.standalone_price.StandalonePriceDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.standalone_price.StandalonePriceDraftBuilder.of()).build());
    }

}
