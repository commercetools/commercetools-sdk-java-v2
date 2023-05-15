
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyQuoteRequestCancelActionQueryBuilderDsl {
    public MyQuoteRequestCancelActionQueryBuilderDsl() {
    }

    public static MyQuoteRequestCancelActionQueryBuilderDsl of() {
        return new MyQuoteRequestCancelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyQuoteRequestCancelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteRequestCancelActionQueryBuilderDsl::of));
    }
}
