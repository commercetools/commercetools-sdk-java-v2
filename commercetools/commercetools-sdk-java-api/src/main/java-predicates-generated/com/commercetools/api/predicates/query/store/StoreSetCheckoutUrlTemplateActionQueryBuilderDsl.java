
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreSetCheckoutUrlTemplateActionQueryBuilderDsl {
    public StoreSetCheckoutUrlTemplateActionQueryBuilderDsl() {
    }

    public static StoreSetCheckoutUrlTemplateActionQueryBuilderDsl of() {
        return new StoreSetCheckoutUrlTemplateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSetCheckoutUrlTemplateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCheckoutUrlTemplateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSetCheckoutUrlTemplateActionQueryBuilderDsl> checkoutUrlTemplate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("checkoutUrlTemplate")),
            p -> new CombinationQueryPredicate<>(p, StoreSetCheckoutUrlTemplateActionQueryBuilderDsl::of));
    }

}
