package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TransactionDraftQueryBuilderDsl  {
    public TransactionDraftQueryBuilderDsl() {
    }

    public static TransactionDraftQueryBuilderDsl of() {
        return new TransactionDraftQueryBuilderDsl();
    }

    public DateTimeComparisonPredicateBuilder<TransactionDraftQueryBuilderDsl> timestamp() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("timestamp")),
        p -> new CombinationQueryPredicate<>(p, TransactionDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TransactionDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, TransactionDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TransactionDraftQueryBuilderDsl> amount(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amount"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TransactionDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<TransactionDraftQueryBuilderDsl> interactionId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interactionId")),
        p -> new CombinationQueryPredicate<>(p, TransactionDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TransactionDraftQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, TransactionDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TransactionDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            TransactionDraftQueryBuilderDsl::of);
    }
    
    
}
