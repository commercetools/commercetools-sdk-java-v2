
package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl {
    public ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl() {
    }

    public static ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl of() {
        return new ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p,
                ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }

}
