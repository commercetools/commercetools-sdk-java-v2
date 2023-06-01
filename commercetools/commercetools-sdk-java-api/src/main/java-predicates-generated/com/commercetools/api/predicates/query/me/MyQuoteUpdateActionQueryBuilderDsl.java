package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyQuoteUpdateActionQueryBuilderDsl  {
    public MyQuoteUpdateActionQueryBuilderDsl() {
    }

    public static MyQuoteUpdateActionQueryBuilderDsl of() {
        return new MyQuoteUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyQuoteUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyQuoteUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<MyQuoteUpdateActionQueryBuilderDsl> asChangeMyQuoteState(
        Function<com.commercetools.api.predicates.query.me.MyQuoteChangeMyQuoteStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyQuoteChangeMyQuoteStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyQuoteChangeMyQuoteStateActionQueryBuilderDsl.of()),
            MyQuoteUpdateActionQueryBuilderDsl::of);
    }
}
