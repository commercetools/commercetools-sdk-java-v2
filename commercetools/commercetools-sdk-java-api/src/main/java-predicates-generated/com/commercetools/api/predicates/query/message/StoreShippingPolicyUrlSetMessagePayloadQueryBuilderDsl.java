
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl {
    public StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl> shippingPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreShippingPolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
