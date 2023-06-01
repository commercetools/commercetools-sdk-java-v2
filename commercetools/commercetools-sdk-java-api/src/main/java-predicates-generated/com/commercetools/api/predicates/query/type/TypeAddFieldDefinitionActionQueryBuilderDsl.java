package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TypeAddFieldDefinitionActionQueryBuilderDsl  {
    public TypeAddFieldDefinitionActionQueryBuilderDsl() {
    }

    public static TypeAddFieldDefinitionActionQueryBuilderDsl of() {
        return new TypeAddFieldDefinitionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeAddFieldDefinitionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TypeAddFieldDefinitionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TypeAddFieldDefinitionActionQueryBuilderDsl> fieldDefinition(
        Function<com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fieldDefinition"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl.of())),
            TypeAddFieldDefinitionActionQueryBuilderDsl::of);
    }
    
    
}
