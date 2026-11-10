
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetTermsOfServiceUrlActionQueryBuilderDsl {
    public StoreSetTermsOfServiceUrlActionQueryBuilderDsl() {
    }

    public static StoreSetTermsOfServiceUrlActionQueryBuilderDsl of() {
        return new StoreSetTermsOfServiceUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetTermsOfServiceUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetTermsOfServiceUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetTermsOfServiceUrlActionQueryBuilderDsl> termsOfServiceUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("termsOfServiceUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetTermsOfServiceUrlActionQueryBuilderDsl::of));
    }

}
