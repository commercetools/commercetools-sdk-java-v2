package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ClassificationShippingRateInputQueryBuilderDsl  {
    public ClassificationShippingRateInputQueryBuilderDsl() {
    }

    public static ClassificationShippingRateInputQueryBuilderDsl of() {
        return new ClassificationShippingRateInputQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ClassificationShippingRateInputQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ClassificationShippingRateInputQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ClassificationShippingRateInputQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ClassificationShippingRateInputQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ClassificationShippingRateInputQueryBuilderDsl> label(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("label"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ClassificationShippingRateInputQueryBuilderDsl::of);
    }
    
    
}
