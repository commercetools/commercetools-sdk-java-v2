package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DuplicateVariantValuesErrorQueryBuilderDsl  {
    public DuplicateVariantValuesErrorQueryBuilderDsl() {
    }

    public static DuplicateVariantValuesErrorQueryBuilderDsl of() {
        return new DuplicateVariantValuesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicateVariantValuesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, DuplicateVariantValuesErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DuplicateVariantValuesErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, DuplicateVariantValuesErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DuplicateVariantValuesErrorQueryBuilderDsl> variantValues(
        Function<com.commercetools.api.predicates.query.error.VariantValuesQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.VariantValuesQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantValues"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.VariantValuesQueryBuilderDsl.of())),
            DuplicateVariantValuesErrorQueryBuilderDsl::of);
    }
    
    
}
