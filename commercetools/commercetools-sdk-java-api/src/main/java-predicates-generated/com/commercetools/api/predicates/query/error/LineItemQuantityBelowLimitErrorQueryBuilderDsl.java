
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class LineItemQuantityBelowLimitErrorQueryBuilderDsl {
    public LineItemQuantityBelowLimitErrorQueryBuilderDsl() {
    }

    public static LineItemQuantityBelowLimitErrorQueryBuilderDsl of() {
        return new LineItemQuantityBelowLimitErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LineItemQuantityBelowLimitErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQuantityBelowLimitErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemQuantityBelowLimitErrorQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemQuantityBelowLimitErrorQueryBuilderDsl> minCartQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minCartQuantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQuantityBelowLimitErrorQueryBuilderDsl> lineItem() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItem")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

}
