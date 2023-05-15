
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentPagedQueryResponseQueryBuilderDsl {
    public PaymentPagedQueryResponseQueryBuilderDsl() {
    }

    public static PaymentPagedQueryResponseQueryBuilderDsl of() {
        return new PaymentPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<PaymentPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, PaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, PaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, PaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, PaymentPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl.of())),
            PaymentPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<PaymentPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, PaymentPagedQueryResponseQueryBuilderDsl::of));
    }
}
