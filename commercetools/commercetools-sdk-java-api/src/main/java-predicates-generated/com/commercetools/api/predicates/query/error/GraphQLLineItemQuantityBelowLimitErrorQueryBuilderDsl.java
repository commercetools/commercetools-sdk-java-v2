
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl {
    public GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl() {
    }

    public static GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl of() {
        return new GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl> minCartQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minCartQuantity")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl> lineItem() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItem")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLineItemQuantityBelowLimitErrorQueryBuilderDsl::of));
    }

}
