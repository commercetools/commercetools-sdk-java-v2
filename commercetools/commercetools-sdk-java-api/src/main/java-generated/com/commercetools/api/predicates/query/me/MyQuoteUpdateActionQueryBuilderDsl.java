
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyQuoteUpdateActionQueryBuilderDsl {
    public MyQuoteUpdateActionQueryBuilderDsl() {
    }

    public static MyQuoteUpdateActionQueryBuilderDsl of() {
        return new MyQuoteUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyQuoteUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteUpdateActionQueryBuilderDsl::of));
    }
}
