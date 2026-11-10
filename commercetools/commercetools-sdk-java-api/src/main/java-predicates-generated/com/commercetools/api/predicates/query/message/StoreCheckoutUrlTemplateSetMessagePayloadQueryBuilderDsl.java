
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl {
    public StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl of() {
        return new StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl> checkoutUrlTemplate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("checkoutUrlTemplate")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessagePayloadQueryBuilderDsl::of));
    }

}
