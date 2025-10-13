
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TransactionQueryBuilderDsl {
    public TransactionQueryBuilderDsl() {
    }

    public static TransactionQueryBuilderDsl of() {
        return new TransactionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TransactionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TransactionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<TransactionQueryBuilderDsl> timestamp() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("timestamp")),
            p -> new CombinationQueryPredicate<>(p, TransactionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TransactionQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, TransactionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TransactionQueryBuilderDsl> amount(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("amount"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            TransactionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<TransactionQueryBuilderDsl> interactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interactionId")),
            p -> new CombinationQueryPredicate<>(p, TransactionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TransactionQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, TransactionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TransactionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            TransactionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<TransactionQueryBuilderDsl> interfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceId")),
            p -> new CombinationQueryPredicate<>(p, TransactionQueryBuilderDsl::of));
    }

}
