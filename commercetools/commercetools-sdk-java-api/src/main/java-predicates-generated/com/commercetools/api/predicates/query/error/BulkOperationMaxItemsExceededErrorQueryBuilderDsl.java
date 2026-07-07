
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class BulkOperationMaxItemsExceededErrorQueryBuilderDsl {
    public BulkOperationMaxItemsExceededErrorQueryBuilderDsl() {
    }

    public static BulkOperationMaxItemsExceededErrorQueryBuilderDsl of() {
        return new BulkOperationMaxItemsExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BulkOperationMaxItemsExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, BulkOperationMaxItemsExceededErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BulkOperationMaxItemsExceededErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, BulkOperationMaxItemsExceededErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BulkOperationMaxItemsExceededErrorQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, BulkOperationMaxItemsExceededErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BulkOperationMaxItemsExceededErrorQueryBuilderDsl> provided() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("provided")),
            p -> new CombinationQueryPredicate<>(p, BulkOperationMaxItemsExceededErrorQueryBuilderDsl::of));
    }

}
