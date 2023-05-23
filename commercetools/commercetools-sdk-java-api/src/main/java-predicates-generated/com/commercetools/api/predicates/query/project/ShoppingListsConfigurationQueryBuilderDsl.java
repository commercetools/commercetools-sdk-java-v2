
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ShoppingListsConfigurationQueryBuilderDsl {
    public ShoppingListsConfigurationQueryBuilderDsl() {
    }

    public static ShoppingListsConfigurationQueryBuilderDsl of() {
        return new ShoppingListsConfigurationQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ShoppingListsConfigurationQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListsConfigurationQueryBuilderDsl::of));
    }

}
