package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeNestedTypeQueryBuilderDsl  {
    public AttributeNestedTypeQueryBuilderDsl() {
    }

    public static AttributeNestedTypeQueryBuilderDsl of() {
        return new AttributeNestedTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeNestedTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AttributeNestedTypeQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AttributeNestedTypeQueryBuilderDsl> typeReference(
        Function<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("typeReference"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl.of())),
            AttributeNestedTypeQueryBuilderDsl::of);
    }
    
    
}
