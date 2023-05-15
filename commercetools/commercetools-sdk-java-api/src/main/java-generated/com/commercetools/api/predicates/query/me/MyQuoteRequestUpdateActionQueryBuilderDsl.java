
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyQuoteRequestUpdateActionQueryBuilderDsl {
    public MyQuoteRequestUpdateActionQueryBuilderDsl() {
    }

    public static MyQuoteRequestUpdateActionQueryBuilderDsl of() {
        return new MyQuoteRequestUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyQuoteRequestUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteRequestUpdateActionQueryBuilderDsl::of));
    }
}
