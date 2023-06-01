package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MultiBuyCustomLineItemsTargetQueryBuilderDsl  {
    public MultiBuyCustomLineItemsTargetQueryBuilderDsl() {
    }

    public static MultiBuyCustomLineItemsTargetQueryBuilderDsl of() {
        return new MultiBuyCustomLineItemsTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MultiBuyCustomLineItemsTargetQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, MultiBuyCustomLineItemsTargetQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MultiBuyCustomLineItemsTargetQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
        p -> new CombinationQueryPredicate<>(p, MultiBuyCustomLineItemsTargetQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MultiBuyCustomLineItemsTargetQueryBuilderDsl> triggerQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("triggerQuantity")),
        p -> new CombinationQueryPredicate<>(p, MultiBuyCustomLineItemsTargetQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MultiBuyCustomLineItemsTargetQueryBuilderDsl> discountedQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedQuantity")),
        p -> new CombinationQueryPredicate<>(p, MultiBuyCustomLineItemsTargetQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MultiBuyCustomLineItemsTargetQueryBuilderDsl> maxOccurrence() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxOccurrence")),
        p -> new CombinationQueryPredicate<>(p, MultiBuyCustomLineItemsTargetQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MultiBuyCustomLineItemsTargetQueryBuilderDsl> selectionMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("selectionMode")),
        p -> new CombinationQueryPredicate<>(p, MultiBuyCustomLineItemsTargetQueryBuilderDsl::of));
    }
    
}
