package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TypeChangeLabelActionQueryBuilderDsl  {
    public TypeChangeLabelActionQueryBuilderDsl() {
    }

    public static TypeChangeLabelActionQueryBuilderDsl of() {
        return new TypeChangeLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeLabelActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TypeChangeLabelActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeLabelActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TypeChangeLabelActionQueryBuilderDsl> label(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("label"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TypeChangeLabelActionQueryBuilderDsl::of);
    }
    
    
}
