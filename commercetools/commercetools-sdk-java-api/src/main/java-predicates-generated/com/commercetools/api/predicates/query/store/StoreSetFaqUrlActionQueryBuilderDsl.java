
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetFaqUrlActionQueryBuilderDsl {
    public StoreSetFaqUrlActionQueryBuilderDsl() {
    }

    public static StoreSetFaqUrlActionQueryBuilderDsl of() {
        return new StoreSetFaqUrlActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetFaqUrlActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetFaqUrlActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetFaqUrlActionQueryBuilderDsl> faqUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("faqUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreSetFaqUrlActionQueryBuilderDsl::of));
    }

}
