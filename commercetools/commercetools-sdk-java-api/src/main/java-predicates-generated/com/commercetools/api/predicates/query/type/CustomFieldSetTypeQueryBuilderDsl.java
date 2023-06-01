package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomFieldSetTypeQueryBuilderDsl  {
    public CustomFieldSetTypeQueryBuilderDsl() {
    }

    public static CustomFieldSetTypeQueryBuilderDsl of() {
        return new CustomFieldSetTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldSetTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CustomFieldSetTypeQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomFieldSetTypeQueryBuilderDsl> elementType(
        Function<com.commercetools.api.predicates.query.type.FieldTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("elementType"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldTypeQueryBuilderDsl.of())),
            CustomFieldSetTypeQueryBuilderDsl::of);
    }
    
    
}
