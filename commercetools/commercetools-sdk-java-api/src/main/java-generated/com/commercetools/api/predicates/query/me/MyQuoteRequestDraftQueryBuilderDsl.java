
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyQuoteRequestDraftQueryBuilderDsl {
    public MyQuoteRequestDraftQueryBuilderDsl() {
    }

    public static MyQuoteRequestDraftQueryBuilderDsl of() {
        return new MyQuoteRequestDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyQuoteRequestDraftQueryBuilderDsl> cartId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartId")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteRequestDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyQuoteRequestDraftQueryBuilderDsl> cartVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartVersion")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteRequestDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyQuoteRequestDraftQueryBuilderDsl> comment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("comment")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteRequestDraftQueryBuilderDsl::of));
    }
}
