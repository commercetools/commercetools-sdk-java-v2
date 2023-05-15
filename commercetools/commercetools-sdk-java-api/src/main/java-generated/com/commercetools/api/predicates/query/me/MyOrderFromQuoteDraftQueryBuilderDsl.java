
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyOrderFromQuoteDraftQueryBuilderDsl {
    public MyOrderFromQuoteDraftQueryBuilderDsl() {
    }

    public static MyOrderFromQuoteDraftQueryBuilderDsl of() {
        return new MyOrderFromQuoteDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyOrderFromQuoteDraftQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, MyOrderFromQuoteDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyOrderFromQuoteDraftQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyOrderFromQuoteDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<MyOrderFromQuoteDraftQueryBuilderDsl> quoteStateToAccepted() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteStateToAccepted")),
            p -> new CombinationQueryPredicate<>(p, MyOrderFromQuoteDraftQueryBuilderDsl::of));
    }
}
