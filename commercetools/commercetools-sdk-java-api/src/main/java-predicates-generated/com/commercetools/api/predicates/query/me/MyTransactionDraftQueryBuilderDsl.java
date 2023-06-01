package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyTransactionDraftQueryBuilderDsl  {
    public MyTransactionDraftQueryBuilderDsl() {
    }

    public static MyTransactionDraftQueryBuilderDsl of() {
        return new MyTransactionDraftQueryBuilderDsl();
    }

    public DateTimeComparisonPredicateBuilder<MyTransactionDraftQueryBuilderDsl> timestamp() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("timestamp")),
        p -> new CombinationQueryPredicate<>(p, MyTransactionDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyTransactionDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, MyTransactionDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyTransactionDraftQueryBuilderDsl> amount(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amount"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            MyTransactionDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<MyTransactionDraftQueryBuilderDsl> interactionId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interactionId")),
        p -> new CombinationQueryPredicate<>(p, MyTransactionDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyTransactionDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            MyTransactionDraftQueryBuilderDsl::of);
    }
    
    
}
