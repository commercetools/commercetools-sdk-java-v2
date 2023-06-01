package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DiscountCodeSetNameActionQueryBuilderDsl  {
    public DiscountCodeSetNameActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetNameActionQueryBuilderDsl of() {
        return new DiscountCodeSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodeSetNameActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DiscountCodeSetNameActionQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountCodeSetNameActionQueryBuilderDsl::of);
    }
    
    
}
