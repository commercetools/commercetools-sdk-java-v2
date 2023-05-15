
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyPaymentPagedQueryResponseQueryBuilderDsl {
    public MyPaymentPagedQueryResponseQueryBuilderDsl() {
    }

    public static MyPaymentPagedQueryResponseQueryBuilderDsl of() {
        return new MyPaymentPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyPaymentPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyPaymentPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyPaymentPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyPaymentPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyPaymentPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.me.MyPaymentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.me.MyPaymentQueryBuilderDsl.of())),
            MyPaymentPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyPaymentPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentPagedQueryResponseQueryBuilderDsl::of));
    }
}
