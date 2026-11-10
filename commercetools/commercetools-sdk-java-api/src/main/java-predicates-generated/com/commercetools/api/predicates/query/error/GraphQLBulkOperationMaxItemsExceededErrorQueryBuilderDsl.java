
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl {
    public GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl() {
    }

    public static GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl of() {
        return new GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl> provided() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("provided")),
            p -> new CombinationQueryPredicate<>(p, GraphQLBulkOperationMaxItemsExceededErrorQueryBuilderDsl::of));
    }

}
