
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetOrderUrlTemplateActionQueryBuilderDsl {
    public StoreSetOrderUrlTemplateActionQueryBuilderDsl() {
    }

    public static StoreSetOrderUrlTemplateActionQueryBuilderDsl of() {
        return new StoreSetOrderUrlTemplateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetOrderUrlTemplateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetOrderUrlTemplateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetOrderUrlTemplateActionQueryBuilderDsl> orderUrlTemplate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderUrlTemplate")),
            p -> new CombinationQueryPredicate<>(p, StoreSetOrderUrlTemplateActionQueryBuilderDsl::of));
    }

}
