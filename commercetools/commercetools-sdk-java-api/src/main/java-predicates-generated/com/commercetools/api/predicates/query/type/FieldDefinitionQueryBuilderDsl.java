package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class FieldDefinitionQueryBuilderDsl  {
    public FieldDefinitionQueryBuilderDsl() {
    }

    public static FieldDefinitionQueryBuilderDsl of() {
        return new FieldDefinitionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<FieldDefinitionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.FieldTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldTypeQueryBuilderDsl.of())),
            FieldDefinitionQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<FieldDefinitionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, FieldDefinitionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<FieldDefinitionQueryBuilderDsl> label(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("label"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            FieldDefinitionQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<FieldDefinitionQueryBuilderDsl> required() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("required")),
        p -> new CombinationQueryPredicate<>(p, FieldDefinitionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<FieldDefinitionQueryBuilderDsl> inputHint() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inputHint")),
        p -> new CombinationQueryPredicate<>(p, FieldDefinitionQueryBuilderDsl::of));
    }
    
}
