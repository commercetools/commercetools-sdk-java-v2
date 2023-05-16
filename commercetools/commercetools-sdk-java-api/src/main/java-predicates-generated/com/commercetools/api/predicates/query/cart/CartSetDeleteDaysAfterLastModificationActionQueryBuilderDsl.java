
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl {
    public CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl() {
    }

    public static CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl of() {
        return new CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, CartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }

}
