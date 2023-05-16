
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class MultiBuyLineItemsTargetQueryBuilderDsl {
    public MultiBuyLineItemsTargetQueryBuilderDsl() {
    }

    public static MultiBuyLineItemsTargetQueryBuilderDsl of() {
        return new MultiBuyLineItemsTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MultiBuyLineItemsTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, MultiBuyLineItemsTargetQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MultiBuyLineItemsTargetQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, MultiBuyLineItemsTargetQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MultiBuyLineItemsTargetQueryBuilderDsl> triggerQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("triggerQuantity")),
            p -> new CombinationQueryPredicate<>(p, MultiBuyLineItemsTargetQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MultiBuyLineItemsTargetQueryBuilderDsl> discountedQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedQuantity")),
            p -> new CombinationQueryPredicate<>(p, MultiBuyLineItemsTargetQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MultiBuyLineItemsTargetQueryBuilderDsl> maxOccurrence() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxOccurrence")),
            p -> new CombinationQueryPredicate<>(p, MultiBuyLineItemsTargetQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MultiBuyLineItemsTargetQueryBuilderDsl> selectionMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("selectionMode")),
            p -> new CombinationQueryPredicate<>(p, MultiBuyLineItemsTargetQueryBuilderDsl::of));
    }

}
