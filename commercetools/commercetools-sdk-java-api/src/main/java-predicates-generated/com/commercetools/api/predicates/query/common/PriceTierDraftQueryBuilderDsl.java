package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PriceTierDraftQueryBuilderDsl  {
    public PriceTierDraftQueryBuilderDsl() {
    }

    public static PriceTierDraftQueryBuilderDsl of() {
        return new PriceTierDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<PriceTierDraftQueryBuilderDsl> minimumQuantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minimumQuantity")),
        p -> new CombinationQueryPredicate<>(p, PriceTierDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PriceTierDraftQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            PriceTierDraftQueryBuilderDsl::of);
    }
    
    
}
