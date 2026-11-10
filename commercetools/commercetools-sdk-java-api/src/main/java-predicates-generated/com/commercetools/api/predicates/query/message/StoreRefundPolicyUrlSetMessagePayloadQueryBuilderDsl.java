
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl {
    public StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl> refundPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refundPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreRefundPolicyUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
