
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetRefundPolicyUrlActionQueryBuilderDsl {
    public StoreSetRefundPolicyUrlActionQueryBuilderDsl() {
    }

    public static StoreSetRefundPolicyUrlActionQueryBuilderDsl of() {
        return new StoreSetRefundPolicyUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetRefundPolicyUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetRefundPolicyUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetRefundPolicyUrlActionQueryBuilderDsl> refundPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refundPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetRefundPolicyUrlActionQueryBuilderDsl::of));
    }

}
