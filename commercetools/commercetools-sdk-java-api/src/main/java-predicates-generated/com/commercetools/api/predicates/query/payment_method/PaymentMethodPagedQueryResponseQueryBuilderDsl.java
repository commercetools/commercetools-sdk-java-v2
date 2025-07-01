
package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodPagedQueryResponseQueryBuilderDsl {
    public PaymentMethodPagedQueryResponseQueryBuilderDsl() {
    }

    public static PaymentMethodPagedQueryResponseQueryBuilderDsl of() {
        return new PaymentMethodPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<PaymentMethodPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl.of())),
            PaymentMethodPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<PaymentMethodPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPagedQueryResponseQueryBuilderDsl::of));
    }

}
