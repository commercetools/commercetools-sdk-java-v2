package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomFieldsQueryBuilderDsl  {
    public CustomFieldsQueryBuilderDsl() {
    }

    public static CustomFieldsQueryBuilderDsl of() {
        return new CustomFieldsQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomFieldsQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeReferenceQueryBuilderDsl.of())),
            CustomFieldsQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CustomFieldsQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CustomFieldsQueryBuilderDsl::of);
    }
    
    
}
