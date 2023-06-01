package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyQuoteRequestUpdateQueryBuilderDsl  {
    public MyQuoteRequestUpdateQueryBuilderDsl() {
    }

    public static MyQuoteRequestUpdateQueryBuilderDsl of() {
        return new MyQuoteRequestUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyQuoteRequestUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, MyQuoteRequestUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyQuoteRequestUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.me.MyQuoteRequestUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyQuoteRequestUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.me.MyQuoteRequestUpdateActionQueryBuilderDsl.of())),
            MyQuoteRequestUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<MyQuoteRequestUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, MyQuoteRequestUpdateQueryBuilderDsl::of));
    }
    
}
