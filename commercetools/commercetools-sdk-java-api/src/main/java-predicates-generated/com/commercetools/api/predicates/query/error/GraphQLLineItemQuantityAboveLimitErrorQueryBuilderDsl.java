
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl {
    public GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl() {
    }

    public static GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl of() {
        return new GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl> maxCartQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxCartQuantity")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl> lineItem() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItem")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityAboveLimitErrorQueryBuilderDsl::of));
    }

}
