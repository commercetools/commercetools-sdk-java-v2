
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetCookiePolicyUrlActionQueryBuilderDsl {
    public StoreSetCookiePolicyUrlActionQueryBuilderDsl() {
    }

    public static StoreSetCookiePolicyUrlActionQueryBuilderDsl of() {
        return new StoreSetCookiePolicyUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetCookiePolicyUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCookiePolicyUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetCookiePolicyUrlActionQueryBuilderDsl> cookiePolicyUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cookiePolicyUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCookiePolicyUrlActionQueryBuilderDsl::of));
    }

}
