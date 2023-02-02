
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.standalone_price.StandalonePrice;
import com.commercetools.api.models.standalone_price.StandalonePriceDraft;
import com.commercetools.api.models.standalone_price.StandalonePriceDraftBuilder;
import com.commercetools.api.models.standalone_price.StandalonePriceUpdate;
import com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction;
import com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder;

public interface ByProjectKeyStandalonePricesRequestBuilderMixin {
    public ByProjectKeyStandalonePricesPost post(StandalonePriceDraft standalonePriceDraft);

    public ByProjectKeyStandalonePricesByIDRequestBuilder withId(String ID);

    public default ByProjectKeyStandalonePricesByIDPost update(Versioned<StandalonePrice> standalonePrice,
            List<StandalonePriceUpdateAction> actions) {
        return withId(standalonePrice.getId()).post(
            builder -> StandalonePriceUpdate.builder().version(standalonePrice.getVersion()).actions(actions));
    }

    public default ByProjectKeyStandalonePricesByIDPost update(Versioned<StandalonePrice> standalonePrice,
            UnaryOperator<UpdateActionBuilder<StandalonePriceUpdateAction, StandalonePriceUpdateActionBuilder>> op) {
        return withId(standalonePrice.getId()).post(builder -> StandalonePriceUpdate.builder()
                .version(standalonePrice.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(StandalonePriceUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<StandalonePriceUpdateAction, StandalonePriceUpdateActionBuilder, ByProjectKeyStandalonePricesByIDPost> update(
            Versioned<StandalonePrice> standalonePrice) {
        return builder -> withId(standalonePrice.getId()).post(b -> StandalonePriceUpdate.builder()
                .version(standalonePrice.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(StandalonePriceUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyStandalonePricesByIDDelete delete(Versioned<StandalonePrice> standalonePrice) {
        return withId(standalonePrice.getId()).delete().withVersion(standalonePrice.getVersion());
    }

    public default ByProjectKeyStandalonePricesPost create(StandalonePriceDraft standalonePriceDraft) {
        return post(standalonePriceDraft);
    }

    public default ByProjectKeyStandalonePricesPost create(UnaryOperator<StandalonePriceDraftBuilder> op) {
        return post(op.apply(StandalonePriceDraftBuilder.of()).build());
    }

}
