
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetShippingPolicyUrlActionQueryBuilderDsl {
    public StoreSetShippingPolicyUrlActionQueryBuilderDsl() {
    }

    public static StoreSetShippingPolicyUrlActionQueryBuilderDsl of() {
        return new StoreSetShippingPolicyUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetShippingPolicyUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetShippingPolicyUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetShippingPolicyUrlActionQueryBuilderDsl> shippingPolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingPolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetShippingPolicyUrlActionQueryBuilderDsl::of));
    }

}
