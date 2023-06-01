package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyQuoteRequestUpdateActionQueryBuilderDsl  {
    public MyQuoteRequestUpdateActionQueryBuilderDsl() {
    }

    public static MyQuoteRequestUpdateActionQueryBuilderDsl of() {
        return new MyQuoteRequestUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyQuoteRequestUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyQuoteRequestUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<MyQuoteRequestUpdateActionQueryBuilderDsl> asCancelQuoteRequest(
        Function<com.commercetools.api.predicates.query.me.MyQuoteRequestCancelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyQuoteRequestCancelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyQuoteRequestCancelActionQueryBuilderDsl.of()),
            MyQuoteRequestUpdateActionQueryBuilderDsl::of);
    }
}
