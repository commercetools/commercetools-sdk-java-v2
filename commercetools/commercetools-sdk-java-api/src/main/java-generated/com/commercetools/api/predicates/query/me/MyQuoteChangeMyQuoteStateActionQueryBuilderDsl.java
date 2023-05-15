
package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

public class MyQuoteChangeMyQuoteStateActionQueryBuilderDsl {
    public MyQuoteChangeMyQuoteStateActionQueryBuilderDsl() {
    }

    public static MyQuoteChangeMyQuoteStateActionQueryBuilderDsl of() {
        return new MyQuoteChangeMyQuoteStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyQuoteChangeMyQuoteStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteChangeMyQuoteStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyQuoteChangeMyQuoteStateActionQueryBuilderDsl> quoteState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quoteState")),
            p -> new CombinationQueryPredicate<>(p, MyQuoteChangeMyQuoteStateActionQueryBuilderDsl::of));
    }
}
