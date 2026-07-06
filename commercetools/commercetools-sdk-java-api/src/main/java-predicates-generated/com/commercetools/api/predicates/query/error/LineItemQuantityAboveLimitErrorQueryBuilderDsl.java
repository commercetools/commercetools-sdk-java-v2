
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class LineItemQuantityAboveLimitErrorQueryBuilderDsl {
    public LineItemQuantityAboveLimitErrorQueryBuilderDsl() {
    }

    public static LineItemQuantityAboveLimitErrorQueryBuilderDsl of() {
        return new LineItemQuantityAboveLimitErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LineItemQuantityAboveLimitErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQuantityAboveLimitErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemQuantityAboveLimitErrorQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<LineItemQuantityAboveLimitErrorQueryBuilderDsl> maxCartQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxCartQuantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQuantityAboveLimitErrorQueryBuilderDsl> lineItem() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItem")),
            p -> new CombinationQueryPredicate<>(p, LineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

}
